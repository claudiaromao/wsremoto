package variaveis;

public class TipoString {

	public static void main(String[] args) {
		String email= "Claudia.Romao@itau-Unibanco.Com.Br";
		System.out.println("Original:" + email);
		System.out.println("Min�scula:" + email.toLowerCase());
		System.out.println("Mai�scula:" + email.toUpperCase());
		System.out.println("Qtde Caracteres:" + email.length());
		System.out.println("� igual:" + email.equals("c@itau.com.br"));
		System.out.println("� igual 2:" + email.equalsIgnoreCase("c@itau.com.br"));
		System.out.println("Tem arroba?" + email.contains("@"));
		System.out.println("Posi��o do arroba?" + email.indexOf("@"));
		System.out.println("Do 3� at� o 5�: " + email.substring(2,4));
		if (email.contains("@")==true) {
		System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));	
		}
		
	
		
		
		
		
		
	}
	
	
}
