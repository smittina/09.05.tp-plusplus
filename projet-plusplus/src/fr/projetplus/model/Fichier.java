package fr.projetplus.model;


public class Fichier {
	
	private String nom;
	private String extension;
	private String origine;
	private String destination;
	private String contenu;
	private String option;
	
	public Fichier(String nom, String origine, String destination, String option, String extension) {
		this.nom = nom;
		this.origine = origine;
		this.destination = destination;
		this.option = option;
		this.setExtension(extension);
		contenu = "";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
	
}
