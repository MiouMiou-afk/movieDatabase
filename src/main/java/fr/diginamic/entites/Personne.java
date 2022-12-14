package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



/**
 * @author Myriam Agag
 *
 */

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	
	@Column(name = "IDENTITE")
	protected String identite;
	
	@Column(name = "URL")
	protected String url;

	public Personne() {
	}

	/**Constructeur
	 * @param identite
	 * @param url
	 */
	public Personne(String identite, String url) {
		this.identite = identite;
		this.url = url;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identite == null) ? 0 : identite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (identite == null) {
			if (other.identite != null)
				return false;
		} else if (!identite.equals(other.identite))
			return false;
		return true;
	}

	/**Getter pour l'attribut id
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter pour l'attribut identite
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**Setter pour l'attribut identite
	 * @param set identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
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

	@Override
	public String toString() {
		return "Personne [id=" + id + ", identite=" + identite + ", url=" + url + "]";
	}
	
	

}


