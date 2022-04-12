package filter_map_reduce;

public class Employee {
	private String grade;
	private Integer salary;

	public Employee(String grade, Integer salary) {
		super();
		this.grade = grade;
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [grade=" + grade + ", salary=" + salary + "]";
	}

}
