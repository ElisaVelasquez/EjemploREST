/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package ws;

import entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Dianey Elisa Velasquez Busani
 */
@Path("producto")
public class ProductoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Producto
     */
    public ProductoResource() {
    }

    /**
     * Retrieves representation of an instance of ws.ProductoResource
     * @return an instance of entidades.ProductoResource
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson() {
        List<Producto> productos = new ArrayList<>();
        Producto p1 = new Producto();
        p1.setId(1);
        p1.setNombre("Algo");
        productos.add(p1);
        productos.toArray();
        
        productos.add(new Producto(2,"Producto2"));
        
        Producto[] productosArray;
        
        productosArray=productos.toArray(new Producto[0]);
        
        return Response.status(Response.Status.OK).entity(productosArray).build();   
    }

    /**
     * PUT method for updating or creating an instance of ProductoResource
     * @param content representation for the resource
     
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(entidades.Producto content) {
		
    }*/
}
