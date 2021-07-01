/Mostre somente os nomes que começam com P 
//● Mostre todos os nomes dos clientes separados por tamanho (número de 
//caracteres) 
//● Pesquise a letra inicial “A” e agrupe os nomes mostrando true e false, ou 
//seja, liste os valores que atendem ou não a regra de particionamento. 
//● Mostre os nomes agrupados por tamanho, convertidos para maiúsculo e 
//separados por vírgula





package javastreamex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class JavaStreamEx4 {

    
    
    public static void main(String[] args) {
        List<String> pessoas2 = new ArrayList<>();
        pessoas2.add("Paulo");
        pessoas2.add("Camila");
        pessoas2.add("Ana Maria");
        pessoas2.add("Patric");
        pessoas2.add("Ana Clara");
        pessoas2.add("Pedro");
        pessoas2.add("Alfredo");

        
                        
        
                        System.out.println("\n Inicia com P");
        
                     pessoas2.stream().filter((s) -> s.startsWith("P"))
                    .forEach(System.out::println);

                    

        boolean result = pessoas2.stream()
                
                
                //.allMatch((s) -> s.startsWith("A"));
                //.noneMatch((s) -> s.startsWith("A"));
                .anyMatch((x) -> x.startsWith("A"));
                

                
                
//        .anyMatch((s) -> s.startsWith("A"))
            



//        Map<Boolean, List<String>> mapa = pessoas2.stream()
//                .map(()->x)
//                .filter((x) -> x.startsWith("A"));


        System.out.println("\n Inicia com A");
        pessoas2.stream().filter((x) -> x.startsWith("A"))
                    .forEach(System.out::println);
        System.out.println(result);
        
        
        System.out.println("Mostre os nomes agrupados por tamanho, convertidos para maiúsculo e \n" +
                "separados por vírgula");
        
        pessoas2.stream()
                .map(n -> n.toUpperCase())
                .sorted((n1,n2) ->n1.length())
                .forEach(n -> System.out.print(n + ", "));
        
        
        
        
        
//        
//        result = pessoas2.stream()
//        .allMatch((s) -> s.startsWith("A"));
// 
//System.out.println(result);
// 
//result = pessoas2.stream()
//        .noneMatch((s) -> s.startsWith("A"));
// 
//System.out.println(result); // print do booleano
    }
    
}
