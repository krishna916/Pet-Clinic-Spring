/**
 * 
 */
package me.krishnamurti.springpetclininc.services;

import java.util.Set;

import me.krishnamurti.springpetclininc.model.Vet;

/**
 * @author krishna
 *
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
