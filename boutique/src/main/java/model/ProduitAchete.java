/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tkossi
 */
public class ProduitAchete implements Serializable {
    
    private double remise;
    private Produit produit;
    
    public ProduitAchete() {
        
    }
    
    public ProduitAchete(double remise, Produit produit) {
        this.remise = remise;
        this.produit = produit;
    }
    
    public double getRemise() {
        return remise;
    }
    
    public Produit getProduit() {
        return produit;
    }
    
    public void setRemise(double remise) {
        this.remise = remise;
    }
    
    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "ProduitAchete{" + "remise=" + remise + ", produit=" + produit + '}';
    }
    
}
