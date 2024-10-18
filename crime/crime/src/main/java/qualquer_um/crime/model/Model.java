package qualquer_um.crime.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crime")

public class Model {
	
	@Column(nullable = false)
	private int num_envolvidos;
	
	@Column(nullable = false)
	private String crime;
	
	@Column(nullable = false)
	private String local;
	
	@Column(nullable = false)
	private String data;
	
	private String descricao;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	

	public Model(int num_envolvidos, String crime, String local, String data, String descricao) {
		this.num_envolvidos = num_envolvidos;
		this.crime = crime;
		this.local = local;
		this.data = data;
		this.descricao = descricao;

	}




	public Model(Model crime2) {
		// TODO Auto-generated constructor stub
	}




	public int getNum_envolvidos() {
		return num_envolvidos;
	}




	public void setNum_envolvidos(int num_envolvidos) {
		this.num_envolvidos = num_envolvidos;
	}




	public String getCrime() {
		return crime;
	}




	public void setCrime(String crime) {
		this.crime = crime;
	}




	public String getLocal() {
		return local;
	}




	public void setLocal(String local) {
		this.local = local;
	}




	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}

	
}
