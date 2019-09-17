/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;


import dao.ValorDao;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import modelo.Valor;

/**
 * REST Web Service
 *
 * @author robso
 */
@Path("card")
public class CardWs {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CardWs
     */
    public CardWs() {
    }

    /**
     * Retrieves representation of an instance of service.CardWs
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/text")
    public String getJson() {
      return "teste";
    }
  @GET
    @Produces("application/json")
    @Path("Valor/get/{id}")
    public String getValor(@PathParam("id") Integer id)
    {
      
        return "funcionando";
    }
 @GET
    @Produces("application/json")
    @Path("Valor/list")
    public String listValor()
    {
      
        return "funcionando";
    }
     @POST
    @Consumes({"application/json"})
    @Path("Valor/inserir")
public boolean inserir(String content){
    
        return true;
}
    /**
     * PUT method for updating or creating an instance of ValorWs
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
   @PUT
    @Consumes("application/json")
    @Path("Valor/alterar")
    public void alterar(String content) {
      
    }
      @DELETE
   @Path("Valor/excluir/{id}")
    public boolean excluir(@PathParam("id") Integer id)
    {    
       
        return true;
    }
}
