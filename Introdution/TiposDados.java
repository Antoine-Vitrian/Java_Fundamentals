
public class TiposDados {
    public static void main(String[] args) {
        // Criando variáveis
        // Números Inteiros
        // 1.int, 2.short, 3.long, 4.byte
        // 5.float: números decimais
        // 6.double: mais preciso que float - mais utilizado
        // 7.char: apenas um caractere
        // 8.boolean: True or False

        int idade = 10;
        double preco = 10.0;
        char sexo = 'M'; 
        boolean maiorIdade = false;

        System.out.println(idade);
        System.out.println(preco);
        System.out.println(sexo);
        System.out.println(maiorIdade);

        // Operadores
        // +: Adição
        // -: Subtração
        // *: Multiplicação
        // /: Divisão
        // %: Módulo - Ignora o resto

        int adicao = 1 + 2;
        int subtracao = 2 - 1;
        int multiplicacao = 6 * 2;
        double divisao = 6 / 3;
        int modulo = 7 / 2;

        System.out.println(adicao);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);

        // Operadores de atribuição
        // contador - python, javascript
        // x = x + y --- x += y
        // x = x - y --- x -= y
        // x = x * y --- x *= y
        // x = x / y --- x /= y
        int x = 10;
        int y = 2;

        x+=y;
        System.out.println(x);
        x-=y;
        System.out.println(x);
        x*=y;
        System.out.println(x);
        x/=y;
        System.out.println(x);

        // operadores de incremento
        // x++ = x + 1 = ++x
        // x-- = x - 1 = --x
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        System.out.println("oi");
        int a1 = 1;int a2 = 2; int a3= 2;
        a1 = a2--;
        System.out.println(a1);
        System.out.println(a2);
        a1 = --a3;
        System.out.println(a1);
        System.out.println(a3);


        // operadores de igualdade/relação
        // == -> igual
        // != -> diferente
        // >, <, >=, <=

        // operadores lógicos
        // AND --> &&
        // OR --> ||
        // NOT --> !
        // XOR --> ^

        // Condicionais
        if(x > 10){
            System.out.println("X é maior que 10");
        } else if(x == 10) {
            System.out.println("X é igual a 10");
        } else {
            System.out.println("X é menor que 10");
        }

        // Conversão
        // É necessário outra variável
        double ab = 9.99;
        int bc = (int) ab;
        System.out.println(bc);

    }
}



