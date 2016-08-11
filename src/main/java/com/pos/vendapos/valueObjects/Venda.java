/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendapos.valueObjects;

import java.util.List;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Junior
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    @FormParam("id")
    private long id;
    @FormParam("valor")
    private double valor;
    @FormParam("cliente")
    private Cliente cliente;
    private List<Produto> produtos;
    
    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public void remProduto(Produto produto){
        this.produtos.remove(produto);
    }
}
