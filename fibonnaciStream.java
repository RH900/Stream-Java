

//        Utilizando a API Stream escreve um programa Java para apresentar até o 10º 
//        elemento da sequência de fibonnaci


package fibonnacistream;

import java.util.stream.Stream;


public class FibonnaciStream {

    
    public static void main(String[] args) {
       
        System.out.println("Sequencia de Fibonnaci usando streams");
        
        Stream.iterate(new int[]{ 0, 1 }, e->new int[]{ e[1], e[0]+e[1] })
                .map(e -> e[0])
                .limit(10)
                .map(e->e+" ")
                .forEach(e -> System.out.printf(e +", "));
        
    }
    
}
