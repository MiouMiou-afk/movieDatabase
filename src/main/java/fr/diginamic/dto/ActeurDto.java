package fr.diginamic.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Myriam Agag
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ActeurDto {

	@JsonProperty("id")
	private String idImdb;

	@JsonProperty("identite")
	private String identite;

	private LocalDate dateNaissance;

	private LieuDto lieuNaissance;

	@JsonProperty("naissance")
	private void unpack(Map<String, String> naissanceObject) {
		if (naissanceObject != null) {
			String lieuNaissanceString = naissanceObject.get("lieuNaissance");
			if (lieuNaissanceString != null) {
				String[] lieuNaissanceDecoupe = lieuNaissanceString.split(",");
				if (lieuNaissanceDecoupe.length == 3) {
					this.lieuNaissance = new LieuDto(lieuNaissanceDecoupe[0], lieuNaissanceDecoupe[1], new PaysDto(lieuNaissanceDecoupe[2]));
				}else if (lieuNaissanceDecoupe.length ==1){
					this.lieuNaissance = new LieuDto(new PaysDto(lieuNaissanceDecoupe[0]));
				}else if(lieuNaissanceDecoupe.length == 2) {
					this.lieuNaissance = new LieuDto(lieuNaissanceDecoupe[0], new PaysDto(lieuNaissanceDecoupe[1]));
				}else if (lieuNaissanceDecoupe.length >3){
					this.lieuNaissance = new LieuDto(lieuNaissanceDecoupe[1], lieuNaissanceDecoupe[2], new PaysDto(lieuNaissanceDecoupe[3]));
				}
			}
			String date = naissanceObject.get("dateNaissance");
			if (StringUtils.isNotEmpty(date) && date.indexOf("-0-0")==-1 && !date.endsWith("-0") && !date.startsWith("0-")){
				this.dateNaissance = LocalDate.parse(date,
						DateTimeFormatter.ofPattern("yyyy-M-d"));
			}

		}

	}

	private String height;

	private String url;

	private Set<RoleDto> roles = new HashSet<RoleDto>();

	/**
	 * Constructeur
	 * 
	 */
	public ActeurDto() {
	}

	/**
	 * Getter pour l'attribut idImdb
	 * 
	 * @return  idImdb
	 */
	public String getIdImdb() {
		return idImdb;
	}

	/**
	 * Setter pour l'attribut idImdb
	 * 
	 * @param set idImdb
	 */
	public void setIdImdb(String idImdb) {
		this.idImdb = idImdb;
	}

	/**
	 * Getter pour l'attribut identite
	 * 
	 * @return  identite
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

	/**
	 * Getter pour l'attribut dateNaissance
	 * 
	 * @return dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter pour l'attribut dateNaissance
	 * 
	 * @param set dateNaissance
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Getter pour l'attribut roles
	 * 
	 * @return roles
	 */
	public Set<RoleDto> getRoles() {
		return roles;
	}

	/**
	 * Setter pour l'attribut roles
	 * 
	 * @param set roles 
	 */
	public void setRoles(Set<RoleDto> roles) {
		this.roles = roles;
	}

	/**Getter pour l'attribut lieuNaissance
	 * @return lieuNaissance
	 */
	public LieuDto getLieuNaissance() {
		return lieuNaissance;
	}

	/**Setter pour l'attribut lieuNaissance
	 * @param set lieuNaissance
	 */
	public void setLieuNaissance(LieuDto lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
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
		return "ActeurDto [idImdb=" + idImdb + ", identite=" + identite + ", dateNaissance=" + dateNaissance
				+ ", lieuNaissance=" + lieuNaissance + ", height=" + height + ", url=" + url + ", roles=" + roles + "]";
	}

}