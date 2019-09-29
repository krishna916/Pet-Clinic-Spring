/**
 * 
 */
package me.krishnamurti.springpetclininc.services;



import me.krishnamurti.springpetclininc.model.Owner;

/**
 * @author krishna
 *
 */
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);
}
