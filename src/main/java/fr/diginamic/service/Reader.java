package fr.diginamic.service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import fr.diginamic.dto.FilmDto;
import fr.diginamic.entites.Film;


/**
 * @author Myriam Agag
 *
 */
public class Reader {

	public static List<Film> movieGenerate() throws StreamReadException, DatabindException, IOException {

		List<Film> movieBdd = new ArrayList<Film>();

		List<FilmDto> imdbDto = dtoGenerate();

		for (FilmDto film : imdbDto) {
			movieBdd.add(new Film(film.getIdImdb(), film.getNom(), film.getUrl(), film.getPlot(),
					film.getLangue(), film.getAnneeSortie(), DtoService.paysDtoToPays(film.getPays()),
					DtoService.lieuDtoToLieu(film.getLieuTournage()), 
					DtoService.genreDtoListToGenreList(film.getGenres()),
					DtoService.roleDtoListToRoleList(film.getRoles()), 
					DtoService.acteurDtoListToActeurList(film.getActeurs()), 
					DtoService.realisateurDtoListToRealisateurList(film.getRealisateurs())));
		}

		return movieBdd;
	}

	public static List<FilmDto> dtoGenerate() throws StreamReadException, DatabindException, IOException {

		File fileToParse = new File(
				"C:\\Users\\magag\\Downloads\\films.json");

		ObjectMapper mapper = new ObjectMapper();

		CollectionType collFilm = mapper.getTypeFactory().constructCollectionType(List.class, FilmDto.class);

		List<FilmDto> films = mapper.readValue(fileToParse, collFilm);

		return films;
	}

}
