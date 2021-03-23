package br.com.caicai.teste;

public class cacaiTeste {
public static void main(String[] args) {
	
	
	//instanciar o objeto
	
			Elevador objeto= new Elevador();
			objeto.inicializar("TorreB", (byte) 20, (byte) 10, (byte) 0); 
			objeto.subir();
			objeto.subir();
			objeto.entrar((byte) 5);
			System.out.println(objeto.toString());
			objeto.descer();
			objeto.sair( (byte) 2);
			objeto.descer();
			objeto.descer();
			System.out.println(objeto.toString());
	
	
	
}
}
