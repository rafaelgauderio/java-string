package application;

public class ProgramConstructor {

	public static void main(String[] args) {
		
		System.out.println("Strins are immutable objects.\n"
				+ "Strings are arrays of characters.\n");
		
		String java = new String ("Java Spring Boot");
		System.out.println(java);
		
		String javaPontier = new String(java);
		System.out.println("New String refer to other string: " + javaPontier);
		
		System.out.println("\nString as a array of characters");
		char [] arrayOfCharacter = {'J','a','v','a'};
		String javaFromArray = new String(arrayOfCharacter);
		System.out.println(javaFromArray);
		for(int i=0; arrayOfCharacter.length > i ; i++) {
			System.out.print(arrayOfCharacter[i]);
		}
		
		System.out.println("\n\nPrint java from a array of bytes");
		byte [] arrayOfBytes = {74,97,118,97};
		String stringArrayOfBytes = new String(arrayOfBytes);
		System.out.println(stringArrayOfBytes);
		
		

	}

}
