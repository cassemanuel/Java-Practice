package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		//intanciando a leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			//para ler todas as linhas e adicionar na lista
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			//ordena a lista
			Collections.sort(list);
			//percorre a lista imprimindo os nomes ordenados em ordem alfabética
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}