package br.com.juan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       ordenaNomes();
       separaGenereno();
    }

        public static void ordenaNomes() {
            System.out.println("****Ordenando Nomes****");
            Scanner s = new Scanner(System.in);

            System.out.println("Digite os nomes separados por , ");

            String input = s.nextLine();
            String[] nomes = input.split(",\\s*");
            Arrays.sort(nomes);
            for (String nome : nomes) {
                System.out.println(nome.trim());
            }
        }
    public static void separaGenereno() {
        System.out.println("**** Generos ****");
        Scanner sc = new Scanner(System.in);

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        System.out.println("Digite os nomes e sexos separados por hífen (ex: João-F, Maria-M):");
        System.out.println("Digite 'sair' para terminar.");

        while (true) {
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            String[] partes = entrada.split("-");

            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();

                if (sexo.equalsIgnoreCase("M")) {
                    homens.add(nome);
                } else if (sexo.equalsIgnoreCase("F")) {
                    mulheres.add(nome);
                } else {
                    System.out.println("Sexo inválido. Use M para masculino ou F para feminino.");
                }
            } else {
                System.out.println("Entrada inválida. Certifique-se de usar o formato: nome-sexo");
            }
        }
        System.out.println("***Homens***");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("***Mulheres***");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}