package br.com.alura.mercadoExercicio.aplicacao;

import br.com.alura.mercadoExercicio.modelo.ProdutoPerecivel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aplicacao {
    public static void main(String[] args) {
        ArrayList<ProdutoPerecivel> perecivelArrayList = new ArrayList<>(5);
        ProdutoPerecivel yogurt = new ProdutoPerecivel("Yogurt",5.50,6, LocalDate.of(2024,10,17));
        ProdutoPerecivel manteiga = new ProdutoPerecivel("Manteiga",24.90,7, LocalDate.of(2024,11,28));
        ProdutoPerecivel requeijao = new ProdutoPerecivel("Requeijão",13.70,3, LocalDate.of(2024,12,15));
        ProdutoPerecivel queijo= new ProdutoPerecivel("Queijo",13.00,9, LocalDate.of(2024,9,6));
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite",5.50,20, LocalDate.of(2024,9,17));
        perecivelArrayList.add(yogurt);
        perecivelArrayList.add(manteiga);
        perecivelArrayList.add(requeijao);
        perecivelArrayList.add(queijo);
        perecivelArrayList.add(leite);

        for (ProdutoPerecivel produto : perecivelArrayList) {
            System.out.println(produto.toString() + "\n-------------");
        }

    }
}
