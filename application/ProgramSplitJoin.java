package application;

import java.util.Locale;

import entities.Product;

public class ProgramSplitJoin {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String original = new String("Rafael de Luca is a java developer");
		
		String [] array = original.split(" ");
		
		System.out.println("Printing the split String as a array");
		for(int i=0; array.length > i; i++) {
			System.out.println(array[i]);
		}
		
		////////////////////////////////
		
		String livro1 = "A Elite do atraso";
		String livro2 = "A ralé brasileira";
		String livro3 = "A classe média no espelho";
		
		System.out.println("\nPrinting join string by coma");
		String joinLivros = String.join(", ",livro1,livro2, livro3);
		System.out.println(joinLivros);
		
		/////////////////////////
		String product = ("1920,Calça jeans preta tamanho 42,105.90");
		String [] productInformation = product.split(",");
		
		System.out.println("\nPrinting product information");
		for(String nickname : productInformation) {
			System.out.println(nickname);
		}
		
		Product produto = new Product(Long.parseLong(productInformation[0]),productInformation[1],Double.parseDouble(productInformation[2]));
		System.out.println(produto);
		
	}

}
