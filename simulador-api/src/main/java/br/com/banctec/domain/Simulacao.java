package br.com.banctec.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "simulacao")
public class Simulacao {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codSimulacao;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private ConfigEmprestimo configEmprestimo;
	
	@NotNull
	private LocalDate dataSimulacao;
	
	@NotNull
	private int qtdeParcela;
	
	@NotNull
	private LocalDate dataVencParcela;
	
	@NotNull
	private double valorEmprestimo;

	public int getCodSimulacao() {
		return codSimulacao;
	}

	public void setCodSimulacao(int codSimulacao) {
		this.codSimulacao = codSimulacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ConfigEmprestimo getConfigEmprestimo() {
		return configEmprestimo;
	}

	public void setConfigEmprestimo(ConfigEmprestimo configEmprestimo) {
		this.configEmprestimo = configEmprestimo;
	}

	public LocalDate getDataSimulacao() {
		return dataSimulacao;
	}

	public void setDataSimulacao(LocalDate dataSimulacao) {
		this.dataSimulacao = dataSimulacao;
	}

	public int getQtdeParcela() {
		return qtdeParcela;
	}

	public void setQtdeParcela(int qtdeParcela) {
		this.qtdeParcela = qtdeParcela;
	}

	public LocalDate getDataVencParcela() {
		return dataVencParcela;
	}

	public void setDataVencParcela(LocalDate dataVencParcela) {
		this.dataVencParcela = dataVencParcela;
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}	
	
	
	
}
