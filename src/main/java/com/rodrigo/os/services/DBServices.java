package com.rodrigo.os.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.rodrigo.os.domain.Cliente;
import com.rodrigo.os.domain.OS;
import com.rodrigo.os.domain.Tecnico;
import com.rodrigo.os.domain.enunsr.Prioridade;
import com.rodrigo.os.domain.enunsr.Status;
import com.rodrigo.os.repositories.ClienteRepository;
import com.rodrigo.os.repositories.OSRepository;
import com.rodrigo.os.repositories.TecnicoRepository;

@Service
public class DBServices {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private OSRepository osRepository;

	public void instaciaDB() {

		Tecnico t1 = new Tecnico(null, "Rodrigo Amaro", "280.422.180-60", "(61) 98888-7777");
		Cliente c1 = new Cliente(null, "Bruno Silva", "373.765.050-08", "(61) 98888-1111");

		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OD", Status.ANDAMENTO, t1, c1);

		t1.getList().add(os1);
		c1.getList().add(os1);

		tecnicoRepository.saveAll(Arrays.asList(t1));  
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));
	}
	
	
}

















