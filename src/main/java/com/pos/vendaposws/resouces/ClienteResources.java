/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addCliente(@BeanParam Cliente cliente){
        List<Cliente> clientes = this.getClientes();
        clientes.add(cliente);
        GenericEntity<List<Cliente>> gClientes;
        gClientes = new GenericEntity<List<Cliente>>(clientes){};
        return Response.ok(gClientes).build();
    }
    
    @DELETE
    @Path("{id}")
    public Response delCliente(@PathParam("id") long id){
        List<Cliente> clientes = this.getClientes();
        Cliente cliente = clientes.get((int) (id-1));
        clientes.remove(cliente);
        GenericEntity<List<Cliente>> gClientes;
        gClientes = new GenericEntity<List<Cliente>>(clientes){};
        return Response.ok(gClientes).build();
    }
    
    @GET
    public Response listar(){
        List<Cliente> clientes = this.getClientes();
        // recupere a lista de clientes
        GenericEntity<List<Cliente>> gClientes;
        gClientes = new GenericEntity<List<Cliente>>(clientes){};
        return Response.ok(gClientes).build();
    }
    
    private List<Cliente> getClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente(1, "Antonio"));
        clientes.add(new Cliente(2, "Marcelo"));
        clientes.add(new Cliente(3, "Cleonte"));
        clientes.add(new Cliente(4, "Ricardo"));
        return clientes;
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response atualizarCliente(Cliente cliente){
        // merge cliente no banco
        return Response.ok(cliente).build();
    }
    


}
