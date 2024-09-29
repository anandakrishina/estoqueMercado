package br.com.alura.mercadoExercicio.modelo;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoPerecivel extends Produto implements Comparable<ProdutoPerecivel>{
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nData de Validade: " + dataValidade+"\n"+verificaValidade();
    }

    public String verificaValidade(){
        boolean vencido = false;
        if(dataValidade.isBefore(LocalDate.now())){
            vencido = true;
        }
        return vencido ? "PRODUTO VENCIDO" : "";
    }

    @Override
    public int compareTo(ProdutoPerecivel validadeProduto) {
        return this.getDataValidade().compareTo(validadeProduto.getDataValidade());
    }
}
