package com.api.nome;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    
    private String carteiraHabilitacao;
    private String atestadoAntecedentesCriminais;
    private String nomeFilho;

    
    public Person(String nome, String cpf, String carteiraHabilitacao, String atestadoAntecedentesCriminais, String nomeFilho) {
        this.name = nome;
        this.cpf = cpf;
        this.carteiraHabilitacao = carteiraHabilitacao;
        this.atestadoAntecedentesCriminais = atestadoAntecedentesCriminais;
        this.nomeFilho = nomeFilho;
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCarteiraHabilitacao() {
		return carteiraHabilitacao;
	}

	public void setCarteiraHabilitacao(String carteiraHabilitacao) {
		this.carteiraHabilitacao = carteiraHabilitacao;
	}

	public String getAtestadoAntecedentesCriminais() {
		return atestadoAntecedentesCriminais;
	}

	public void setAtestadoAntecedentesCriminais(String atestadoAntecedentesCriminais) {
		this.atestadoAntecedentesCriminais = atestadoAntecedentesCriminais;
	}

	public String getNomeFilho() {
		return nomeFilho;
	}

	public void setNomeFilho(String nomeFilho) {
		this.nomeFilho = nomeFilho;
	}

  
}

