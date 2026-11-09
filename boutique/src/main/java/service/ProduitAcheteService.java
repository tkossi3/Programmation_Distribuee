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
import model.ProduitAchete;

/**
 *
 * @author tkossi
 */
public class ProduitAcheteService {
    
    private List<ProduitAchete> listesProduitAchetes;
    private static ProduitAcheteService instance;
    
    private ProduitAcheteService() {
        this.listesProduitAchetes = new ArrayList<>();
    }
    
    public static synchronized ProduitAcheteService getInstance() {
        if (instance == null) {
            instance = new ProduitAcheteService();
        }
        return instance;
    }
    
    public void ajouter(ProduitAchete produitAchete) {
        listesProduitAchetes.add(produitAchete);
    }
    
    public void modifier(ProduitAchete produitAchete) {
        try {
            if (produitAchete != null) {
                int index = this.listesProduitAchetes.indexOf(produitAchete);
                if (index != -1) {
                    this.listesProduitAchetes.set(index, produitAchete);
                }
                System.out.println(produitAchete);
            }
        } catch (Exception ex) {
            System.out.println("ProduitAchete non trouvé !");
        }
    }
    
    public ProduitAchete trouver(long id) {
        ProduitAchete produitAchete = new ProduitAchete();
        try {
            for (ProduitAchete p : listesProduitAchetes) {
                if (p.getId() == id) {
                    produitAchete = p;
                }
            }
        } catch(Exception ex) {
            System.out.println("ProduitAchete non trouvé");
        }
        return produitAchete;
    }
    
    public void supprimer(long id) {
        ProduitAchete produitAchete = trouver(id);
        if (produitAchete != null && this.listesProduitAchetes.contains(produitAchete)) {
            listesProduitAchetes.remove(produitAchete);
        }
    }
    
    public void supprimer(ProduitAchete produitAchete) {
        if (this.listesProduitAchetes.contains(produitAchete)) {
            listesProduitAchetes.remove(produitAchete);
        }
    }
    
    public int compter() {
        return listesProduitAchetes.size();
    }
    
//    public void lister() {
//        for (ProduitAchete p : listesProduitAchetes) {
//            System.out.println(p);
//        }
//    }
    
    public List<ProduitAchete> lister() {
        return this.listesProduitAchetes;
    }
    
}
