package br.com.tads4.exweb.atividadetsuda.controller;

import br.com.tads4.exweb.atividadetsuda.entity.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.tads4.exweb.atividadetsuda.service.fakeimpl.ProdutoServiceFakeImpl;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author diogo.sfelix
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView index(){
        ProdutoServiceFakeImpl produtoService = new ProdutoServiceFakeImpl();
        
        List<Produto> produtos = produtoService.listar(0, 0);
        ModelAndView resposta = new ModelAndView("index");
        resposta.addObject("produtos", produtos);

        return resposta;
    }
}
