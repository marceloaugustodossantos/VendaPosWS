/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Produto;
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
 * @author marcelo
 */
@Path("produto")
@Produces(MediaType.APPLICATION_XML)
public class ProdutoResources {

    List<Produto> produtos = new ArrayList<>();

    public ProdutoResources() {
        produtos.add(new Produto(0, "Feijão", 10));
        produtos.add(new Produto(0, "Arroz", 6));
        produtos.add(new Produto(0, "Farinha", 2));
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response adicionar(@BeanParam Produto produto) {

        return Response.ok(produto).build();
    }

    @GET
    public Response listarProdutos() {
        // listar produtos no banco e retornar

        GenericEntity<List<Produto>> entity = new GenericEntity<List<Produto>>(produtos) {
        };
        return Response.ok(entity).build();
    }

    @DELETE
    @Path("{id}")
    public Response removerProduto(@PathParam("id") long id) {
        Produto produto = new Produto(0, "", 1);

        // pesquisar produto no banco e remover
        return Response.ok(produto).build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response atualizarProduto(Produto produto) {

        return Response.ok(produto).build();
    }

}
