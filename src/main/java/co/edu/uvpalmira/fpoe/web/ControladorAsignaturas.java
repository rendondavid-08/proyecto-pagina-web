/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author DavidRendon
 */
@SessionScoped
@Named("control")
public class ControladorAsignaturas implements Serializable {
    Asignatura asignatura = new Asignatura("750014C", "FPOE", (byte)3, (byte)3);

    public Asignatura getAsignatura() {
        return asignatura;
    }
    
}
