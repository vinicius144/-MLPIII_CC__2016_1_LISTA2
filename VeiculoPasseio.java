package br.unipe.mtp3.carro;

public class VeiculoPasseio extends Ve�culo {

	private boolean ar;
	private int qtdPortas;
	public double locacao(double  kmInicial,double kmFinal, double valorKmRodado)
	{
		preco= (kmInicial -kmFinal) * valorKmRodado;
	

	return preco;
	}
}
