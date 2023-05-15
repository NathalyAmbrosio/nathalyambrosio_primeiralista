/* soma 4 números elevados ao quadrado
Nathaly Ambrosio
16/04/2023
 */
import java.util.Scanner;
public class exercicio2 {
    public static void main (String args[]) {

    //instancia um objeto "leitor"
Scanner leitor = new Scanner (System.in);
 
//criar as variáveis
double v1,v2,v3,v4,res;

//inicar as variáveis
res = v1 = v2 = v3 = v4 = 0.0;

System.out.println("insira 4 números");
 
//leia as variáveis
 v1 = leitor.nextDouble();
 v2 = leitor.nextDouble();
 v3 = leitor.nextDouble();
 v4 = leitor.nextDouble();

 v1 = v1*v1;
 v2 = v2*v2;
 v3 = v3*v3;
 v4 = v4*v4;
 res = v1+v2+v3+v4;

 System.out.println("resultado da soma dos números ao quadrado é " + res);
 leitor.close();
} 
}