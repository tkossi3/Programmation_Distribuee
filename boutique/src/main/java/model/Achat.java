/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author tkossi
 */
public class Achat implements Serializable {

    private long id;
    private LocalDateTime dateAchat;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> produitAchetes = new ArrayList<>();

    public Achat() {

    }

    public Achat(long id, LocalDateTime dateAchat, double remise, Client client, Employe employe, List<ProduitAchete> produitAchetes) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.client = client;
        this.employe = employe;
        if (produitAchetes != null) {
            this.produitAchetes = produitAchetes;
        }
    }

    public double getRemiseTotal() {
        double totalRemise = this.remise;
        for (ProduitAchete pa : produitAchetes) {
            if (pa.getProduit() != null) {
                totalRemise += pa.getRemise();
            }
        }
        return totalRemise;
    }

    public double getTotalAPayer() {
        double total = 0.0;
        for (ProduitAchete pa : produitAchetes) {
            if (pa.getProduit() != null) {
                total += pa.getProduit().getPrixUnitaire();
            }
        }
        return total - this.getRemiseTotal();
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getDateAchat() {
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

    public void setDateAchat(LocalDateTime dateAchat) {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
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
