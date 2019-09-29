/**
 * 
 */
package me.krishnamurti.springpetclininc.model;

import java.io.Serializable;

/**
 * @author krishna
 *
 */
public class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4327117950695716530L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
