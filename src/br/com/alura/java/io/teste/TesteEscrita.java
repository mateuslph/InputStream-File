package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo
		FileOutputStream fos = new FileOutputStream("loren2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Sofia Costanza Brigida Villani Scicolone; Born 20 September 1934, known professionally as\r\n"
				+ " Sophia Loren), is an Italian actress.");
		bw.newLine();
		bw.newLine();
		bw.write("She was named by the American Film Institute as one \r\n"
				+ " of the greatest female stars of Classical Hollywood cinema.");
		
		bw.close();
		
	}

}
