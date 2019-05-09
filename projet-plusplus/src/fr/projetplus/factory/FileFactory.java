package fr.projetplus.factory;

import fr.projetplus.model.Fichier;
import fr.projetplus.model.FichierCSV;
import fr.projetplus.model.FichierJson;
import fr.projetplus.model.FichierXML;
import fr.projetplus.model.FichierYML;

public class FileFactory {

	public Fichier creerFichier(String nom, String extension, String origine, String destination, String option) {
		Fichier fic = null;
		switch(extension) {
		case "csv":
			fic = new FichierCSV(nom, origine, destination, option, extension);
			break;
		case "json":
			fic = new FichierJson(nom, origine, destination, option, extension);
			break;
		case "xml":
			fic = new FichierXML(nom, origine, destination, option, extension);
			break;
		case "yml":
			fic = new FichierYML(nom, origine, destination, option, extension);
			break;
		default :
			// Exception à créer
		}
		return fic;
	}
}
