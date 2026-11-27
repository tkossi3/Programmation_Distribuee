/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.enp.dad.boutique.ws;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tkossi
 */
@Provider
public class AppExceptionMapper implements ExceptionMapper<Exception> {
    
    private static final Logger LOGGER = Logger.getLogger(AppExceptionMapper.class.getName());
    
    @Override
    public Response toResponse(Exception e) {
        LOGGER.log(Level.SEVERE, e.getMessage(), e);
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(e)
                .type(MediaType.TEXT_PLAIN)
                .build();
    }
    
}
