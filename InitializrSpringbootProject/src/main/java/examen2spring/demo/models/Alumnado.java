/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2spring.demo.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author norri
 */


@Data
@Entity
@Table(name="alumnado")

public class Alumnado implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
      @Column(name = "nombre")
       private String nombre;
      @Column(name = "telefono")
       private String telefono;
      @Column(name = "email")
       private String email;
      @Column(name = "ad")
       private Integer ad;
        @Column(name = "di")
       private Integer di;

    public Object getCalificacion(String modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
      
}
