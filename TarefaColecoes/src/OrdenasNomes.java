import java.util.*;
import java.util.Scanner;

class OrdenarNomes {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgulas:");
        String input = sc.nextLine();

        List<String> nomes = new ArrayList<>(Arrays.asList(input.split(",")));

        nomes.replaceAll(String::trim);
        Collections.sort(nomes);

        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();
    }
}