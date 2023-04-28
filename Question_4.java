public class Question_4 {
    public static void main(String []args) {
        
        /* A distância é de 100km entre a cidade de Ribeirão Preto <-> Franca.
         *
         * A velocidade do carro é de 110 km/h.
         * 
         * Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um deles, podemos 
         * calcular o tempo de viagem sem os obstáculos:
         *
         * tso = 100 / 80;
         * 
         * Porém, como perde 10 minutos (0,17 horas) nos pedágios, o tempo de viagem para o caminhão 
         * será de 1,25h + 0,17h = 1,42h. Sua velocidade média é:
         * 
         * v2 = 100 / 1,42;
         */

         double v1 = 110;
         double v2 = 100 / 1.42;
         
         double x = v1 * 100 / (v1 + v2);
         System.out.println("O carro e o caminhão estão à mesma distância de Ribeirão Preto ao " + 
         "se cruzarem, eles se encontram a " + x + " km da cidade de Ribeirão Preto.");
         
    }
}
