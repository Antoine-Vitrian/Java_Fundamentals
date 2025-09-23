import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("Input do Java");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();
        System.out.println("Soma: " + n1 +"+"+ n2 + " igual a " + (n1+n2));

        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println(nome);

        sc.close();
    }
}
