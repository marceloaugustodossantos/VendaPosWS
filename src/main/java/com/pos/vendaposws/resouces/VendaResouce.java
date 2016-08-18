/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Venda;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author marcelo
 */
@Path("venda")
public class VendaResouce {
    
    VendaService vendaService  = new VendaService();
    
    @PUT
    @Path("{idVenda}/produto/{idProduto}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addProduto(
            @PathParam("idVenda") int idVenda, 
            @PathParam("idProduto") int idProduto){
        
        Venda venda = vendaService.addProduto(idVenda, idProduto);
        return Response.ok(venda).build();
    }
    
}
