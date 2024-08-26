package br.com.alura.screenmatch;

import java.util.Arrays;
import java.util.List;

public class TesteListaDeNomes {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("João", "Maria", "Vinicius", "Pedro");

        nomes.stream()
                .sorted()
                .limit(3)
                .filter(n -> n.startsWith("M"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
