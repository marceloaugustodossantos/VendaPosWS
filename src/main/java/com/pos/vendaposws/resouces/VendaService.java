/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendaposws.resouces;

import com.pos.vendapos.valueObjects.Cliente;
import com.pos.vendapos.valueObjects.Produto;
import com.pos.vendapos.valueObjects.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class VendaService {

    public Venda addProduto(int idVenda, int idProduto) {
        List<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto(idProduto, "produto x", 2211));        
        return new Venda(idVenda, 0, new Cliente(1, "João"), produtos);
    }
    
}
