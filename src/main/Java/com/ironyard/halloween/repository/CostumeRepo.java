
package com.ironyard.halloween.repository;


import com.ironyard.halloween.data.Costume;
import org.springframework.data.repository.CrudRepository;

/**
 * Means we will be dealing with 'Movie' objects and their primary
 * key will be of type 'Long' aka long
 * CrudRepository<Movie, Long>
 */
public interface CostumeRepo extends CrudRepository<Costume, Long>
{

}