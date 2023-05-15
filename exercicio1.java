/* Soma de 4 números 
Nathaly Ambrosio
14/04/2023
 */

import java.util.Scanner;
public class exercicio1 {
    public static void main (String args[]) {

        //instancia um objeto "leitor"
        Scanner leitor = new Scanner (System.in);
        
        //criar as variáveis
        double  V1, V2, V3, V4, res;

        //iniciar as variáveis
        res = V1 = V2 = V3 = V4 = 0.0;

        System.out.println ("insira 4 números");

        //leia os números 
        V1 = leitor.nextDouble();
        V2 = leitor.nextDouble();
        V3 = leitor.nextDouble();
        V4 = leitor.nextDouble();
       

        res = V1+V2+V3+V4;

        System.out.println ("resultado da soma é " + res);

            leitor.close();
    }
    
}