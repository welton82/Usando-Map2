package application;


import entities.Produto;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Map é uma coleção de chave e valor
        Map<Produto, Double> produtos = new HashMap<>();

        Produto p1 = new Produto("Tv 29", 3250.0);
        Produto p2 = new Produto("Notebook Acer", 4900.65);
        Produto p3 = new Produto("Geladeira Duplex", 4982.50);


        produtos.put(p1,4900.0);
        produtos.put(p2,15320.0);
        produtos.put(p3,2300.0);

        Produto ps = new Produto("Tv 29",3250.0);

        System.out.println("Contém ps? "+produtos.containsKey(ps));

    }
}
