/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Achat;
import model.Produit;
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
    
    public ProduitAchete creerProduitAchete(long idProduit, long idAchat, double remise){
        Produit produit =  ProduitService.getInstance().trouver(idProduit);
        Achat achat = AchatService.getInstance().trouver(idAchat);
        ProduitAchete produitAchete = new ProduitAchete(remise, produit, achat);
        return produitAchete;
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
    
    public ProduitAchete trouver(long idProduit, long idAchat) {
        ProduitAchete produitAchete = new ProduitAchete();
        try {
            for (ProduitAchete p : listesProduitAchetes) {
                if (p.getProduit().getId() == idProduit && p.getAchat().getId() == idAchat) {
                    produitAchete = p;
                }
            }
        } catch(Exception ex) {
            System.out.println("ProduitAchete non trouvé");
        }
        return produitAchete;
    }
    
    public void supprimer(long idProduit, long idAchat) {
        ProduitAchete produitAchete = trouver(idProduit, idAchat);
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
