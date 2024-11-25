import java.util.*;
import java.util.Scanner;

class SepararPorSexo {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes e sexos no formato Nome - Sexo (ex.: Kennedy - M, Maria - F):");
        String input = sc.nextLine();

        String[] pares = input.split(",");

        List<String> masculino = new ArrayList<>();
        List<String> feminino = new ArrayList<>();

        for (String par : pares) {
            String[] partes = par.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();

                if (sexo.equals("M")) {
                    masculino.add(nome);
                } else if (sexo.equals("F")) {
                    feminino.add(nome);
                }
            }
        }

        Collections.sort(masculino);
        Collections.sort(feminino);

        System.out.println("Grupo Masculino:");
        for (String nome : masculino) {
            System.out.println(nome);
        }

        System.out.println("Grupo Feminino:");
        for (String nome : feminino) {
            System.out.println(nome);
        }
        
        sc.close();
    }
}