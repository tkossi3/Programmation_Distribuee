/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import model.Categorie;
import model.Produit;

/**
 *
 * @author tkossi
 */
public class ProduitService {
    
    private static List<Produit> listesProduits;
    private static ProduitService instance;
    
    private ProduitService() {
        this.listesProduits = new ArrayList<>();
    }
    
    public static synchronized ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }
    
    public void ajouter(Produit produit) {
        listesProduits.add(produit);
    }
    
    public Produit modifier(long id, String libelle, double prixUnitaire, LocalDate datePeremtion, Categorie categorie) {
        Produit produit = trouver(id);
        if (produit != null) {
            produit.setLibelle(libelle);
            produit.setPrixUnitaire(prixUnitaire);
            produit.setDatePeremtion(datePeremtion);
            produit.setCategorie(categorie);
        }
        return produit;
    }
    
    public void modifier(Produit produit) {
        if (produit != null) {
            int index = this.listesProduits.indexOf(produit);
            if (index != -1) {
                this.listesProduits.set(index, produit);
            }
            System.out.println(produit);
        }
    }
    
    public Produit trouver(long id) {
        Produit produit = new Produit();
        try {
            for (Produit p : listesProduits) {
                if (p.getId() == id) {
                    produit = p;
                }
            }
        } catch(Exception ex) {
            System.out.println("Produit non trouvé");
        }
        return produit;
    }
    
    public void supprimer(long id) {
        Produit produit = trouver(id);
        if (produit != null) {
            listesProduits.remove(produit);
        }
    }
    
    public void supprimer(Produit produit) {
        listesProduits.remove(produit);
    }
    
    public int compter() {
        int sum = 0;
        for (Produit p : listesProduits) {
            sum += 1;
        }
        return listesProduits.size();
    }
    
//    public void lister() {
//        for (Produit p : listesProduits) {
//            System.out.println(p);
//        }
//    }
    
    public List<Produit> lister() {
        return this.listesProduits;
    }
    
    public List<Produit> listerPerimes() {
        List<Produit> listeProduitsPerimes = new LinkedList<>();
        for (Produit p : listesProduits) {
            if (p.estPerime()) {
                listeProduitsPerimes.add(p);
            }
        }
        return listeProduitsPerimes;
    }
    
}
