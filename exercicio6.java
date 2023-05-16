/* Calcule o perímetro de m círuculo atráves do raio
Nathal ambrosio
17/04/23
 */
 import java.util.Scanner;
public class exercicio6 {
    public static void main(String args[]){
        Scanner leitor = new Scanner(System.in);

        //criando as variáveis
        double raio, res;

        //iniciando as variáveis
        raio = 0.0;
        res =  0.0;
 
        System.out.println("insira o valor do raio de um círculo");

         //leia as variáveis
         raio = leitor.nextDouble();
         
         //calculo do perímetro
         res = 3.14*2* raio;
         System.out.println("o valor do perímetro do círculo é de  " + res);
          leitor.close();

    }
}
