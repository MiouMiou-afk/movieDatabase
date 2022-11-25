package fr.diginamic.dto;



/**
 * @author Myriam Agag
 *
 */
public class RealisateurDto {

	private String identite;

	private String url;

	/**
	 * Constructeur
	 * 
	 */
	public RealisateurDto() {
	}

	/**
	 * Getter pour l'attribut identite
	 * 
	 * @return identite
	 */
	public String getIdentite() {
		return identite;
	}

	/**
	 * Setter pour l'attribut identite
	 * 
	 * @param set identite
	 */
	public void setIdentite(String identite) {
		this.identite = identite;
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
		return "RealisateurDto [identite=" + identite + ", url=" + url + "]";
	}

}
