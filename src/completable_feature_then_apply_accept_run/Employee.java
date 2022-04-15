package completable_feature_then_apply_accept_run;

public class Employee {
	private String name;
	private String email;
	private boolean newJoiner;
	private boolean learningPending;

	public Employee(String name, String email, boolean newJoiner, boolean learningPending) {
		super();
		this.name = name;
		this.email = email;
		this.newJoiner = newJoiner;
		this.learningPending = learningPending;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isNewJoiner() {
		return newJoiner;
	}

	public void setNewJoiner(boolean newJoiner) {
		this.newJoiner = newJoiner;
	}

	public boolean isLearningPending() {
		return learningPending;
	}

	public void setLearningPending(boolean learningPending) {
		this.learningPending = learningPending;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", newJoiner=" + newJoiner + ", learningPending="
				+ learningPending + "]";
	}

}
