/**
 * 
 */
package me.krishnamurti.springpetclininc.controllers;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.HashSet;
import java.util.Set;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.services.OwnerService;

/**
 * @author krishna
 *
 */
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

	@Mock
	OwnerService ownerService;

	@InjectMocks
	OwnerController controller;

	Set<Owner> owners;

	MockMvc mockMvc;

	@BeforeEach
	void setUp() {
		owners = new HashSet<>();
		owners.add(Owner.builder().id(1L).build());
		owners.add(Owner.builder().id(2L).build());

		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.controllers.OwnerController#listOfOwners(org.springframework.ui.Model)}.
	 * @throws Exception 
	 */
	@Test
	void testListOfOwners() throws Exception {
		when(ownerService.findAll()).thenReturn(owners);
		
		mockMvc.perform(get("/owners"))
				.andExpect(status().isOk())
				.andExpect(view().name("owners/index"))
				.andExpect(model().attribute("owners", Matchers.hasSize(2)));
	}

	/**
	 * Test method for
	 * {@link me.krishnamurti.springpetclininc.controllers.OwnerController#findOwners()}.
	 * @throws Exception 
	 */
	@Test
	void testFindOwners() throws Exception {
		mockMvc.perform(get("/owners/find"))
				.andExpect(status().isOk())
				.andExpect(view().name("not-implemented"));
		
		verifyZeroInteractions(ownerService);
	}

}
