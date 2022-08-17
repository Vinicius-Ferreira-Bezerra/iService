package br.com.iservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.iservice.model.Serviço;
import br.com.iservice.repository.ServiceRepository;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<Serviço> listarService() {
		return serviceRepository.findAll();
	}
	
	public List<Serviço> buscarService(){
		return serviceRepository.findAll();
	}
	
	public void cadastrarService(Serviço serv) {
		serviceRepository.save(serv);
	}
}