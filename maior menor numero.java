//● Gere uma lista com 100 números aleatórios e mostre estes números 
//● Gere uma lista com 10 números quaisquer o
//• Mostre o maior número o
//• Mostre o menor número 
//• Mostre a quantidade de números



package streamsex3;

import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.*;


public class StreamsEx3 {

    
    public static void main(String[] args) {
        



int i ;
    ArrayList<Integer> mylist = new ArrayList<Integer>();
   
    Random random = new Random();
    
         for (i = 0; i < 100; i++)
    {
        mylist.add(random.nextInt(1000));
        
    }
            Stream<ArrayList<Integer>> mycollect = Stream.of(mylist)
                    .flatMap(Stream::of)
                    .limit(100);

                    mycollect.forEach(s->System.out.println(s));
                     System.out.println("\n Quantidade: " + i);

                        OptionalInt max = mylist.stream().mapToInt(Integer::intValue).max();
                            System.out.println("\n Maior valor: " + max);
                            
                            
                            OptionalInt mymin = mylist.stream().mapToInt(Integer::intValue).min();
                            System.out.println("\n Menor valor: " + mymin);
                            
                            
                            
                            System.out.println("\n\n SEGUNDA LISTA ");
                            
                            
                             ArrayList<Integer> mylist2 = new ArrayList<Integer>();
                             
                                 for (i = 0; i < 10; i++)
                                   {
                                     mylist2.add(random.nextInt(1000));
        
                                    }
                             
                             Stream<ArrayList<Integer>> mycollect2 = Stream.of(mylist2)
                            .flatMap(Stream::of)
                            .limit(10);
                             
                             
                             
                             mycollect2.forEach(x->System.out.println(x));
                             System.out.println("\n Quantidade: " + i);
                             
                            OptionalInt max2 = mylist2.stream().mapToInt(Integer::intValue).max();
                            System.out.println("\n Maior valor: " + max2);
                            
                            
                            OptionalInt mymin2 = mylist2.stream().mapToInt(Integer::intValue).min();
                            System.out.println("\n Menor valor: " + mymin2);            

    }
    
}
