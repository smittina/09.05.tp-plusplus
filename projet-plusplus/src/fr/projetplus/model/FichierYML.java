package fr.projetplus.model;

import fr.projetplus.utils.TypeFile;

@TypeFile(yml=true)
public class FichierYML extends Fichier {

	public FichierYML(String nom, String origine, String destination, String option, String extension) {
		super(nom, origine, destination, option, extension);
	}

}
