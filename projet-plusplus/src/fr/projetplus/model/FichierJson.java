package fr.projetplus.model;

import fr.projetplus.utils.TypeFile;

@TypeFile(json=true)
public class FichierJson extends Fichier {

	public FichierJson(String nom, String origine, String destination, String option, String extension) {
		super(nom, origine, destination, option, extension);
	}



}
