/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.Speciality;

/**
 * @author krishna
 *
 */
@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long>{

}
