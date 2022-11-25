package fr.diginamic.entites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Myriam Agag
 *
 */

@Entity
@Table
public class Lieu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "LIBELLE")
	private String libelle;

	@Column(name = "COMPLEMENT")
	private String complement;

	@ManyToOne
	@JoinColumn(name = "ID_PAYS_LIEU")
	private Pays pays;

	@OneToMany(mappedBy = "lieuNaissance")
	private Set<Acteur> acteurs = new HashSet<Acteur>();

	@OneToMany(mappedBy = "lieuTournage")
	private Set<Film> films = new HashSet<Film>();

	/**
	 * Constructeur
	 * 
	 */
	public Lieu() {
	}

	/**
	 * Constructeur
	 * 
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public Lieu(String ville, String etatDept, Pays pays) {
		this.libelle = ville;
		this.complement = etatDept;
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param set id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut libelle
	 * 
	 * @return libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter pour l'attribut libelle
	 * 
	 * @param set libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter pour l'attribut complement
	 * 
	 * @return complement
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * Setter pour l'attribut complement
	 * 
	 * @param set complement
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}

	/**
	 * Getter pour l'attribut pays
	 * 
	 * @return pays
	 */
	public Pays getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * 
	 * @param set pays
	 */
	public void setPays(Pays pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut acteurs
	 * 
	 * @return acteurs
	 */
	public Set<Acteur> getActeurs() {
		return acteurs;
	}

	/**
	 * Setter pour l'attribut acteurs
	 * 
	 * @param set acteurs 
	 */
	public void setActeurs(Set<Acteur> acteurs) {
		this.acteurs = acteurs;
	}

	/**
	 * Getter pour l'attribut films
	 * 
	 * @return films
	 */
	public Set<Film> getFilms() {
		return films;
	}

	/**
	 * Setter pour l'attribut films
	 * 
	 * @param set films
	 */
	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	@Override
	public String toString() {
		return "Lieu [id=" + id + ", libelle=" + libelle + ", complement=" + complement + ", pays=" + pays
				+ ", acteurs=" + acteurs + ", films=" + films + "]";
	}

}
