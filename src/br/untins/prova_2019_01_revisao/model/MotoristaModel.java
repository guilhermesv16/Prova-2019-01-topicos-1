package br.untins.prova_2019_01_revisao.model;


public class MotoristaModel {
	
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private CarroModel carroModelObj;
	
	//Construtores
	public MotoristaModel() {
		
	}
	public MotoristaModel(Integer id, String nome, String email, String cpf, CarroModel carroModelObj) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.carroModelObj = carroModelObj;
	}

	//Sobreescrita do metodo clone responsavel por clonar o objeto
	@Override
	public MotoristaModel clone() {
		try {
			return (MotoristaModel) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			System.out.println("Erro ao clonar");
		}
		return null;
	}
	

	//Metodos GETTERS e SETTERS
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public CarroModel getCarroModelObj() {
		return carroModelObj;
	}
	public void setCarroModelObj(CarroModel carroModelObj) {
		this.carroModelObj = carroModelObj;
	}
}
