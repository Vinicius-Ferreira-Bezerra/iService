package br.com.iservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import br.com.iservice.model.Serviço;
import br.com.iservice.service.ServiceService;

@Controller
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	
	@RequestMapping("/service/listar")
	public ModelAndView listarService() {
		List<Serviço> service = serviceService.listarService();
		//Faz Conecção com o View/front
		ModelAndView MaV = new ModelAndView("PagPrinc");
		
		MaV.addObject("keyPrinc", service);
		return MaV;
	}
	
	@GetMapping("/service/resultado")
	public ModelAndView buscarService(String ref) {
		List<Serviço> service = serviceService.listarService();
		List<Serviço> resultado = new ArrayList<Serviço>();
		
		for (Serviço serv : service) {
			serv.getCidade().equals(ref);
			resultado.add(serv);
		}
		for (Serviço serv : service) {
			serv.getBairro().equals(ref);
			resultado.add(serv);
		}
		for (Serviço serv : service) {
			serv.getServico().equals(ref);
			resultado.add(serv);
		}
		ModelAndView MaV = new ModelAndView("PagResult");
		MaV.addObject("key", resultado);
		return MaV;
	}
	
	public void cadastrar(Serviço serv) {
		serviceService.cadastrarService(serv);
	}
}
