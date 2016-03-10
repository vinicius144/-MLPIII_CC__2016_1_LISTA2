package br.unipe.mtp3.locadora;

public class Fita {

	public String titulo;
	public double preco;
	public String categoria;
Autor autor;
public Fita()
{
	
	
	
}


	private double acrescimo;
	public double FitaLançamento(double preco ){
		acrescimo= preco*0.2;
		return preco + acrescimo;
	}


	double desconto;
public double FitaInfantil(double preco){
	desconto= preco*0.4;
	preco= preco - desconto;
	return preco;
}

}