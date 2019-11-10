/**
 * 
 */
package me.krishnamurti.springpetclininc.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.repositories.OwnerRepository;
import me.krishnamurti.springpetclininc.repositories.PetRepository;
import me.krishnamurti.springpetclininc.repositories.PetTypeRepository;

/**
 * @author krishna
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {
	
	private static final String LAST_NAME = "Smith";
	
	@Mock
	OwnerRepository ownerRepository;
	
	@Mock
	PetRepository petRepository;
	
	@Mock
	PetTypeRepository petTypeRepository;

	@InjectMocks
	OwnerSDJpaService ownerSDJpaService;
	
	Owner returnOwner;

	@BeforeEach
	void setUp() {
		returnOwner = Owner.builder().id(1L).LastName(LAST_NAME).build();
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#delete(me.krishnamurti.springpetclininc.model.Owner)}.
	 */
	@Test
	void testDelete() {
		ownerSDJpaService.delete(returnOwner);
		verify(ownerRepository).delete(any());
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#deleteById(java.lang.Long)}.
	 */
	@Test
	void testDeleteById() {
		ownerSDJpaService.deleteById(1L);
		verify(ownerRepository).deleteById(anyLong());
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#findByLastName(java.lang.String)}.
	 */
	@Test
	void testFindByLastName() {
		when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
		Owner smith = ownerSDJpaService.findByLastName(LAST_NAME);
		
		assertEquals(LAST_NAME, smith.getLastName());
		verify(ownerRepository).findByLastName(any());
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#findById(java.lang.Long)}.
	 */
	@Test
	void testFindById() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
		Owner owner = ownerSDJpaService.findById(1L);
		assertNotNull(owner);
	}

	@Test
	void testFindByIdNotFound() {
		when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
		Owner owner = ownerSDJpaService.findById(1L);
		assertNull(owner);
	}
	
	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#save(me.krishnamurti.springpetclininc.model.Owner)}.
	 */
	@Test
	void testSave() {
		Owner ownerToSave = Owner.builder().id(1L).build();
		
		when(ownerRepository.save(any())).thenReturn(ownerToSave);
		
		Owner savedOwner = ownerSDJpaService.save(ownerToSave);
		
		assertNotNull(savedOwner);
		verify(ownerRepository.save(any()));
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.services.springdatajpa.OwnerSDJpaService#findAll()}.
	 */
	@Test
	void testFindAll() {
		Set<Owner> returnOwnerSet = new HashSet<>();
		returnOwnerSet.add(Owner.builder().id(1l).build());
		returnOwnerSet.add(Owner.builder().id(2l).build());
		
		when(ownerRepository.findAll()).thenReturn(returnOwnerSet);
		Set<Owner> owners = ownerSDJpaService.findAll();
		
		assertNotNull(owners);
		assertEquals(2, owners.size());
	}

}
