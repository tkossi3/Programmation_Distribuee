/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.enp.dad.dad1.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

/**
 *
 * @author tkossi
 */
@Path("/hello")
public class HelloResource {
    
    @GET
    public String saluer(@QueryParam("n")String nom, @QueryParam("p")String prenom) {
        return "Bonjour " + nom + " " + prenom + ", je suis Kossivi Tine.";
    }
    
}
