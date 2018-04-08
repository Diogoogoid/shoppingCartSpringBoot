/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tads4.exweb.atividadetsuda.controller;

import br.com.tads4.exweb.atividadetsuda.*;
import br.com.tads4.exweb.atividadetsuda.entity.Produto;
import br.com.tads4.exweb.atividadetsuda.service.fakeimpl.ProdutoServiceFakeImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author diogo.sfelix
 */
@Controller
@RequestMapping("/details")
public class DetalhesController {
    
    @GetMapping
    public ModelAndView summary(
            @RequestParam(value = "id") int id
    ){
        ProdutoServiceFakeImpl prod = new ProdutoServiceFakeImpl();
        
        Produto produto = prod.obter(id);
        
        ModelAndView resposta = new ModelAndView("product_details");
        resposta.addObject("prod", produto);
        
        return resposta;
    }
}
