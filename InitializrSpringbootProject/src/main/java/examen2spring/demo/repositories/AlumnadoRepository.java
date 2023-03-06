/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen2spring.demo.repositories;

import examen2spring.demo.models.Alumnado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author norri
 */
public interface AlumnadoRepository extends JpaRepository<Alumnado, Long>{
    
}
