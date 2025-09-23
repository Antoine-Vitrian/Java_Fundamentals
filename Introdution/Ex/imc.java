package Ex;

import java.util.Scanner;
import java.util.Locale;

public class imc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Peso -> ");
        float peso = sc.nextFloat();
        System.out.print("Altura -> ");
        float altura = sc.nextFloat();
        System.out.println("IMC Ideal: entre 18.5 e 25");
        System.out.println("Seu IMC = " + peso / (altura * altura));
        sc.close();
    }
}

