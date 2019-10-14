/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.Visit;

/**
 * @author krishna
 *
 */
@Repository
public interface VisitRepository extends CrudRepository<Visit, Long>{

}
