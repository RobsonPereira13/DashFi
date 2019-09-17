/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import business.ValorBusiness;
import dao.ValorDao;
import exceptions.BusinessException;
import util.StatusRetorno;
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
@Path("valor")
public class ValorWs {
    
    private StatusRetorno sr = new StatusRetorno();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ValorWs
     */
    public ValorWs() {
    }

    /**
     * Retrieves representation of an instance of service.ValorWs
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/text")
    public String getJson() {
       return "Teste";
    }
     @GET
    @Produces("application/json")
    @Path("Valor/get/{id}")
    public String getValor(@PathParam("id") Integer id) throws BusinessException
    {
        Valor v = new Valor();
        v.setId(id);
        
         ValorBusiness business = new ValorBusiness();
         v = business.Buscar(id);
       
        //Converter para Gson
        
        return "funcionando";
    }
 @GET
    @Produces("application/json")
    @Path("Valor/list")
    public String listValor() throws BusinessException
    {
        List<Valor> lista;
        
        ValorBusiness business = new ValorBusiness();
        lista = business.listar();
        
        //Converter para Gson
        
        return "";
    }
     @POST
    @Consumes({"application/json"})
    @Path("Valor/inserir")
public StatusRetorno inserir(String content) throws BusinessException{
     
    
        ValorBusiness business = new ValorBusiness(); 
        try{
            
           // business.incluir(v);
            sr.setStatus("ok");
	    sr.setMensagem("Valor incluido com sucesso.");        
        
        } catch (Exception e){
        sr.setStatus("erro");
        sr.setMensagem("Não foi possivel incluir o Valor." + e.getMessage());
        }
        return sr;
}
    /**
     * PUT method for updating or creating an instance of ValorWs
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     * @throws exceptions.BusinessException
     */
   @PUT
    @Consumes("application/json")
    @Path("Valor/alterar")
    public StatusRetorno alterar(String content) throws BusinessException {
       // Gson g = new Gson();
        //Valor v = (Valor) g.fromJson(content, Valor.class);
         ValorBusiness business = new  ValorBusiness();  
        try{
            
          //  business.alterar(v);
            sr.setStatus("ok");
	    sr.setMensagem("Valor incluido com sucesso.");        
        
        } catch (Exception e){
        sr.setStatus("erro");
        sr.setMensagem("Não foi possivel incluir o Valor." + e.getMessage());
        }
        return sr;
    }
    
      @DELETE
   @Path("Valor/excluir/{id}")
    public StatusRetorno excluir(@PathParam("id") Integer id) throws BusinessException{    
        
        
       ValorBusiness business = new  ValorBusiness();  
        try{
            business.excluir(id);
            sr.setStatus("ok");
	    sr.setMensagem("Valor excluido com sucesso.");        
        
        } catch (Exception e){
        sr.setStatus("erro");
        sr.setMensagem("Não foi possivel excluir o Valor." + e.getMessage());
        }
        return sr;
    }
}
