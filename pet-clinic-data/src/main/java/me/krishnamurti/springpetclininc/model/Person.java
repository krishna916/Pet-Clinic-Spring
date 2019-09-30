package me.krishnamurti.springpetclininc.model;

public class Person extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7285096005771195369L;
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
