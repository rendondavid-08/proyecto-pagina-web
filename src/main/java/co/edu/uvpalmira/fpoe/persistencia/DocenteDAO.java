/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistencia;

import co.edu.uvpalmira.fpoe.jpalib.AbstractDAO;
import co.edu.uvpalmira.fpoe.modelo.Docente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

/**
 *
 * @author DavidRendon
 */
public class DocenteDAO extends AbstractDAO<Docente>{
    
    public DocenteDAO(EntityManagerFactory emf) {
        super(Docente.class, emf);
    }
    
    public Docente buscarPorNuip (String nuip) {
        EntityManager em =super.getEntityManager() ;
        return (Docente) em.createNamedQuery("Docente.buscarNuip")
                .setParameter("nuip", nuip).getSingleResult();
    }
    
}