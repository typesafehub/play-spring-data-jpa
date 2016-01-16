package models;

import org.springframework.data.repository.CrudRepository;

/**
 * Provides CRUD functionality for accessing people. Spring Data auto-magically takes care of many standard
 * operations here.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}