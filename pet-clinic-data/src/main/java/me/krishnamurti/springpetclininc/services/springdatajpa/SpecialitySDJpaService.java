/**
 * 
 */
package me.krishnamurti.springpetclininc.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Speciality;
import me.krishnamurti.springpetclininc.repositories.SpecialityRepository;
import me.krishnamurti.springpetclininc.services.SpecialityService;

/**
 * @author krishna
 *
 */
@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService{
	
	private final SpecialityRepository specialityRepository;

	/**
	 * @param specialityRepository
	 */
	public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(Long id) {
		return specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		return specialityRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		specialityRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		specialityRepository.deleteById(id);
	}
	
	
	
}
