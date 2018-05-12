package br.com.banctec.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "juros")
public class Juros {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codJuros;
	
	@NotNull
	private int parcelaMinima;
	
	@NotNull
	private int parcelaMaxima;
	
	@NotNull
	private double percentualJuros;

	public int getParcelaMinima() {
		return parcelaMinima;
	}
	

	public void setParcelaMinima(int parcelaMinima) {
		this.parcelaMinima = parcelaMinima;
	}

	public int getParcelaMaxima() {
		return parcelaMaxima;
	}

	public void setParcelaMaxima(int parcelaMaxima) {
		this.parcelaMaxima = parcelaMaxima;
	}

	public double getPercentualJuros() {
		return percentualJuros;
	}

	public void setPercentualJuros(double percentualJuros) {
		this.percentualJuros = percentualJuros;
	}


	public int getCodJuros() {
		return codJuros;
	}


	public void setCodJuros(int codJuros) {
		this.codJuros = codJuros;
	}
	
	

}
