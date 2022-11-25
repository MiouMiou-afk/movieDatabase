package fr.diginamic.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Myriam Agag
 *
 */
public class LieuDto {

	@JsonProperty("ville")
	private String libelle;

	@JsonProperty("etatDept")
	private String complement;

	private PaysDto pays;

	/**
	 * Constructeur
	 * 
	 */
	public LieuDto() {
	}
	
	

	/**Constructeur
	 * @param pays
	 */
	public LieuDto(PaysDto pays) {
		super();
		this.pays = pays;
	}

	/**Constructeur
	 * @param ville
	 * @param pays
	 */
	public LieuDto(String ville, PaysDto pays) {
		super();
		this.libelle = ville;
		this.pays = pays;
	}



	/**Constructeur
	 * @param ville
	 * @param etatDept
	 * @param pays
	 */
	public LieuDto(String ville, String etatDept, PaysDto pays) {
		super();
		this.libelle = ville;
		this.complement = etatDept;
		this.pays = pays;
	}



	/**Getter pour l'attribut libelle
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}



	/**Setter pour l'attribut libelle
	 * @param set libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	/**Getter pour l'attribut complement
	 * @return complement
	 */
	public String getComplement() {
		return complement;
	}



	/**Setter pour l'attribut complement
	 * @param set complement
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}



	/**Getter pour l'attribut pays
	 * @return pays
	 */
	public PaysDto getPays() {
		return pays;
	}



	/**Setter pour l'attribut pays
	 * @param set pays
	 */
	public void setPays(PaysDto pays) {
		this.pays = pays;
	}


	@Override
	public String toString() {
		return "LieuDto [libelle=" + libelle + ", complement=" + complement + ", pays=" + pays + "]";
	}
	

}
