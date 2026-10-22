/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entite;

import java.util.Date;

/**
 *
 * @author tkossi
 */
public class Employe extends Personne {
    
    private Date dateNaissance;
    
    public Employe () {
        super();
    }
    
    public Employe (long id, String nom, String prenom, Date dateNaissance) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaissance;
    }
    
    public Date getDateNaissance () {
        return dateNaissance;
    }
    
    public void setDateNaissance () {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + "dateNaissance=" + dateNaissance + '}';
    }
    
}
