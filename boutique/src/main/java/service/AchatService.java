/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Achat;
import model.Client;
import model.Employe;
import model.ProduitAchete;

/**
 *
 * @author tkossi
 */
public class AchatService {
    
    private static List<Achat> listesAchats;
    private static AchatService instance;
    
    private AchatService() {
        
    }
    
    public static synchronized AchatService getInstance() {
        if (instance == null) {
            instance = new AchatService();
            listesAchats = new ArrayList<>();
        }
        return instance;
    }
    
    public void ajouter(Achat achat) {
        listesAchats.add(achat);
    }
    
    public Achat modifier(long id, LocalDate dateAchat, double remise, Client client, Employe employe, List<ProduitAchete> produitAchetes) {
        Achat achat = trouver(id);
        if (achat != null) {
            achat.setDateAchat(dateAchat);
            achat.setRemise(remise);
            achat.setClient(client);
            achat.setEmploye(employe);
            achat.setProduitsAchetes(produitAchetes);
        }
        return achat;
    }
    
    public Achat trouver(long id) {
        Achat achat = new Achat();
        try {
            for (Achat ac : listesAchats) {
                if (ac.getId() == id) {
                    achat = ac;
                }
            }
        } catch(Exception ex) {
            System.out.println("Achat non trouvé");
        }
        return achat;
    }
    
    public void supprimer(long id) {
        Achat achat = trouver(id);
        listesAchats.remove(achat);
    }
    
    public void supprimer(Achat achat) {
        listesAchats.remove(achat);
    }
    
    public int compter() {
        int sum = 0;
        for (Achat ac : listesAchats) {
            sum += 1;
        }
        return sum;
    }
    
    public void lister() {
        for (Achat ac : listesAchats) {
            System.out.println(ac);
        }
    }
    
}
