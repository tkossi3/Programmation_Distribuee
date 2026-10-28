/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boutique;

import model.Categorie;
import service.CategorieService;


/**
 *
 * @author tkossi
 */
public class Boutique {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        CategorieService categorie = CategorieService.getInstance();
        Categorie cat = new Categorie(1, "Fruits", "Les belles fruits.");
        Categorie cat2 = new Categorie(2, "Legumes", "Les légumes du champs.");
        
        
        categorie.ajouter(cat);
        categorie.ajouter(cat2);
        System.out.println("Categorie compte " + categorie.compter() + " élement(s).");
        categorie.lister();
        categorie.supprimer(cat2);
        categorie.lister();
    }
}
