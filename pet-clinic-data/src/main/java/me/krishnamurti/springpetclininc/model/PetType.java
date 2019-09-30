package me.krishnamurti.springpetclininc.model;

/**
 * @author krishna
 *
 */
public class PetType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7219679835558455782L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
