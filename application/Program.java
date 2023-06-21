package application;

public class Program {

	public static void main(String[] args) {
		
		String original = "   Rafael de Luca is a java developer.               ";
		String semEspacosNasExtremidades = original.trim();
		String maiscula = original.toUpperCase();
		String minuscula = original.toLowerCase();
		String nome = original.trim().substring(0,6);
		String funcao = original.trim().substring(20);
		String replace = original.trim().replace("*", "");
		String replace2 = replace.replace("Luca", "Souza");
		String replace3 = replace.replace("java", "react");
		
		int index = original.indexOf("Rafael");
		int lastIndex = original.lastIndexOf("is");
		int size = original.length();
		
		boolean b1 = original.contains("Rafael");
		boolean b2 = original.contains("Claudia");
		boolean b3 = original.trim().endsWith(".");
		boolean b4 = original.trim().startsWith("Rafael");
		
		
		System.out.println("Strings são imutáveis. Tem que referenciar para novas strings para armazenar as mudanças");		
		System.out.println("Original sentence: *" + original + "*"  );
		System.out.println("trim: *" + semEspacosNasExtremidades + "*");
		System.out.println("Uppercase: *" + maiscula + "*"  );
		System.out.println("LowerCase: *" + minuscula + "*");
		System.out.println("Uppercase and trim: *" +original.toUpperCase().trim() + "*");
		System.out.println("LowerCase and trim: *" +original.toLowerCase().trim() + "*");
		System.out.println("Name: " + nome);
		System.out.println("Function: " + funcao); // apenas o inicio de onde começa o recorte
		System.out.println("replace('*','') " + replace );
		System.out.println("replace('Luca','Souza') " + replace2 );
		System.out.println("replace('java','react') " + replace3);
		
		System.out.println("Index of Rafael: " + index);
		System.out.println("Last index of is: " + lastIndex);
		System.out.println("Size of the string: " + size);
		
		System.out.println("contains Rafael " + b1);
		System.out.println("contains Claudia " + b2);
		System.out.println("endsWith . " + b3);
		System.out.println("startsWith Rafael " + b4);

	}

}
