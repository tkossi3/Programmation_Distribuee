/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

/**
 *
 * @author tkossi
 */
public class Categorie {
    
    private Integer id;
    private String libelle;
    private String description;
    
    public Integer getID () {
        return id;
    }
    
    public String getLibelle () {
        return libelle;
    }
    
    public String getDescription () {
        return description;
    }
    
    public void setId ( Integer id ) {
        this.id = id;
    }
    
    public void setLibelle ( String libelle ) {
        this.libelle = libelle;
    }
    
    public void setDescription ( String description ) {
        this.description = description;
    }
    
}
