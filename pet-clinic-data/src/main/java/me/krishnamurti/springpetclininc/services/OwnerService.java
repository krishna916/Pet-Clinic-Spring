/**
 * 
 */
package me.krishnamurti.springpetclininc.services;

import java.util.Set;

import me.krishnamurti.springpetclininc.model.Owner;

/**
 * @author krishna
 *
 */
public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
