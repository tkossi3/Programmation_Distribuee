/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import model.Categorie;

/**
 *
 * @author tkossi
 */
public class CategorieService {
    
    private static List<Categorie> listesCategories;
    private static CategorieService instance;
    
    private CategorieService() {
        
    }
    
    public static synchronized CategorieService getInstance() {
        if (instance == null) {
            instance = new CategorieService();
            listesCategories = new ArrayList<>();
        }
        return instance;
    }
    
    public void ajouter(Categorie categorie) {
        listesCategories.add(categorie);
    }
    
    public Categorie modifier(Integer id, String libelle, String description) {
        Categorie categorie = trouver(id);
        if (categorie != null) {
            categorie.setLibelle(libelle);
            categorie.setDescription(description);
            
        }
        return categorie;
    }
    
    public Categorie trouver(Integer id) {
        Categorie categorie = new Categorie();
        try {
            for (Categorie c : listesCategories) {
                if (c.getID()== id) {
                    categorie = c;
                }
            }
        } catch(Exception ex) {
            System.out.println("Categorie non trouvé");
        }
        return categorie;
    }
    
    public void supprimer(Integer id) {
        Categorie categorie = trouver(id);
        listesCategories.remove(categorie);
    }
    
    public void supprimer(Categorie categorie) {
        listesCategories.remove(categorie);
    }
    
    public int compter() {
        int sum = 0;
        for (Categorie c : listesCategories) {
            sum += 1;
        }
        return listesCategories.size();
    }
    
    public List<Categorie> lister() {
        return listesCategories;
    }
    
}
