/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.validation.constraints.NotEmpty;

/**
 *
 * @author DavidRendon
 */
@Entity
@NamedQueries({
    @NamedQuery (name= "Docente.buscarNuip",
           query = "SELECT d FROM Docente d WHERE d.nuip = :nuip" ) ,
})

public class Docente extends Persona {
    
    @NotEmpty
    @Column (nullable = false, length = 60)
    String profesion;

    public Docente() {
    }

    public Docente(String profesion, String nuip, String nombre, String apellido) {
        super(nuip, nombre, apellido);
        this.profesion = profesion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }    
    
}
