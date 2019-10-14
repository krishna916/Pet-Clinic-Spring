/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.Vet;

/**
 * @author krishna
 *
 */
@Repository
public interface VetRepository extends CrudRepository<Vet, Long>{

}
