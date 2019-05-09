package fr.projetplus.factory;

import fr.projetplus.model.Fichier;
import fr.projetplus.model.FichierCSV;
import fr.projetplus.model.FichierJson;
import fr.projetplus.model.FichierXML;
import fr.projetplus.model.FichierYML;
import fr.projetplus.storage.Manipulable;
import fr.projetplus.storage.ManipulableFichierCSV;
import fr.projetplus.storage.ManipulableFichierJson;
import fr.projetplus.storage.ManipulableFichierXML;
import fr.projetplus.storage.ManipulableFichierYML;

public class ManipulableFactory {

	public Manipulable<Fichier> creerManipulable(Fichier fic){
		
		Manipulable<Fichier> man = null;
		switch(fic.getExtension()) {
		case "csv":
			man = new ManipulableFichierCSV(fic);
			break;
		case "json":
			man = new ManipulableFichierJson(fic);
			break;
		case "xml":
			man = new ManipulableFichierXML(fic);
			break;
		case "yml":
			man = new ManipulableFichierYML(fic);
			break;
		default :
			// Exception à créer
		}
		return man;
	}
}
