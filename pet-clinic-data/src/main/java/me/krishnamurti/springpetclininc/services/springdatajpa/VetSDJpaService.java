/**
 * 
 */
package me.krishnamurti.springpetclininc.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.repositories.VetRepository;
import me.krishnamurti.springpetclininc.services.VetService;

/**
 * @author krishna
 *
 */
@Service
@Profile("springdatajap")
public class VetSDJpaService implements VetService {

	private final VetRepository vetRepository;

	/**
	 * @param vetRepository
	 */
	public VetSDJpaService(VetRepository vetRepository) {
		super();
		this.vetRepository = vetRepository;
	}

	@Override
	public void delete(Vet object) {
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		vetRepository.deleteById(id);
	}

	@Override
	public Vet findById(Long id) {
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet vet) {
		return vetRepository.save(vet);
	}

	@Override
	public Set<Vet> findAll() {
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

}
