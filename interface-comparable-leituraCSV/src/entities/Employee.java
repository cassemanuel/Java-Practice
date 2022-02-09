package entities;

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override // m�todo para compara uma classe com outra
	public int compareTo(Employee other) {
		// t� comparando por nome pelo name.compareTo. Se quiser comparar por sal�rio
		// troca o name e o getName. Se quiser inverso bota o menos na frente do name
		return name.compareTo(other.getName());
	}

}
