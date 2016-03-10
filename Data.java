package br.unipe.mtp3;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data() {
	}
	public void Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	
	if(dia>31)
	{
		System.out.println("Data invalida");
	}
	
	if(dia<1)
	{
		System.out.println("Data invalida");
	}
	if(mes>12)
	{
		System.out.println("Data invalida");
	}
	if(mes<1)
	{
		System.out.println("Data invalida");
	}
	if(ano<1)
	{
		System.out.println("Data invalida");
	}
	
	

	}
	
	
	
	
	public void  Data(int dia, int mes) {
	this.dia = dia;
	this.mes = mes;
	this.ano = 2016;
	if(dia>31)
	{
		System.out.println("Data invalida");
	}
	
	if(dia<1)
	{
		System.out.println("Data invalida");
	}
	if(mes>12)
	{
		System.out.println("Data invalida");
	}
	if(mes<1)
	{
		System.out.println("Data invalida");
		
		
	}
	}
	public String toString() {
	return dia + "/" + mes + "/" + ano;
	}
}


