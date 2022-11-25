package fr.diginamic.entites;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Myriam Agag
 *
 */

@Entity
@Table
public class Acteur extends Personne {
	
	@Column(name = "ID_IMDB")
	private String idImdb;
	
	@Column(name = "HEIGHT")
	private String height;
	
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@ManyToOne
	@JoinColumn(name = "ID_LIEU_NAISSANCE")
	private Lieu lieuNaissance;
	
	@ManyToMany
	@JoinTable(name = "ROLE_ACTEUR", joinColumns = @JoinColumn(name = "ID_ACTEUR", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID"))
	private Set<Role> roles = new HashSet<Role>();
	
	@ManyToMany(mappedBy = "acteurs")
	private Set<Film> films = new HashSet<Film>();
	

	/**Constructeur
	 * 
	 */
	public Acteur() {
	}

	/**Constructeur
	 * @param identite
	 * @param url
	 */
	public Acteur(String identite, String url) {
		super(identite, url);
		// TODO Auto-generated constructor stub
	}
	
	

	/**Constructeur
	 * @param idImdb
	 * @param height
	 * @param dateNaissance
	 * @param lieuNaissance
	 */
	public Acteur(String identite, String url, String idImdb, String height, LocalDate dateNaissance, Lieu lieuNaissance) {
		super(identite, url);
		this.idImdb = idImdb;
		this.height = height;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
	}

	/**Getter pour l'attribut height
	 * @return  height
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



	/**Getter pour l'attribut dateNaissance
	 * @return  dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}



	/**Setter pour l'attribut dateNaissance
	 * @param set dateNaissance 
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



	/**Getter pour l'attribut roles
	 * @return  roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}



	/**Setter pour l'attribut roles
	 * @param set roles
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



	/**Getter pour l'attribut films
	 * @return  films
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
	
	



	/**Getter pour l'attribut idImdb
	 * @return  idImdb
	 */
	public String getIdImdb() {
		return idImdb;
	}

	/**Setter pour l'attribut idImdb
	 * @param set idImdb
	 */
	public void setIdImdb(String idImdb) {
		this.idImdb = idImdb;
	}

	/**Getter pour l'attribut lieuNaissance
	 * @return  lieuNaissance
	 */
	public Lieu getLieuNaissance() {
		return lieuNaissance;
	}

	/**Setter pour l'attribut lieuNaissance
	 * @param set lieuNaissance
	 */
	public void setLieuNaissance(Lieu lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	@Override
	public String toString() {
		return super.toString() + "Acteur [idImdb=" + idImdb + ", height=" + height + ", dateNaissance=" + dateNaissance
				+ ", lieuNaissance=" + lieuNaissance + ", roles=" + roles + ", films=" + films + "]";
	}

	

	

}
