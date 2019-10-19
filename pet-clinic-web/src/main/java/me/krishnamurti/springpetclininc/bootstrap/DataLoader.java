/**
 * 
 */
package me.krishnamurti.springpetclininc.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.model.Pet;
import me.krishnamurti.springpetclininc.model.PetType;
import me.krishnamurti.springpetclininc.model.Speciality;
import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.model.Visit;
import me.krishnamurti.springpetclininc.services.OwnerService;
import me.krishnamurti.springpetclininc.services.PetTypeService;
import me.krishnamurti.springpetclininc.services.SpecialityService;
import me.krishnamurti.springpetclininc.services.VetService;
import me.krishnamurti.springpetclininc.services.VisitService;

/**
 * @author krishna
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;

	/**
	 * @param ownerService
	 * @param vetService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
				SpecialityService specialityService, VisitService visitService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		int count = petTypeService.findAll().size();
		if(count == 0) {
			loadData();
		}
	}

	/**
	 * Loads data on startup
	 */
	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petTypeService.save(dog);

		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatType = petTypeService.save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("radiology");
		Speciality savedRadiology = specialityService.save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("surgery");
		Speciality savedSurgery = specialityService.save(surgery);

		Speciality dentistry = new Speciality();
		dentistry.setDescription("dentistry");
		Speciality savedDentistry = specialityService.save(dentistry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1");
		owner1.setLastName("lastName");
		owner1.setAddress("some Address");
		owner1.setCity("Some City");
		owner1.setTelephone("123456789");

		Pet somePet = new Pet();
		somePet.setPetType(savedDogType);
		somePet.setOwner(owner1);
		somePet.setBirthDate(LocalDate.now());
		somePet.setName("somePetName");
		owner1.getPets().add(somePet);
		
		ownerService.save(owner1);
		Visit somePetVisit = new Visit();
		somePetVisit.setPet(somePet);
		somePetVisit.setDate(LocalDate.now());
		somePetVisit.setDescription("Sneezy");
		visitService.save(somePetVisit);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Owner2");
		owner2.setLastName("lastName2");
		owner2.setAddress("some Address");
		owner2.setCity("Some City");
		owner2.setTelephone("123456789");

		Pet somePet1 = new Pet();
		somePet1.setPetType(savedCatType);
		somePet1.setOwner(owner2);
		somePet1.setBirthDate(LocalDate.now());
		somePet1.setName("somePetName2");
		owner2.getPets().add(somePet1);

		ownerService.save(owner2);
		System.out.println("Loaded Owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("vet1");
		vet1.setLastName("lastname");
		vet1.getSpecialities().add(savedRadiology);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("vet2");
		vet2.setLastName("lastname2");
		vet2.getSpecialities().add(savedSurgery);

		vetService.save(vet2);
		System.out.println("Loaded Vets...");
	}

}
