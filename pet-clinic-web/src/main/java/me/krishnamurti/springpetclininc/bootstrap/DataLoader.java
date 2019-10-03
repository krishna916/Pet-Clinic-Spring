/**
 * 
 */
package me.krishnamurti.springpetclininc.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.services.OwnerService;
import me.krishnamurti.springpetclininc.services.VetService;
import me.krishnamurti.springpetclininc.services.map.OwnerServiceMap;
import me.krishnamurti.springpetclininc.services.map.VetServiceMap;

/**
 * @author krishna
 *
 */
@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Owner1");
		owner1.setLastName("lastName");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Owner2");
		owner2.setLastName("lastName2");
		
		ownerService.save(owner2);
		System.out.println("Loaded Owners...");
		
		Vet vet1= new Vet();
		vet1.setId(1L);
		vet1.setFirstName("vet1");
		vet1.setLastName("lastname");
		
		vetService.save(vet1);
		
		Vet vet2= new Vet();
		vet2.setId(2L);
		vet2.setFirstName("vet2");
		vet2.setLastName("lastname2");
		
		vetService.save(vet2);		
		System.out.println("Loaded Vets...");
	}

}
