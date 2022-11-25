package fr.diginamic.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Myriam Agag
 *
 */

@Entity
@Table
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "CHARACTER_NAME")
	private String characterName;
	
	@Column(name = "URL")
	private String url;
	
	@Column(name = "HEIGHT")
	private String height;
	
	@ManyToMany(mappedBy = "roles")
	private Set<Film> films = new HashSet<Film>();
	
	@ManyToMany(mappedBy = "roles")
	private Set<Acteur> acteurs = new HashSet<Acteur>();

	/**Constructeur
	 * 
	 */
	public Role() {
	}

	/**Constructeur
	 * @param characterName
	 * @param url
	 * @param height
	 */
	public Role(String characterName, String url, String height) {
		this.characterName = characterName;
		this.url = url;
		this.height = height;
	}

	/**Getter pour l'attribut id
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param set id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter pour l'attribut characterName
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**Setter pour l'attribut characterName
	 * @param set characterName
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
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

	/**Getter pour l'attribut acteurs
	 * @return the acteurs
	 */
	public Set<Acteur> getActeurs() {
		return acteurs;
	}

	/**Setter pour l'attribut acteurs
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(Set<Acteur> acteurs) {
		this.acteurs = acteurs;
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

	/**Getter pour l'attribut height
	 * @return height
	 */
	public String getHeight() {
		return height;
	}

	/**Setter pour l'attribut height
	 * @param set height
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", characterName=" + characterName + ", url=" + url + ", height=" + height
				+ ", films=" + films + ", acteurs=" + acteurs + "]";
	}
	
}
