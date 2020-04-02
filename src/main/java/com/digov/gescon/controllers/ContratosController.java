package com.digov.gescon.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.digov.gescon.models.Contratos;
import com.digov.gescon.repository.ContratoRepository;

@Controller
public class ContratosController {
	
	@Autowired
	private ContratoRepository cr;
	
	@RequestMapping(value="/CadastrarContrato", method=RequestMethod.GET)
	public String form() {
		return "contratos/formContrato";
	}
	
	@RequestMapping(value="/CadastrarContrato", method=RequestMethod.POST)
	public String form(Contratos contrato) {
		
		cr.save(contrato);
		
		return "redirect:/CadastrarContrato";
	}

}
