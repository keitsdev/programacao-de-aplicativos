import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        //calculadora
        
        Scanner sc = new Scanner(System.in);
        
        int val01 = 0;
        int val02 = 0;
        String sinal = "";
        int op = 0;
        
        System.out.println("Escolha o primeiro valor:");
        val01 = sc.nextInt();
        System.out.println("Escolha o segundo valor:");
        val02 = sc.nextInt();
        
        System.out.println("Escolha um símbolo (+, -, *, /, ^):");
        sinal = sc.next();
        
        try{
            switch (sinal) {
                case "+":
                    op = val01 + val02;
                    System.out.println("A soma entre os valores resulta em: " + op);
                    break;
                case "-":
                    op = val01 - val02;
                    System.out.println("A diferença entre os valores resulta em: " + op);
                    break;
                case "*":
                    op = val01 * val02;
                    System.out.println("O produto entre os valores resulta em: " + op);
                    break;
                case "/":
                    op = val01 / val02;
                    System.out.println("A divisão entre os valores resulta em: " + op);
                    break;
                case "^":
                    op = val01 * val01;
                    System.out.println("O exponencial do primeiro valor é: " + op);
                    break;
                default:
                    System.out.println("Impossível realizar a operação.");
            }
            
        } catch (Exception e){
            System.out.println("Divisão por zero não pode ser feita!");
        }
    }
}
