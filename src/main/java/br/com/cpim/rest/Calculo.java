package br.com.cpim.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Calculo {

	private double a;
	private double b;
	private String operacao;
	private double total;
	private String erro;

	public Calculo() {

	}

	public Calculo(int a, int b, char operacao) {
		super();
		this.a = a;
		this.b = b;
		this.erro = "OK";
		
		switch (operacao) {
		case 'a':
			this.total = this.a + this.b;
			this.operacao = "adicao";
			break;
		case 's':
			this.total = this.a - this.b;
			this.operacao = "subtracao";
			break;
		case 'm':
			this.total = this.a * this.b;
			this.operacao = "multiplicacao";
			break;
		case 'd':
			this.operacao = "divisao";
			if(this.b != 0){
				this.total = (double) this.a / (double) this.b;			
			} else {
				this.erro="Erro divisao por zero";
			}
			break;			
		default:
			this.operacao = "nenhuma";
			this.total = 0;
			break;
		}
	}


	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	@Override
	public String toString() {
		return "Calculo de " + operacao + " [a=" + a + ", b=" + b + ", total = " + total + ", erro = " + erro + "]";
	}	
}
