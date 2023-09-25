package br.com.wepdev.trabalhador.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_trabalhador")
public class Trabalhador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Double salarioDiario;
	
	
	public Trabalhador() {
	}

	
	public Trabalhador(Long id, String nome, Double valorDia) {
		super();
		this.id = id;
		this.nome = nome;
		this.salarioDiario = valorDia;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getValorDia() {
		return salarioDiario;
	}


	public void setValorDia(Double valorDia) {
		this.salarioDiario = valorDia;
	}



	@Override
	public String toString() {
		return "Trabalhador [id=" + id + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabalhador other = (Trabalhador) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
