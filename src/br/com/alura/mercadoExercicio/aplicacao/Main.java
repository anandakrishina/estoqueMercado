package br.com.alura.mercadoExercicio.aplicacao;

public class Main {
  public static void main(String[] args) {
    Aplicacao app = new Aplicacao(false);
    app.preencheDadosIniciais();
    app.start();
  }
}
