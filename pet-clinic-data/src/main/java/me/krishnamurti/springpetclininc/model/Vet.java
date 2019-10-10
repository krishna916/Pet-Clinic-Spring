package me.krishnamurti.springpetclininc.model;

import java.util.Set;

public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8953834814918793945L;
	
	
	private Set<Speciality> specialities;


	public Set<Speciality> getSpecialities() {
		return specialities;
	}


	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
