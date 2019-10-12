package me.krishnamurti.springpetclininc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author krishna
 *
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7219679835558455782L;

	@Column(name = "name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
