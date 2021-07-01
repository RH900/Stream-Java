//        Crie um programa que implemente os seguintes passos: 
//        ● Crie um Stream contendo todos os números de 0 a 9 
//        ● Aplique um filtro mantendo apenas os números pares 
//        ● Ignores os dois primeiros números 
//        ● Limite o processamento aos dois primeiros números 
//        ● Aplique uma multiplicação por 2 em cada elemento 
//        ● Mostre o resultado final



package javastreamsex2;

import java.util.stream.IntStream;


public class JavaStreamsEx2 {

   
    public static void main(String[] args) {
        
        IntStream.range(1, 9)
                .filter(e -> e % 2 == 1)
                .skip(2)
                .limit(2)
                .map(e -> e*2)
                .forEach(e -> System.out.printf(e +", "));
        
        
        
        
        
    }
    
}
