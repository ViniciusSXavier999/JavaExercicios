package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

     public class Estoque {
     public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		 String prod1, prod2, prod3, prod4, rem;
		 
		 System.out.println("Digite o produto 1 do estoque: ");
		 prod1 = ler.next();
		 
		 System.out.println("Digite o produto 2 do estoque: ");
		 prod2 = ler.next();
		 
		 System.out.println("Digite o produto 3 do estoque: ");
		 prod3 = ler.next();
		 
		 ArrayList<String> estoque = new ArrayList<>();
		 
		 estoque.add(prod1);
		 estoque.add(prod2);
		 estoque.add(prod3);
		
         System.out.println("Os produtos Listados do estoque são: "+estoque);
         System.out.println("\n");
         System.out.println("Removendo produtos do estoque ");
         
         System.out.println("Digite sair para remover os seguintes produtos do estoque: "+prod1+","+prod3);
         rem = ler.next();
         estoque.remove(0);
         estoque.remove(1);
         
         System.out.println(estoque);
         System.out.println("\n");
         
         System.out.println("Digite o 4 produto para armazenar no estoque: ");
         prod4 = ler.next();
         
         System.out.println("Produto adicionado ao estoque com sucesso: "+prod4+"!!");
         System.out.println("\n");
         System.out.println("Digite RESTAURAR para mostrar o estoque compelto!!");
         rem = ler.next();
         
         estoque.add(prod1);
         estoque.add(prod3);
         estoque.add(prod4);
		
         
         System.out.println(estoque);
         System.out.println("\n"+"FIM DO PROGRAMA"+"\n");
         
        
         
         
         
        
         
         
        
         
         
        
		 }
	}




	
