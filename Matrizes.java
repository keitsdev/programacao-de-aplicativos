import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                
                try{
                    matriz[i][j] = sc.nextInt();
                    
                } catch (Exception e){
                    System.out.println("Escolha um valor inteiro.");
                }
                
            }
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    
        System.out.println("Valores da diagonal principal: " + matriz[0][0] + ", " + matriz[1][1] + ", " + matriz[2][2]);
        System.out.println("Valores da diagonal secundária: " + matriz[0][2] + ", " + matriz[1][1] + ", " + matriz[2][0]);
        System.out.println("Valores acima da diagonal principal: " + matriz[0][1] + ", " + matriz[0][2] + ", " + matriz[1][2]);
        System.out.println("Valores abaixo da diagonal principal: " + matriz[1][0] + ", " + matriz[2][0] + ", " + matriz[2][1]);
    }
}
