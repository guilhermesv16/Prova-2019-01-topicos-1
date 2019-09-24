package br.unitins.prova_2019_01_revisao.controller;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.untins.prova_2019_01_revisao.model.CarroModel;
import br.untins.prova_2019_01_revisao.model.MotoristaModel;

@Named
@ViewScoped
public class MotoristaController implements Serializable {

	private static final long serialVersionUID = -1313814947948265068L;
	private MotoristaModel motoristaModelObj;
	private List<MotoristaModel> listaMotoristaModel; 
	
	//Metodo responsavel por criar um novo cadastro na lista
	public void criar() {
		if(validarDados()) {
			getMotoristaModelObj().setId(ultimoId() + 1);
			listaMotoristaModel.add(getMotoristaModelObj());
		}
		limpar();
	}
	
	//Metodo responsavel por alterar um cadastro
	public void alterar() {
		
	}
	
	//Metodo responsavel por excluir um cadastro pelo o botao(Excluir) do CRUD
	public void excluirCrud() {
		
	}
	
	//Metodo responsavel por excluir um cadastro pela Data Table
	public void excluirDataTable(MotoristaModel motorista) {
		getListaMotoristaModel().remove(motorista);
		limpar();
	}
	
	public void editar(MotoristaModel motorista) {
		setMotoristaModelObj(motorista.clone());
	}
	
	//Metodo responsavel por limpar os campos de input do cadastro
	public void limpar() {
		motoristaModelObj = null;
	}
	
	//Metodo responsavel por verificar ser o campo do CPF foi preenchido
	public boolean validarDados() {
		if(getMotoristaModelObj().getCpf().isBlank()) {
			application.Util.addMessageWarn("O CPF dever ser informado");
			return false;
		}
		return true;
	}
	
	//Metodo responsavel por colocar automaticamente o id do usuario de forma simetrica (somando +1 do maior id existente) 
	public int ultimoId() {
		int maiorId = 0;
		for (MotoristaModel motoristaModelFor : listaMotoristaModel) {
			if(motoristaModelFor.getId() > maiorId) {
				maiorId = motoristaModelFor.getId();
			}
		}
		return maiorId;
	}
	
	//Metodos GETTERS e SETTERS
	public MotoristaModel getMotoristaModelObj() {
		if(motoristaModelObj == null) {
			motoristaModelObj = new MotoristaModel();
			motoristaModelObj.setCarroModelObj(new CarroModel());
		}
		return motoristaModelObj;
	}
	public void setMotoristaModelObj(MotoristaModel motoristaModelObj) {
		this.motoristaModelObj = motoristaModelObj;
	}
	
	public List<MotoristaModel> getListaMotoristaModel() {
		if(listaMotoristaModel == null) {
			listaMotoristaModel = new ArrayList<MotoristaModel>();
			listaMotoristaModel.add(new MotoristaModel(1, "Marcio", "marcio@gmail.com", "11122233344", 
					new CarroModel("Cerato", "Kia", "GUI-1999", LocalDate.now())));
			listaMotoristaModel.add(new MotoristaModel(2, "Isadora", "isa@hotmail.com", "33322211144", 
					new CarroModel("Sonata", "Hyndai", "BRO-7777", LocalDate.now())));
			listaMotoristaModel.add(new MotoristaModel(3, "Carlos", "carlinhos@gmail.com", "00099988811", 
					new CarroModel("Corolla", "Toyota", "ITO-9871", LocalDate.now())));
		}
		return listaMotoristaModel;
	}
	public void setListaMotoristaModel(List<MotoristaModel> listaMotoristaModel) {
		this.listaMotoristaModel = listaMotoristaModel;
	}
	
}
