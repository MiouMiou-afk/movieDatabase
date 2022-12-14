package fr.diginamic.dto;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import fr.diginamic.service.YearDeserializer;

public class FilmDto {

	@JsonProperty("id")
	private String idImdb;

	private String nom;

	private String url;

	private String plot;

	private String langue;

	@JsonDeserialize(using = YearDeserializer.class)
	private Year anneeSortie;

	private PaysDto pays;

	@JsonInclude(Include.NON_NULL)
	private LieuDto lieuTournage;

	private Set<GenreDto> genres = new HashSet<GenreDto>();

	private Set<RoleDto> roles = new HashSet<RoleDto>();

	@JsonProperty("castingPrincipal")
	private Set<ActeurDto> acteurs = new HashSet<ActeurDto>();

	private Set<RealisateurDto> realisateurs = new HashSet<RealisateurDto>();

	/**
	 * Constructeur
	 * 
	 */
	public FilmDto() {
	}

	/**
	 * Constructeur
	 * 
	 * @param idImdb
	 */
	public FilmDto(String idImdb) {
		this.idImdb = idImdb;
	}

	/**
	 * Constructeur
	 * 
	 * @param idImdb
	 * @param nom
	 * @param url
	 * @param plot
	 * @param langue
	 * @param anneeSortie
	 * @param pays
	 * @param lieuTournage
	 * @param genres
	 * @param roles
	 * @param acteurs
	 * @param realisateurs
	 */
	public FilmDto(String idImdb, String nom, String url, String plot, String langue, Year anneeSortie, PaysDto pays,
			LieuDto lieuTournage, Set<GenreDto> genres, Set<RoleDto> roles, Set<ActeurDto> acteurs,
			Set<RealisateurDto> realisateurs) {
		this.idImdb = idImdb;
		this.nom = nom;
		this.url = url;
		this.plot = plot;
		this.langue = langue;
		this.anneeSortie = anneeSortie;
		this.pays = pays;
		this.lieuTournage = lieuTournage;
		this.genres = genres;
		this.roles = roles;
		this.acteurs = acteurs;
		this.realisateurs = realisateurs;
	}

	/**
	 * Getter pour l'attribut idImdb
	 * 
	 * @return idImdb
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
	 * @return  url
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
	 * Getter pour l'attribut plot
	 * 
	 * @return  plot
	 */
	public String getPlot() {
		return plot;
	}

	/**
	 * Setter pour l'attribut plot
	 * 
	 * @param set plot
	 */
	public void setPlot(String plot) {
		this.plot = plot;
	}

	/**
	 * Getter pour l'attribut langue
	 * 
	 * @return langue
	 */
	public String getLangue() {
		return langue;
	}

	/**
	 * Setter pour l'attribut langue
	 * 
	 * @param set langue
	 */
	public void setLangue(String langue) {
		this.langue = langue;
	}

	/**
	 * Getter pour l'attribut anneeSortie
	 * 
	 * @return anneeSortie
	 */
	public Year getAnneeSortie() {
		return anneeSortie;
	}

	/**
	 * Setter pour l'attribut anneeSortie
	 * 
	 * @param set anneeSortie
	 */
	public void setAnneeSortie(Year anneeSortie) {
		this.anneeSortie = anneeSortie;
	}

	/**
	 * Getter pour l'attribut pays
	 * 
	 * @return pays
	 */
	public PaysDto getPays() {
		return pays;
	}

	/**
	 * Setter pour l'attribut pays
	 * 
	 * @param set pays
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}

	/**
	 * Getter pour l'attribut lieuTournage
	 * 
	 * @return lieuTournage
	 */
	public LieuDto getLieuTournage() {
		return lieuTournage;
	}

	/**
	 * Setter pour l'attribut lieuTournage
	 * 
	 * @param set lieuTournage
	 */
	public void setLieuTournage(LieuDto lieuTournage) {
		this.lieuTournage = lieuTournage;
	}

	/**
	 * Getter pour l'attribut genres
	 * 
	 * @return genres
	 */
	public Set<GenreDto> getGenres() {
		return genres;
	}

	/**
	 * Setter pour l'attribut genres
	 * 
	 * @param set genres 
	 */
	public void setGenres(Set<GenreDto> genres) {
		this.genres = genres;
	}

	/**
	 * Getter pour l'attribut roles
	 * 
	 * @return  roles
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

	/**
	 * Getter pour l'attribut acteurs
	 * 
	 * @return acteurs
	 */
	public Set<ActeurDto> getActeurs() {
		return acteurs;
	}

	/**
	 * Setter pour l'attribut acteurs
	 * 
	 * @param set acteurs
	 */
	public void setActeurs(Set<ActeurDto> acteurs) {
		this.acteurs = acteurs;
	}

	/**
	 * Getter pour l'attribut realisateurs
	 * 
	 * @return realisateurs
	 */
	public Set<RealisateurDto> getRealisateurs() {
		return realisateurs;
	}

	/**
	 * Setter pour l'attribut realisateurs
	 * 
	 * @param set realisateurs 
	 */
	public void setRealisateurs(Set<RealisateurDto> realisateurs) {
		this.realisateurs = realisateurs;
	}

	@Override
	public String toString() {
		return "FilmDto [idImdb=" + idImdb + ", nom=" + nom + ", url=" + url + ", plot=" + plot + ", langue=" + langue
				+ ", anneeSortie=" + anneeSortie + ", pays=" + pays + ", lieuTournage=" + lieuTournage + ", genres="
				+ genres + ", roles=" + roles + ", acteurs=" + acteurs + ", realisateurs=" + realisateurs + "]";
	}


}