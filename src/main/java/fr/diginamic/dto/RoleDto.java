package fr.diginamic.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Myriam Agag
 *
 */
public class RoleDto {

	private String characterName;

	@JsonProperty("acteur")
	private ActeurDto acteur;

	private String url;

	private String height;

	private String film;

	/**
	 * Constructeur
	 * 
	 */
	public RoleDto() {
	}

	/**
	 * Getter pour l'attribut characterName
	 * 
	 * @return characterName
	 */
	public String getCharacterName() {
		return characterName;
	}

	/**
	 * Setter pour l'attribut characterName
	 * 
	 * @param set characterName 
	 */
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	/**
	 * Getter pour l'attribut film
	 * 
	 * @return film
	 */
	public String getFilm() {
		return film;
	}

	/**
	 * Setter pour l'attribut film
	 * 
	 * @param set film
	 */
	public void setFilm(String film) {
		this.film = film;
	}

	/**
	 * Getter pour l'attribut acteur
	 * 
	 * @return acteur
	 */
	public ActeurDto getActeur() {
		return acteur;
	}

	/**
	 * Setter pour l'attribut acteur
	 * 
	 * @param set acteur 
	 */
	public void setActeur(ActeurDto acteur) {
		this.acteur = acteur;
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

	/**
	 * Getter pour l'attribut height
	 * 
	 * @return height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * Setter pour l'attribut height
	 * 
	 * @param set height
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "RoleDto [characterName=" + characterName + ", acteur=" + acteur + ", url=" + url + ", height=" + height
				+ ", film=" + film + "]";
	}

}
