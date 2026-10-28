/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Employe;

/**
 *
 * @author tkossi
 */
public class EmployeService {
    
    private static List<Employe> listesEmployes;
    private static EmployeService instance;
    
    private EmployeService() {
        
    }
    
    public static synchronized EmployeService getInstance() {
        if (instance == null) {
            instance = new EmployeService();
            listesEmployes = new ArrayList<>();
        }
        return instance;
    }
    
    public void ajouter(Employe employe) {
        listesEmployes.add(employe);
    }
    
    public Employe modifier(long id, String nom, String prenom, LocalDate dateNaissance) {
        Employe employe = trouver(id);
        if (employe != null) {
            employe.setNom(nom);
            employe.setPrenom(prenom);
            employe.setDateNaissance(dateNaissance);
        }
        return employe;
    }
    
    public Employe trouver(long id) {
        Employe employe = new Employe();
        try {
            for (Employe em : listesEmployes) {
                if (em.getId() == id) {
                    employe = em;
                }
            }
        } catch(Exception ex) {
            System.out.println("Employe non trouvé");
        }
        return employe;
    }
    
    public void supprimer(long id) {
        Employe employe = trouver(id);
        listesEmployes.remove(employe);
    }
    
    public void supprimer(Employe employe) {
        listesEmployes.remove(employe);
    }
    
    public int compter() {
        int sum = 0;
        for (Employe em : listesEmployes) {
            sum += 1;
        }
        return sum;
    }
    
    public void lister() {
        for (Employe em : listesEmployes) {
            System.out.println(em);
        }
    }
    
}
