package br.unitins.prova_2019_01_revisao.controller;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.untins.prova_2019_01_revisao.model.UsuarioModel;

@Named
@RequestScoped
public class LoginController {
	private UsuarioModel usuarioModelObj;
	private List<UsuarioModel> listaUsuarioModel;
	
	//Metodo para redirencionar a pagina para o menu se o email e senha estiverem corretos.
	public String redirencionarMenu() {
		for (UsuarioModel usuarioModelFor : getListaUsuarioModel()) {
			if(usuarioModelObj.getEmail().equals(usuarioModelFor.getEmail()) && usuarioModelObj.getSenha().equals(usuarioModelFor.getSenha())) {
				return "menu.xhtml?faces-redirect=true";
			}
		}
		application.Util.addMessageError("Email ou senha incorretos");
		return null;
	}
	
	//Metodos GETTERS e SETTERS
	public UsuarioModel getUsuarioModelObj() {
		if(usuarioModelObj == null)
			usuarioModelObj = new UsuarioModel();
		return usuarioModelObj;
	}

	public void setUsuarioModelObj(UsuarioModel usuarioModelObj) {
		this.usuarioModelObj = usuarioModelObj;
	}

	public List<UsuarioModel> getListaUsuarioModel() {
		if(listaUsuarioModel == null) {
			listaUsuarioModel = new ArrayList<UsuarioModel>();
			listaUsuarioModel.add(new UsuarioModel("guilherme@gmail.com", "123456"));
			listaUsuarioModel.add(new UsuarioModel("maria@hotmail.com", "654321"));
			listaUsuarioModel.add(new UsuarioModel("bruno@outlook.com", "123654"));
		}
		return listaUsuarioModel;
	}

	public void setListaUsuarioModel(List<UsuarioModel> listaUsuarioModel) {
		this.listaUsuarioModel = listaUsuarioModel;
	}
	//--------------------------
}
