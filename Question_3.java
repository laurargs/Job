public class Question_3 {
    public static void main(String []args) {
        int N1 = 0, N2 = 0, N3 = 0, N4 = 0, N5 = 0, N6 = 0;

        int V1[] = {1,3,5,7};
        int V2[] = {2,4,8,16,32,64};
        int V3[] = {0,1,4,9,16,25,36};
        //int V4[] = {4,16,36,64};
        int V5[] = {1,1,2,3,5,8};
        //int V6[] = {2,10,12,16,17,18,19};

        N1 = V1[3] + 2; //Cada número é igual ao anterior + 2, formando os números ímpares.
        
        N2 = V2[5] * 2; // Cada número é igual ao anterior multiplicado por 2.
        
        N3 = V3[6] + 13; // Cada número é igual ao anterior acrescido de um número ímpar que segue 
                         //a sequência 1, 3, 5, 7, 9. Realizando a subtração dos dois últimos números, 
                         //temos que 36 - 25 = 11. Assim, devemos acrescentar 11 + 2 = 13 ao último número. 
       
        N4 = 10 * 10; // Cada número é igual ao quadrado dos números pares. Então, o próximo número par é 10.
       
        N5 = V5[5] + V5[4]; // Cada número é igual à soma do número atual com o número anterior.
      
        N6 = 200; //Essa sequência é formada através de todos os números que iniciam com a letra d. 
                  //Logo, o próximo número em ordem crescente que inicia com a letra d é 200.

        

        System.out.println("Descubra a lógica e complete o próximo elemento:");
        
        System.out.println("a) 1, 3, 5, 7, ___\n" + 
        "b) 2, 4, 8, 16, 32, 64, ____\n" + 
        "c) 0, 1, 4, 9, 16, 25, 36, ____\n" + 
        "d) 4, 16, 36, 64, ____\n" + "e) 1, 1, 2, 3, 5, 8, ____\n" + 
        "f) 2,10, 12, 16, 17, 18, 19, ____\n");

        
        System.out.println("a) 1, 3, 5, 7, " + N1 + "\n" + 
        "b) 2, 4, 8, 16, 32, 64, " + N2 + "\n" + 
        "c) 0, 1, 4, 9, 16, 25, 36, " + N3 + "\n" + 
        "d) 4, 16, 36, 64, " + N4 + "\n" + 
        "e) 1, 1, 2, 3, 5, 8, " + N5 + "\n" + 
        "f) 2,10, 12, 16, 17, 18, 19, " + N6 + "\n");
    }
    
    
}
