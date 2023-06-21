package application;

public class ProgramStringBuilder {

	public static void main(String[] args) {
		
		System.out.println("Concatenating several strings wastes a lot of memory, because the API create a lot of objects on the heap memory.\n"
				+ "StringBuffer is thread safe.\n"
				+ "If we are not working with mult-thread is recommend to use StringBuilder.\n"
				+ "StringBuilder has the same sintaxe that StringBuffer.\n");
		
		String [] name = {"R","a","f","a","e","l"," ","d","e"," ","L","u","c","a"};
		
		String concatenetedStrings = "";
		System.out.println("\nConcatenated several Strings");
		System.out.println(concatenetedStrings.isEmpty());
		
		for(String nickname : name) {
			concatenetedStrings = concatenetedStrings + nickname;
		}
		System.out.println(concatenetedStrings);
		
		//////////////////////////////////////////////
		
		System.out.println("\nStringBuilder");		
		StringBuilder sb = new StringBuilder ();
		System.out.println(sb.toString().isEmpty());
		for(int i =0; name.length > i; i++) {
			sb.append(name[i]);
		}

		System.out.println(sb.toString());
		
		/////////////////////////////////////////////
		System.out.println("\nStringBuffer");
		StringBuffer sbu = new StringBuffer();
		System.out.println(sbu.toString().isEmpty());
		for(String nickname : name) {
			sbu.append(nickname);
		}
		System.out.println(sbu);
		
		
		
	}

}
