package ma.novelis.spring.NameSearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.novelis.spring.NameSearch.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
}
