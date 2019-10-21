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
@Table(name = "types")
public class PetType extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7219679835558455782L;

	@Column(name = "name")
	private String name;

}
