/**
 * 
 */
package me.krishnamurti.springpetclininc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author krishna
 *
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Specialties")
public class Speciality extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8227610294862854354L;

	@Column(name = "description")
	private String description;

}
