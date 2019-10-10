/**
 * 
 */
package me.krishnamurti.springpetclininc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.model.PetType;
import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.services.OwnerService;
import me.krishnamurti.springpetclininc.services.PetTypeService;
import me.krishnamurti.springpetclininc.services.VetService;
import me.krishnamurti.springpetclininc.services.map.OwnerServiceMap;
import me.krishnamurti.springpetclininc.services.map.VetServiceMap;

/**
 * @author krishna
 *
 */
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	/**
	 * @param ownerService
	 * @param vetService
	 */
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatType = petTypeService.save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Owner1");
		owner1.setLastName("lastName");

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Owner2");
		owner2.setLastName("lastName2");

		ownerService.save(owner2);
		System.out.println("Loaded Owners...");

		Vet vet1 = new Vet();
		vet1.setFirstName("vet1");
		vet1.setLastName("lastname");

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("vet2");
		vet2.setLastName("lastname2");

		vetService.save(vet2);
		System.out.println("Loaded Vets...");
	}

}
