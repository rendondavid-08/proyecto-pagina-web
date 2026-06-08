/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.web;

import co.edu.uvpalmira.fpoe.logica.ILogica;
import co.edu.uvpalmira.fpoe.modelo.Docente;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavidRendon
 */
@SessionScoped
@Named("control")
public class ControladorDocentes implements Serializable {
    Docente docente = new Docente() ;
    
    @Inject
    private ILogica logica ;

    public Docente getDocente() {
        return docente;
    }
    
    public List<Docente> getDocentes() {
        return this.logica.buscarDocentes();
    }
    
    public void guardar () {
        try {
            this.logica.crearDocente(this.docente);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("El docente fue registrado"));
            this.docente = new Docente() ;
        } catch (SQLIntegrityConstraintViolationException ex ){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error de restricciones", ex.getLocalizedMessage()));
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Error de restricciones", ex.getLocalizedMessage()));
            Logger.getLogger(ControladorDocentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cancelar () {
        this.docente = new Docente();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Proceso cancelado"));
    }
    
}
