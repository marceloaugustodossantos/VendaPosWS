/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.vendapos.valueObjects;

import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author marcelo
 */
@XmlRootElement
@Data
public class Produto {
    
    @FormParam("id")
    private long id;
    @FormParam("descricao")
    private String descricao;
    @FormParam("valor")
    private double valor;
    
    
    
}
