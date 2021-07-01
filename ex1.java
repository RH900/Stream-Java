//    Utilizando os conceitos de stream da videoaula, utilize os métodos abordados para 
//    fazer este exercício. Crie um programa que: 
//    ● solicite ao usuário a entrada no último número da lista (stream) (n) 
//    ● Gere uma lista com números de 1 a n duplicados (1,1,2,2,3,3...) 
//    ● Mostre todos os números 
//    ● Mostre todos os números sem repetição 
//    ● Mostre todos os números ímpares sem repetição 
//    ● Mostre todos os números pares sem repetição 
//    ● Mostre todos os números a partir do 5 algarismo sem repetição 
//    ● Mostre todos os números multiplicados por 4




package javastreamsex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;


public class JavaStreamsEx1 {

    
    public static void main(String[] args) {
       
        
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = myscanner.nextInt();
        
        
          ArrayList<Integer> list1 = new ArrayList<>(n);
          ArrayList<Integer> list2 = new ArrayList<>(n);
         
         for(int i = 1 ; i <= n ; i++){
             list1.add(i);
             list2.add(i);
             list2.add(i);
         }
         
         //System.out.println(list1);
         System.out.println(list2);
         
          
         list2.stream()
                 .distinct()
                 .collect(Collectors.toList())
                 .forEach(e -> System.out.printf(e +", "));
     
         System.out.println("\n Impares");
         
         
        
                 list2.stream()
                 .filter(e -> e % 2 == 1)
                 //.map(e -> e)
                 .distinct()
                 .forEach(e -> System.out.printf(e +", "));
                 
                 
                 
                 System.out.println("\n Pares");
                 
                 
                    list2.stream()
                 .filter(e -> e % 2 == 0)
                //.map(e -> e)
                 .distinct()
                 .forEach(e -> System.out.printf(e +", "));
                    
                    
                    
                    System.out.println("\n A partir do 5");
         
                    list2.stream()
                 .filter(e-> e>5)
                 
                 .distinct()
                 .forEach(e -> System.out.printf(e +", "));
                    
                    
                    
                     System.out.println("\n Multiplicando 4");
                    
                    
                    list2.stream()
                 .map(e-> e*4)
                 
                 .distinct()
                 .forEach(e -> System.out.printf(e +", "));
         
         
        
        
        
    }
    
}
