package com.rodrigo.os.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.br.CPF;

import com.rodrigo.os.domain.Cliente;
import com.rodrigo.os.domain.Tecnico;

public class ClienteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	@NotEmpty(message = "O campo NOME é requerido")
	private String nome;

	@CPF
	@NotEmpty(message = "O campo CPF é requerido")
	private String cpf;
	
	@NotEmpty(message = "O campo TELEFONE é requerido")
	private String telefone;

	public ClienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteDTO(Cliente obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.telefone = obj.getTelefone();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}