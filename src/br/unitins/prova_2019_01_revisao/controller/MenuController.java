package br.unitins.prova_2019_01_revisao.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MenuController implements Serializable {
	
	private static final long serialVersionUID = 4557521788029708061L;

	public String redirecionarLogin() {
		return "login.xhtml?faces-redirect=true";
	}
	
	public String redirecionarCadastroMotorista() {
		return "motorista.xhtml?faces-redirect=true";
	}
	
	public String redirecionarConsultarMotorista() {
		return "consultarMotorista.xhtml?faces-redirect=true";
	}
}
