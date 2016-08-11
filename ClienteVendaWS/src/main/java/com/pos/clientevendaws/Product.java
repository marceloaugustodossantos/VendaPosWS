/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.clientevendaws;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author marcelo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "produto")
public class Product {
    
    private long id;
    private String nome;
    private double valor;  
    
}
