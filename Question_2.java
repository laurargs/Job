import java.util.Scanner;

public class Question_2 {
    public static void main(String []args) {

        int a = 0, b = 1, c = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número que deseja validar se pertence ou não a sequência de de Fibonacci: ");
        int n = input.nextInt();
        
        input.close();

        while (n > c) {
            
            c = a + b;
            a = b;
            b = c;
        }

        if (n == 0) {
            System.out.println("O número 0 pertence a sequência de Fibonacci.");
        } else if(n == c) {
            System.out.println("O número " + n + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("Este número não pertence a sequência de Fibonacci.");
        }    

    }
};

