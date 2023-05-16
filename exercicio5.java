/* leitura de uma idade e sua faixa etária
nathaly Ambrosio
17/04/23
 */

 import java.util.Scanner;
 public class exercicio5 {
    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        //criando as variáveis
        int idade;
         
        //iniciando as variáveis
        idade = 0;
         System.out.println("insira sua idade");
          
         //leia a variável
         idade = leitor.nextInt();

         //identificação das faixa etárias
         if(idade >= 0 && idade <= 12)
         System.out.println("sua faixa etária é criança");
         else if (idade >= 12 && idade <=19)
         System.out.println("sua faixa etária é adolescente");
         else if (idade >= 19 && idade <= 65)
         System.out.println("sua faixa etária é adulto");
         else if (idade >= 65)
         System.out.println("sua faixa etária é idoso");

         leitor.close();





 }
 
 }


