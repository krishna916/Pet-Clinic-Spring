/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Speciality;
import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.services.SpecialityService;
import me.krishnamurti.springpetclininc.services.VetService;

/**
 * @author krishna
 *
 */
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	private final SpecialityService specialityService;

	/**
	 * @param specialityService
	 */
	public VetServiceMap(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@Override
	public Vet save(Vet object) {

		if (object != null) {
			if (object.getSpecialities().size() > 0) {
				object.getSpecialities().forEach(speciality -> {
					if (speciality.getId() == null) {
						Speciality savedSpeciality = specialityService.save(speciality);
						speciality.setId(savedSpeciality.getId());
					}
				});
			}
		}
		return super.save(object);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
		;
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
