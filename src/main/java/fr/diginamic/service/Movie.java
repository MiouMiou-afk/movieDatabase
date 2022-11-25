/**
 * 
 */
package fr.diginamic.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;

import fr.diginamic.entites.Film;

/**
 * @author Myriam Agag
 *
 */
public class Movie {
	
	private List<Film> films = new ArrayList<Film>();

	/**Constructeur
	 * @param films
	 * @throws IOException 
	 * @throws DatabindException 
	 * @throws StreamReadException 
	 */
	public Movie() throws StreamReadException, DatabindException, IOException {
		this.films = Reader.movieGenerate();
	}

	/**Getter pour l'attribut films
	 * @return films
	 */
	public List<Film> getFilms() {
		return films;
	}

	/**Setter pour l'attribut films
	 * @param set films
	 */
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	
	

}
