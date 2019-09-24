package br.untins.prova_2019_01_revisao.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class UsuarioModel {
	@Email(message="Este e-mail não é valido")
	private String email;
	@Size(min = 6, max = 20, message="Senha dever conter no minino 6 letras e no maximo 20")
	private String senha;
	
	//Construtores
	public UsuarioModel() {
		
	}
	public UsuarioModel(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	//-------------------------
	//Metodos GETTERS e SETTERS
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	//-------------------------
}
