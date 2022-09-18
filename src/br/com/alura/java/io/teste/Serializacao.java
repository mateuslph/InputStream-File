package br.com.alura.java.io.teste;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

public class Serializacao {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// desserializacao
		// se for um objeto deve implementar Serializable na classe do objeto. Em seguida sera 
		// gerada uma identificacao para classe chamada de serialVersionUID (private static final 
		// long serialVersionUID = 1L;), e esse numero  devera ser o mesmo da criacao do objeto. 
		// Este numero define a mudanca da versao em modificacoes nao compativeis, como, mudar um atributo. 
		// Todas classes com agregacao devem implementar ou colocar no atributo classe depois do tipo
		// a palavra tramsient, que diz que essa agregacao nao precisa ser serializable
		
//		String nome = "Mateus Pereira";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

		// serializacao
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
	}
}
