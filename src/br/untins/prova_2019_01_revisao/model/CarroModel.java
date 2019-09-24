package br.untins.prova_2019_01_revisao.model;

import java.time.LocalDate;

public class CarroModel {
	private String nome;
	private String marca;
	private String placa;
	private LocalDate dataFabricacao;
	
	//Construtores
	public CarroModel() {
		
	}
	public CarroModel(String nome, String marca, String placa, LocalDate dataFabricacao) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.placa = placa;
		this.dataFabricacao = dataFabricacao;
	}



	//Metodos GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
}
