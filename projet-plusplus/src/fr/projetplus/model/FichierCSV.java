package fr.projetplus.model;

import fr.projetplus.utils.TypeFile;


@TypeFile(csv=true)
public class FichierCSV extends Fichier {

	public FichierCSV(String nom, String origine, String destination, String option,  String extension) {
		super(nom, origine, destination, option, extension);
	}

	

	
}
