package fr.diginamic.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Myriam Agag
 *
 */

@Entity
@Table
public class Pays {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "URL")
	private String url;
	
	@OneToMany(mappedBy = "pays")
	private Set<Film> films = new HashSet<Film>();
	
	@OneToMany(mappedBy = "pays")
	private Set<Lieu> lieux = new HashSet<Lieu>();

	/**Constructeur
	 * 
	 */
	public Pays() {
	}
	

	/**Constructeur
	 * @param nom
	 */
	public Pays(String nom) {
		this.nom = nom;
	}

	/**Constructeur
	 * @param nom
	 * @param url
	 */
	public Pays(String nom, String url) {
		this.nom = nom;
		this.url = url;
	}


	/**Getter pour l'attribut id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter pour l'attribut nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour l'attribut nom
	 * @param set nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter pour l'attribut url
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**Setter pour l'attribut url
	 * @param set url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**Getter pour l'attribut films
	 * @return films
	 */
	public Set<Film> getFilms() {
		return films;
	}

	/**Setter pour l'attribut films
	 * @param set films
	 */
	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	/**Getter pour l'attribut lieux
	 * @return lieux
	 */
	public Set<Lieu> getLieux() {
		return lieux;
	}

	/**Setter pour l'attribut lieux
	 * @param set lieux
	 */
	public void setLieux(Set<Lieu> lieux) {
		this.lieux = lieux;
	}


	@Override
	public String toString() {
		return "Pays [id=" + id + ", nom=" + nom + ", url=" + url + ", films=" + films + ", lieux=" + lieux + "]";
	}
	
	
}
