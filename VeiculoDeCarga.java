package br.unipe.mtp3.carro;

public class VeiculoDeCarga extends Ve�culo {

	private double capacidadeDEcarga;
	
	
	
	public double locacaoCarga(double  kmInicial,double kmFinal, double valorKmRodado)
	{
		preco= (kmInicial -kmFinal) * valorKmRodado;
	

	return preco;
	}
}
