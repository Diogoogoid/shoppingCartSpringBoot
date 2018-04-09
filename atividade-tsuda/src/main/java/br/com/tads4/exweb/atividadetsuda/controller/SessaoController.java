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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author diogo.felix
 */
@Controller
@RequestMapping("/sessao")
@Scope("session")
public class SessaoController implements Serializable{
    private int prodId = 0;
    
    @GetMapping
    public ModelAndView mostrarTela() {
        System.out.println("Sessao get");
        return new ModelAndView("product_summary");
        //ModelAndView resposta = new ModelAndView("product_details");
        //return resposta;
    }
    
    @PostMapping
    public ModelAndView obtendoIdProduto(
            @ModelAttribute("prodId") int prodId
    ){
        System.out.println("entrou no post");
        this.prodId = prodId;
        return new ModelAndView("/sessao"); 
    }
    
}
