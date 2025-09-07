package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	public static void main(String[] args) {
		ArrayList<ProdutoBean> produtos = new ArrayList<>(Arrays.asList(
				new ProdutoBean("CD00001", "Celular Galaxy S10", "128 Gb, Preto, com Carregador", 1250.0, "Poucos riscos, estado de novo."),
				new ProdutoBean("CD00002", "Prod 2 ...", "Bla Bla Bla", 1100.0, "Bla Bla Bla"),
				new ProdutoBean("CD00003", "Prod 3 ...", "Bla Bla Bla", 120.0, "Bla Bla Bla"),
				new ProdutoBean("CD00004", "Prod 4 ...", "Bla Bla Bla", 1300.0, "Bla Bla Bla"),
				new ProdutoBean("CD00005", "Prod 5 ...", "Bla Bla Bla", 9400.0, "Bla Bla Bla"),
				new ProdutoBean("CD00006", "Prod 6 ...", "Bla Bla Bla", 1500.0, "Bla Bla Bla")
		));
		
		// Imprime produtos
		for (ProdutoBean p : produtos) {
			System.out.println("Codigo = " + p.getCodigo() + " Nome = " + p.getNome() + " Valor = " + p.getValor());
		}
		
		// Ordena produtos
		Collections.sort(produtos);
		
		System.out.println("-------------------- Produtos Ordenados -------------------");
		// Imprime produtos ordenados
		for (ProdutoBean p : produtos) {
			System.out.println("Codigo = " + p.getCodigo() + " Nome = " + p.getNome() + " Valor = " + p.getValor());
		}
		
		// Calcula M�dia
		Double media = 0.0;
		int i = 1;

		for (ProdutoBean p : produtos) {
			media += p.getValor();
		}

		media = media / i;
		System.out.println("Media de Valores = " + media);
	}

}
