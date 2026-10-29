/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tkossi
 */
public class Achat implements Serializable{
    
    private long id;
    private LocalDate dateAchat;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> produitAchetes = new ArrayList<>();
    
    public Achat() {
        
    }
    
    public Achat(long id, LocalDate dateAchat, double remise, Client client, Employe employe, List<ProduitAchete> produitAchetes) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.client = client;
        this.employe = employe;
        if (produitAchetes != null) {
            this.produitAchetes = produitAchetes;
        }
    }
    
    public long getId() {
        return id;
    }
    
    public LocalDate getDateAchat() {
        return dateAchat;
    }
    
    public double getRemise() {
        return remise;
    }
    
    public Client getClient() {
        return client;
    }
    
    public Employe getEmploye() {
        return employe;
    }
    
    public List<ProduitAchete> getProduitAchetes() {
        return produitAchetes;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }
    
    public void setRemise(Double remise) {
        this.remise = remise;
    }
    
    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
    
    public void setProduitsAchetes(List<ProduitAchete> produitAchetes) {
        this.produitAchetes = produitAchetes;
    }
    
    public void setClient(Client client) {
        this.client = client;
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
