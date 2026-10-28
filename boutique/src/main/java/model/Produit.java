/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author tkossi
 */
public class Produit implements Serializable {
    
    private long id;
    private String libelle;
    private double prixUnitaire;
    private LocalDate datePeremtion;
    private Categorie categorie;
    
    public Produit() {
        
    }
    
    public Produit(long id, String libelle, double prixUnitaire, LocalDate datePeremtion, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremtion = datePeremtion;
        this.categorie = categorie;
    }
    
    public long getId() {
        return id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    
    public LocalDate getDatePeremtion() {
        return datePeremtion;
    }
    
    public Categorie getCategorie() {
        return categorie;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
    
    public void setDatePeremtion(LocalDate datePeremtion) {
        this.datePeremtion = datePeremtion;
    }
    
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    public boolean estPerime() {
        return LocalDate.now().isAfter(this.datePeremtion);
    }
    
    public boolean estPerime(LocalDate dateReference) {
        return dateReference.isAfter(this.datePeremtion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produit other = (Produit) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prixUnitaire=" + prixUnitaire + ", datePeremtion=" + datePeremtion + ", categorie=" + categorie + '}';
    }
    
}
