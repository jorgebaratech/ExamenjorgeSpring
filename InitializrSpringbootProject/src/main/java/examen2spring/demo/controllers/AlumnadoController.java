/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2spring.demo.controllers;

import examen2spring.demo.models.Alumnado;
import examen2spring.demo.repositories.AlumnadoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author norri
 */

@RestController
@RequestMapping("/Alumnado")
public class AlumnadoController {
    @Autowired
    AlumnadoRepository repo;
    @GetMapping()
     public List<Alumnado> list() {
        return repo.findAll();
    }
      @GetMapping("/{id}")
    public ResponseEntity <Alumnado>get(@PathVariable Long id) {
        if(repo.existsById(id)){
            return new ResponseEntity<Alumnado>(repo.findById(id).get(),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        

        
                
    }
     @GetMapping("/Alumnado/suspensos/{modulo}")
public ResponseEntity<List<Alumnado>> getAlumnosSuspensos(@PathVariable String modulo) {
    List<Alumnado> alumnosSuspensos = repo.findAll().stream()
            .filter(alumnado -> alumnado.getCalificacion(modulo).equals("<5"))
            .collect(Collectors.toList());

    if(alumnosSuspensos.isEmpty()){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }else{
        return new ResponseEntity<>(alumnosSuspensos, HttpStatus.OK);
    }
}


    
    
}
