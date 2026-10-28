/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tkossi
 */
public class Achat implements Serializable{
    
    private long id;
    private Date dateAchat;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> produitAchetes = new ArrayList<>();
    
    public Achat() {
        
    }
    
    public Achat(long id, Date dateAchat, double remise, Client client, Employe employe, List<ProduitAchete> produitAchetes) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.client = client;
        this.employe = employe;
        if (produitAchetes != null) {
            this.produitAchetes = produitAchetes;
        }
    }
    
    private long getId() {
        return id;
    }
    
    private Date getDateAchat() {
        return dateAchat;
    }
    
    private double getRemise() {
        return remise;
    }
    
    private Client getClient() {
        return client;
    }
    
    private Employe getEmploye() {
        return employe;
    }
    
    private List<ProduitAchete> getProduitAchetes() {
        return produitAchetes;
    }
    
    public double getRemiseTotal() {
        double totalRemise = remise;
        if (produitAchetes != null) {
            for (ProduitAchete pa : produitAchetes) {
                totalRemise += pa.getRemise();
            }
        }
        return totalRemise;
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
        final Achat other = (Achat) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Achat{" + "id=" + id + ", dateAchat=" + dateAchat + ", remise=" + remise + ", client=" + client + ", employe=" + employe + ", produitAchetes=" + produitAchetes + '}';
    }
    
}
