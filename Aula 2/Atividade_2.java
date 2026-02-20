import java.util.Scanner;

public class Atividade1_Aula2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vector = new int[4];
        int soma = 0;
        int i = 0;
        
        while (i < 4){
            int valor = 0;
            System.out.println("Informe o valor " + (i+1));
            
            try{
                valor = sc.nextInt();
                vector[i] = valor;
                
                if (valor%2 == 0){
                    soma += valor;
                }
                
            }catch(Exception e){
                System.out.println("Informe um valor inteiro!");
            }
            i++;
            
            System.out.println("A soma dos valores pares do vetor resulta em: " + soma);
        }
    }
}
