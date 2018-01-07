package ma.novelis.spring.NameSearch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Prénom")
	private String prenom;
	
	//Constructeur public avec les paramétres.
	public Person(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	/*getters & setters
	 * 
	 */
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public long getId() {
		
		return id;
	}
	
	//Constructeur par defaut protégé.
	protected Person(){
		
	}

	
	
}
