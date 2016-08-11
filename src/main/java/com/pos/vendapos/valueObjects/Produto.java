/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendapos.valueObjects;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marcelo
 */
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    
    @FormParam("id")
    private long id;
    @FormParam("descricao")
    private String nome;
    @FormParam("valor")
    private double valor;   
    
    
}
