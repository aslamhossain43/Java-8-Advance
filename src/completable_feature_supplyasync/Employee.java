package completable_feature_supplyasync;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<String> phones;

	public Employee(int id, String name, List<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.phones = phones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phones=" + phones + "]";
	}

}
