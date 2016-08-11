/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.clientevendaws;

import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author marcelo
 */
public class Principal {
    
    public static void main(String[] args) {
        
//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("http://localhost:8080/VendaPosWS/webresources").path("produto");
//        
//        Response response = target.request(MediaType.APPLICATION_XML).get();
//        
//        GenericType<List<Product>> generic = new GenericType<List<Product>>(){};
//        
//        List<Product> produtos = response.readEntity(generic);
//        
//        for (Product produto : produtos) {
//            System.out.println(produto.toString());
//        }




//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("http://localhost:8080/VendaPosWS/webresources").path("produto");
//        
//        Form formData = new Form();
//        formData.param("id", "0");
//        formData.param("nome", "Macarrão");
//        formData.param("valor", "6");
//        
//        Response response = target.request(MediaType.APPLICATION_XML).post(Entity.form(formData));
//        
//        GenericType<Product> generic = new GenericType<Product>(){};
//        
//        System.out.println(response.readEntity(generic));  



//        Client client = ClientBuilder.newClient();
//        WebTarget target = client.target("http://localhost:8080/VendaPosWS/webresources").path("produto");
//        
//        Product produto = new Product(1, "Teste", 2);
//        Response response = target.request().put(Entity.xml(produto));
//        
//        GenericType<Product> generic = new GenericType<Product>(){};
//        
//        System.out.println(response.readEntity(generic));   
        
        
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080/VendaPosWS/webresources").path("produto").path("{id}");
        
        
        Response response = target.resolveTemplate("id", 0).request().delete();
        
        GenericType<Product> generic = new GenericType<Product>(){};
        
        System.out.println(response.readEntity(generic));   
        
    
    }
       
    
 
}
