/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.modelo;

import co.edu.uvpalmira.fpoe.jpalib.AbstractEntity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotEmpty;

/**
 *
 * @author DavidRendon
 */

@MappedSuperclass
public class Persona extends AbstractEntity {
    @NotEmpty
    @Column(nullable = false, unique = true, length = 20)
    String nuip ;
    
    @NotEmpty
    @Column(nullable = false, length = 60)
    String nombre;
    
    @NotEmpty
    @Column(nullable = false, length = 60)
    String apellido;

    public Persona() {
    }

    public Persona(String nuip, String nombre, String apellido) {
        this.nuip = nuip;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNuip() {
        return nuip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNuip(String nuip) {
        this.nuip = nuip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
