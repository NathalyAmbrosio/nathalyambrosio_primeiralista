/* Transformação do número inserido em dólar americano
Nathaly ambrosio
16/04/2023
 */
import java.util.Scanner;
public class exercicio3 {
   public static void main (String args []) {

 //instancia um objeto "leitor"
 Scanner leitor = new Scanner (System.in);
 
    //criar as variáveis
    double v1, res, vd; 

    //iniciar as variáveis
    vd = 0.0;
    System.out.println( "insira o valor da contação do dólar");

    v1 = 0.0;
    System.out.println("insira o valor para conventer em dólar");

     res = 0.0;

     //leia as variáveis
     v1 = leitor.nextDouble();
     vd = leitor.nextDouble();

     res = v1*vd;

     System.out.println("a conversão de real brasilero para dólar americano foi de " + res);
      leitor.close();
 
   }
}
