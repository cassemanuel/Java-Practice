package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		// instanciando a leitura do arquivo
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			// para ler todas as linhas e adicionar na lista
			while (employeeCsv != null) {
				// usa o split para separa as duas variáveis do CSV e coloca elas em um vetor
				String[] fields = employeeCsv.split(",");
				// a posição 1 é o salário, double, então tem que transformar
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			// ordena a lista
			Collections.sort(list);
			
			// percorre a lista imprimindo os nomes ordenados em ordem alfabética
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}