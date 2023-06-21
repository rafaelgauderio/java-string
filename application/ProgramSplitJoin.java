package application;

public class ProgramSplitJoin {

	public static void main(String[] args) {
		
		String original = new String("Rafael de Luca is a java developer");
		
		String [] array = original.split(" ");
		
		System.out.println("Printing the split String as a array");
		for(int i=0; array.length > i; i++) {
			System.out.println(array[i]);
		}
		
		String livro1 = "A Elite do atraso";
		String livro2 = "A ralé brasileira";
		String livro3 = "A classe média no espelho";
		
		System.out.println("\nPrinting join string by coma");
		String joinLivros = String.join(", ",livro1,livro2, livro3);
		System.out.println(joinLivros);
		
		
		
		
	}

}
