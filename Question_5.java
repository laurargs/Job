import java.util.Scanner;

public class Question_5 {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva algo para ser invertido: ");
        String palavra = input.next();

        input.close();

        String NovaPalavra = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            NovaPalavra = NovaPalavra + Character.toString(palavra.charAt(i));
            
        }
        
        System.out.println(NovaPalavra);
    }    
};
