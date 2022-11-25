package fr.diginamic.dto;

/**
 * @author Myriam Agag
 *
 */
public class PaysDto {

	private String nom;

	private String url;

	/**
	 * Constructeur
	 * 
	 */
	public PaysDto() {
	}

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public PaysDto(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param set nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut url
	 * 
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Setter pour l'attribut url
	 * 
	 * @param set url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "PaysDto [nom=" + nom + ", url=" + url + "]";
	}
	
	

	

}
