package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{
 @Query("Select case when Count(s)>0 then true else false"
		 + "end FROM Person s WHERE s.personId =?1")
 Boolean IsPersonExitsById(Integer id);
}
