/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.enp.dad.boutique.ws.resources;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.time.LocalDate;
import java.util.List;
import tg.enp.dad.boutique.Produit;
import tg.enp.dad.boutique.service.ProduitService;

/**
 *
 * @author tkossi
 */
@Path("/produit")
public class ProduitResource {
    
    private ProduitService service = ProduitService.getInstance();
    
    @POST
    public void ajouterProduit(@FormParam("id") long id, @FormParam("libelle") String libelle,
            @FormParam("prixUnitaire") double prixUnitaire, @FormParam("datePeremption") LocalDate datePeremption) {
        Produit p = new Produit(id, libelle, prixUnitaire, datePeremption);
        this.ajouter(p);
    }
    public void ajouter(Produit p) {
        this.service.ajouter(p);
    }
    
    @PUT
    public void modifier(Produit p) {
        this.service.modifier(p);
    }
    
    @DELETE
    public void supprimer(Long id) {
        this.service.supprimer(id);
    }
    
    @GET
    @Path("/id/{id}")
    public Produit trouver(Long id) {
        return this.service.trouver(id);
    }
    
    @GET
    public List<Produit> lister() {
        return this.service.lister();
    }
    
    @GET
    @Path("/compter")
    public int compter() {
        return this.service.compter();
    }
    
}
