package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TesteEntradaIn {

	public static void main(String[] args) throws IOException {

		//fluxo de entrada com arquivo
		InputStream fis = System.in; //= new FileInputStream("loren.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); // tambem pode definir o charset
		BufferedReader br = new BufferedReader(isr);
		
		FileOutputStream fos = new FileOutputStream("loren3.txt"); // = System.out; // saida no console
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();  // descarga de dados
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	}

}
