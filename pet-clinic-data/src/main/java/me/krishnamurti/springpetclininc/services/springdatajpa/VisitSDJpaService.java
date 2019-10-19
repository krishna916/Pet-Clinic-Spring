/**
 * 
 */
package me.krishnamurti.springpetclininc.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Visit;
import me.krishnamurti.springpetclininc.repositories.VisitRepository;
import me.krishnamurti.springpetclininc.services.VisitService;

/**
 * @author krishna
 *
 */
@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

	private VisitRepository visitRepository;

	/**
	 * @param visitRepository
	 */
	public VisitSDJpaService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
	}

}
