package fr.diginamic.service;

import java.util.HashSet;
import java.util.Set;

import fr.diginamic.dto.ActeurDto;
import fr.diginamic.dto.GenreDto;
import fr.diginamic.dto.LieuDto;
import fr.diginamic.dto.PaysDto;
import fr.diginamic.dto.RealisateurDto;
import fr.diginamic.dto.RoleDto;
import fr.diginamic.entites.Acteur;
import fr.diginamic.entites.Film;
import fr.diginamic.entites.Genre;
import fr.diginamic.entites.Lieu;
import fr.diginamic.entites.Pays;
import fr.diginamic.entites.Realisateur;
import fr.diginamic.entites.Role;

/**
 * @author Myriam Agag
 *
 */
public class DtoService {

	public static Pays paysDtoToPays(PaysDto paysDto) {
		if (paysDto != null) {
			Pays pays = new Pays(paysDto.getNom(), paysDto.getUrl());
			return pays;
		}
		return null;
	}

	public static Lieu lieuDtoToLieu(LieuDto lieuDto) {
		if (lieuDto != null) {
			Lieu lieu = new Lieu(lieuDto.getLibelle(), lieuDto.getComplement(), paysDtoToPays(lieuDto.getPays()));
			return lieu;
		}
		return null;
	}

	public static Genre genreDtoToGenre(GenreDto genreDto) {
		Genre genre = new Genre(genreDto.getLibelle());
		return genre;
	}

	public static Set<Genre> genreDtoListToGenreList(Set<GenreDto> genreListDto) {
		Set<Genre> genreList = new HashSet<Genre>();
		for (GenreDto genres : genreListDto) {
			genreList.add(genreDtoToGenre(genres));
		}
		return genreList;
	}

	public static Acteur acteurDtoToActeur(ActeurDto acteurDto) {
		Acteur acteur = new Acteur(acteurDto.getIdentite(), acteurDto.getUrl(), acteurDto.getIdImdb(),
				acteurDto.getHeight(), acteurDto.getDateNaissance(), lieuDtoToLieu(acteurDto.getLieuNaissance()));
		return acteur;

	}

	public static Set<Acteur> acteurDtoListToActeurList(Set<ActeurDto> acteurListDto) {
		Set<Acteur> acteurList = new HashSet<Acteur>();
		for (ActeurDto acteurs : acteurListDto) {
			acteurList.add(acteurDtoToActeur(acteurs));
		}
		return acteurList;
	}

	public static Role roleDtoToRole(RoleDto roleDto) {
		Role role = new Role(roleDto.getCharacterName(), roleDto.getUrl(), roleDto.getHeight());
		role.getActeurs().add(acteurDtoToActeur(roleDto.getActeur()));
		role.getFilms().add(new Film(roleDto.getFilm()));
		return role;
	}

	public static Set<Role> roleDtoListToRoleList(Set<RoleDto> roleListDto) {
		Set<Role> roleList = new HashSet<Role>();
		for (RoleDto roles : roleListDto) {
			roleList.add(roleDtoToRole(roles));
		}
		return roleList;
	}

	public static Realisateur realisateurDtoToRealisateur(RealisateurDto realisateurDto) {
		Realisateur realisateur = new Realisateur(realisateurDto.getIdentite(), realisateurDto.getUrl());
		return realisateur;
	}

	public static Set<Realisateur> realisateurDtoListToRealisateurList(Set<RealisateurDto> realisateurListDto) {
		Set<Realisateur> realisateurList = new HashSet<Realisateur>();
		for (RealisateurDto realisateurs : realisateurListDto) {
			realisateurList.add(realisateurDtoToRealisateur(realisateurs));
		}
		return realisateurList;
	}
}
