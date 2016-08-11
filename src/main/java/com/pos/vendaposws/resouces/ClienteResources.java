/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Junior
 */
@Path("cliente")
@Produces(MediaType.APPLICATION_XML)
public class ClienteResources {
    
    /**
     *
     * @param cliente
     */
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addCliente(@FormParam("produto") Cliente cliente){
        // add cliente no banco
        return Response.ok(cliente).build();
    }
    @DELETE
    @Path("{id}")
    public Response delCliente(@PathParam("id") long id){
        Cliente cliente = new Cliente();
    // recupere o cliente e retorne a interface;    
    // remover cliente no banco
        return Response.ok(cliente).build();
    }
    @GET
    public Response listar(){
        List<Cliente> clientes = new ArrayList<>();
        // recupere a lista de clientes
        GenericEntity<List<Cliente>> gClientes = new GenericEntity<>(clientes,Cliente.class);
        return Response.ok( gClientes).build();
    }
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response atualizarCliente(Cliente cliente){
        // merge cliente no banco
        return Response.ok(cliente).build();
    }
    


}
