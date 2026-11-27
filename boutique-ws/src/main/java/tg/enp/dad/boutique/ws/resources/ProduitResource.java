/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.enp.dad.boutique.ws.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
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
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response ajouter(Produit p) {
        this.service.ajouter(p);
        return Response.ok()
                .build();
    }
    
    @PUT
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response modifier(Produit p) {
        this.service.modifier(p);
        return Response.ok()
                .build();
    }
    
    @Path("/{id}")
    @DELETE
    public void supprimer(@PathParam("id") Long id) {
        this.service.supprimer(id);
    }
    
    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response trouver(@PathParam("id") Long id) {
        Produit p = this.service.trouver(id);
        if (p == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .build();
        }
        return Response.ok()
                .entity(p)
                .build();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Produit> lister() {
        return this.service.lister();
    }
    
    @GET
    @Path("/compter")
    public int compter() {
        return this.service.compter();
    }
    
}
