/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Produto;
import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author marcelo
 */
@Path("produto")
public class ProdutoResources {
    
    @POST
    public Response adicionar(@BeanParam Produto produto){
        
        return Response.ok(produto).build();
    }
    
    
}
