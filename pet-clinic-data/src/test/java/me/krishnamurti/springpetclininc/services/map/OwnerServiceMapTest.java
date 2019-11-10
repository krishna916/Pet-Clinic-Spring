/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import me.krishnamurti.springpetclininc.model.Owner;

/**
 * @author krishna
 *
 */
class OwnerServiceMapTest {
	
	OwnerServiceMap ownerServiceMap;
	
	final Long ownerId = 1L;
	final String lastName = "Smith";

	@BeforeEach
	void setUp() {
		ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());
		ownerServiceMap.save(Owner.builder().id(ownerId).LastName(lastName)
				.build());
	}
	
	
	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#OwnerServiceMap(me.krishnamurti.springpetclininc.services.PetTypeService, me.krishnamurti.springpetclininc.services.PetService)}.
	 */
	@Test
	void testOwnerServiceMap() {
	//	fail("Not yet implemented");
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#findAll()}.
	 */
	@Test
	void testFindAll() {
		Set<Owner> ownerSet = ownerServiceMap.findAll();
		assertEquals(1, ownerSet.size());
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#findById(java.lang.Long)}.
	 */
	@Test
	void testFindByIdLong() {
		Owner owner = ownerServiceMap.findById(ownerId);
		assertEquals(ownerId, owner.getId());
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#save(me.krishnamurti.springpetclininc.model.Owner)}.
	 */
	@Test
	void testSaveOwnerExistingId() {
		Long id = 2L;
		Owner owner2 = Owner.builder().id(2L).build();
		Owner savedOwner = ownerServiceMap.save(owner2);
		assertEquals(id, savedOwner.getId());
	}
	
	@Test
	void saveNoId() {
		Owner savedOwner = ownerServiceMap.save(Owner.builder().build());
		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#delete(me.krishnamurti.springpetclininc.model.Owner)}.
	 */
	@Test
	void testDeleteOwner() {
		ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
		assertEquals(0, ownerServiceMap.findAll().size());
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteByIdLong() {
		ownerServiceMap.deleteById(ownerId);
		assertEquals(0, ownerServiceMap.findAll().size());
	}

	/**
	 * Test method for {@link me.krishnamurti.springpetclininc.services.map.OwnerServiceMap#findByLastName(java.lang.String)}.
	 */
	@Test
	void testFindByLastName() {
		Owner smith = ownerServiceMap.findByLastName(lastName);
		assertNotNull(smith);
		assertEquals(ownerId, smith.getId());
	}

	@Test
	void testFindByLastNameNotFound() {
		Owner smith = ownerServiceMap.findByLastName("foo");
		assertNull(smith);
	}
}
