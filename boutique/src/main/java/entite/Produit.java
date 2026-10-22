/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.util.Date;

/**
 *
 * @author tkossi
 */
public class Produit {
    
    private long id;
    private String libelle;
    private double prixUnitaire;
    private Date datePeremtion;
    private Categorie categorie;
    
    public Produit () {
        
    }
    
    public Produit (long id, String libelle, double prixUnitaire, Date datePeremtion, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.categorie = categorie;
    }
    
    public long getId () {
        return id;
    }
    
    public String getLibelle () {
        return libelle;
    }
    
    public double getPrixUnitaire () {
        return prixUnitaire;
    }
    
    public Date getDatePeremtion () {
        return datePeremtion;
    }
    
    public Categorie getCategorie () {
        return categorie;
    }
    
    public void setId (long id) {
        this.id = id;
    }
    
    public void setLibelle (String libelle) {
        this.libelle = libelle;
    }
    
    public void setPrixUnitaire (double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    
    public void setDatePeremtion (Date datePeremtion) {
        this.datePeremtion = datePeremtion;
    }
    
    public void setCategorie (Categorie categorie) {
        this.categorie = categorie;
    }
    
}
