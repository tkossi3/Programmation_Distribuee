/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tkossi
 */
public class Achat {
    
    private long id;
    private Date dateAchat;
    private double remise;
    private Client client;
    private Employe employe;
    private List<Produit> produitAchetes = new ArrayList<>();
    
    public Achat () {
        
    }
    
    public Achat (long id, Date dateAchat, double remise, Client client, Employe employe, List<Produit> produitAchetes) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.client = client;
        this.employe = employe;
        if (produitAchetes != null) {
            this.produitAchetes = produitAchetes;
        }
    }
    
    private long getId () {
        return id;
    }
    
    private Date getDateAchat () {
        return dateAchat;
    }
    
    private double getRemise () {
        return remise;
    }
    
    private Client getClient () {
        return client;
    }
    
    private Employe getEmploye () {
        return employe;
    }
    
    private List<Produit> getProduitAchetes () {
        return produitAchetes;
    }
    
}
