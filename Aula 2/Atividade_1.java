import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[3];
        int i = 0;
        int soma = 0;
        int aux = 0;
        
        while (i < 3){
            int valor = 0;
            aux+=1;
            
            System.out.println("Digite o valor " + (i+1));
            
            try{
                valor = sc.nextInt();
                vector[i] = valor;
                soma+=vector[i];
            } catch (Exception e){
                System.out.println("Digite um valor numérico inteiro");
                sc.nextLine();
                continue;
            }
            i++;
    }
    
    System.out.println("A soma dos valores presentes no vetor resulta em: " + soma);
    System.out.println("A quantidade de vezes que foi pedido para digitar os valores é: " + aux);
    
    }
}
