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

    
    public Person(String nome, String cnh, String criminais, String nomeFilho) {
        this.name = nome;
        this.cnh = cnh;
        this.criminais = criminais;
        this.nomeFilho = nomeFilho;
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

  
}

