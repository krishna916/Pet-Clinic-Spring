/**
 * 
 */
package me.krishnamurti.springpetclininc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author krishna
 *
 */
@Entity
@Table(name = "Specialties")
public class Speciality extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8227610294862854354L;

	@Column(name = "description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
