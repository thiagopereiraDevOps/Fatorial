import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade: ");
        idade = entrada.nextInt();

        String voto = ((idade>=16 && idade<18) || (idade>70))? "Eh Opcional":"Não Eh Opcional";
        System.out.println(voto);
    }
}
