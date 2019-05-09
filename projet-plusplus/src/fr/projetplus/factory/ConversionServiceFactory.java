package fr.projetplus.factory;

import fr.projetplus.model.Fichier;
import fr.projetplus.model.FichierCSV;
import fr.projetplus.model.FichierJson;
import fr.projetplus.model.FichierXML;
import fr.projetplus.model.FichierYML;
import fr.projetplus.service.ConversionCSVService;
import fr.projetplus.service.ConversionJsonService;
import fr.projetplus.service.ConversionService;
import fr.projetplus.service.ConversionXMLService;
import fr.projetplus.service.ConversionYMLService;

public class ConversionServiceFactory {
	
	public ConversionService creerConversionService(Fichier fichier) {
		ConversionService cs = null;
		switch(fichier.getExtension()) {
		case "csv":
			cs = new ConversionCSVService(fichier);
			break;
		case "json":
			cs = new ConversionJsonService(fichier);
			break;
		case "xml":
			cs = new ConversionXMLService(fichier);
			break;
		case "yml":
			cs = new ConversionYMLService(fichier);
			break;
		default :
			// Exception à créer
		}
		//cs = new ConversionService(fichier);
		return cs;
	}

}
