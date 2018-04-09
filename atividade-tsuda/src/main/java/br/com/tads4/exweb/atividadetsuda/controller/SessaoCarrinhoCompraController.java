/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tads4.exweb.atividadetsuda.controller;

import java.io.Serializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author diogo
 */
@Controller
@RequestMapping("/summary")
@Scope("session")
public class SessaoCarrinhoCompraController implements Serializable{
    private int idProd = 0;
    
    @GetMapping
    public ModelAndView mostrarTela() {
        System.out.println("Sessao get");
        return new ModelAndView("product_summary");
    }
    
    @PostMapping
    public ModelAndView obtendoIdProduto(
            @ModelAttribute("idProd") int idProd 
    ){
        System.out.println("Sessao post");
        this.idProd = idProd;
        return new ModelAndView("/summary");
        
        
    }
    
}
