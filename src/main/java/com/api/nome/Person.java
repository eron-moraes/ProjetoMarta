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
    private String cnh;
    private String criminais;
    private String nomeFilho;
    private String endereco;
    private String placa;
    private String nomeEscola;
    private String disponibilidade;

    
    public Person(String nome, String cnh, String criminais, String nomeFilho, String endereco, String placa, String nomeEscola, String disponibilidade) {
        this.name = nome;
        this.cnh = cnh;
        this.criminais = criminais;
        this.nomeFilho = nomeFilho;
        this.endereco = endereco;
        this.placa = placa;
        this.nomeEscola = nomeEscola;
        this.disponibilidade = disponibilidade;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getCriminais() {
		return criminais;
	}

	public void setCriminais(String criminais) {
		this.criminais = criminais;
	}

	public String getNomeFilho() {
		return nomeFilho;
	}

	public void setNomeFilho(String nomeFilho) {
		this.nomeFilho = nomeFilho;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}  
}
