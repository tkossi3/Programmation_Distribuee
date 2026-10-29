/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author tkossi
 */
public class Categorie implements Serializable {
    
    private Integer id;
    private String libelle;
    private String description;
    
    public Categorie() {
        
    }
    
    public Categorie(Integer id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }
    
    public Integer getID() {
        return id;
    }
    
    public String getLibelle() {
        return libelle;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
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
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Categorie other = (Categorie) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Categorie{" + "id=" + id + ", libelle=" + libelle + ", description=" + description + '}';
    }
    
}
