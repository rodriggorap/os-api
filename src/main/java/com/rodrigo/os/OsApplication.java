package com.rodrigo.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rodrigo.os.domain.Cliente;
import com.rodrigo.os.domain.OS;
import com.rodrigo.os.domain.Tecnico;
import com.rodrigo.os.domain.enunsr.Prioridade;
import com.rodrigo.os.domain.enunsr.Status;
import com.rodrigo.os.repositories.ClienteRepository;
import com.rodrigo.os.repositories.OSRepository;
import com.rodrigo.os.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

}
