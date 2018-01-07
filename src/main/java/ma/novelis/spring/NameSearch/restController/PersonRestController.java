package ma.novelis.spring.NameSearch.restController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ma.novelis.spring.NameSearch.entity.Person;
import ma.novelis.spring.NameSearch.exception.ExceptionResponse;
import ma.novelis.spring.NameSearch.repository.PersonRepository;

//Controlleur du web service REST.
@RestController
public class PersonRestController {
	
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping(path="/persons/{name}")
	public List<Person> retreiveByName(@PathVariable("name") String name){
		
		//Obtenir tous les personnes de la table person.
		List<Person> all = personRepository.findAll();
		
		//Si la table Person est vide.
		if(all.size()==0){
			throw new ExceptionResponse("The Person table is empty");
		}
		
		List<Person> list =  new ArrayList<>();
		
		/*rechercher dans la liste obtenue 
		 * les personnes dont le nom ou le prénom contient 
		 * le mot clé passé en paramétre.
		 */
		for(int i=0;i<all.size();i++){
			if(all.get(i).getNom().contains(name) || all.get(i).getPrenom().contains(name)){
				list.add(all.get(i));
			}
		}
		
		/*Si il n'existe aucun person
		 * que son nom ou son prenom contient le mot clé.
		 */
		if(list.size()==0){
			throw new ExceptionResponse("No person exit that his first name or last name contains the key word ");
		}
		/*retourner la liste des personnes
		 *  aprés la recherche sous format de JSON 
		 */
		return list;
	}
}
