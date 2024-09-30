package br.com.alura.mercadoExercicio.aplicacao;

import br.com.alura.mercadoExercicio.modelo.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Aplicacao {
  private boolean dadosIniciaisCarregados;
  private final ArrayList<ProdutoPerecivel> listaDeProdutosPereciveis;

  public Aplicacao() {
    this.listaDeProdutosPereciveis = new ArrayList<>();
  }

  public Aplicacao(boolean carregarDadosIniciais) {
    this();
    if(carregarDadosIniciais) preencheDadosIniciais();
  }

  public void start() {
    listarProdutos();
    ordenaProdutos();
    System.out.println();
    listarNomeValidadeProdutos();
    System.out.println("***************************");
  }

  public void preencheDadosIniciais() {
    if(this.dadosIniciaisCarregados) {
      System.err.println("A carga inicial de dados só pode ser dada uma vez.");
      return;
    }
    ProdutoPerecivel yogurt = new ProdutoPerecivel("Yogurt", 5.50, 6, LocalDate.of(2024, 10, 17));
    ProdutoPerecivel manteiga = new ProdutoPerecivel("Manteiga", 24.90, 7, LocalDate.of(2024, 11, 28));
    ProdutoPerecivel requeijao = new ProdutoPerecivel("Requeijão", 13.70, 3, LocalDate.of(2024, 12, 15));
    ProdutoPerecivel queijo = new ProdutoPerecivel("Queijo", 13.00, 9, LocalDate.of(2024, 9, 6));
    ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 5.50, 20, LocalDate.of(2024, 9, 17));
    this.listaDeProdutosPereciveis.add(yogurt);
    this.listaDeProdutosPereciveis.add(manteiga);
    this.listaDeProdutosPereciveis.add(requeijao);
    this.listaDeProdutosPereciveis.add(queijo);
    this.listaDeProdutosPereciveis.add(leite);
    this.dadosIniciaisCarregados = true;
  }

  public void listarProdutos() {
    if(!this.listaDeProdutosPereciveis.isEmpty()) {
      for(ProdutoPerecivel produtoPerecivel : this.listaDeProdutosPereciveis) {
        System.out.println(produtoPerecivel.toString() + "\n-------------");
      }
    } else {
      System.out.println("Não há itens na lista");
    }
  }

  public void ordenaProdutos() {
    Collections.sort(this.listaDeProdutosPereciveis);
  }

  public void listarNomeValidadeProdutos() {
    if(!this.listaDeProdutosPereciveis.isEmpty())
      for(ProdutoPerecivel produto : this.listaDeProdutosPereciveis) {
        System.out.println("Produto: " + produto.getNome() + " Validade: " + produto.getDataValidade() + "\n-------------");
      }
    else System.out.println("Não há itens na lista");
  }
}
