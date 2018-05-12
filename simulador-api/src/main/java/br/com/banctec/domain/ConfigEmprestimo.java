package br.com.banctec.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "configuracao_emprestimo")
public class ConfigEmprestimo {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codConfiguracao;
	
	@NotNull
	private double percentualIof;
	
	@NotNull
	private LocalDate dataConfiguracao;

	public int getCodConfiguracao() {
		return codConfiguracao;
	}

	public void setCodConfiguracao(int codConfiguracao) {
		this.codConfiguracao = codConfiguracao;
	}

	public double getPercentualIof() {
		return percentualIof;
	}

	public void setPercentualIof(double percentualIof) {
		this.percentualIof = percentualIof;
	}

	public LocalDate getDataConfiguracao() {
		return dataConfiguracao;
	}

	public void setDataConfiguracao(LocalDate dataConfiguracao) {
		this.dataConfiguracao = dataConfiguracao;
	}

}
