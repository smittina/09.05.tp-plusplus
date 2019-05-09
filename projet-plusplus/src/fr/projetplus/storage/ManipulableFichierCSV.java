package fr.projetplus.storage;

import fr.projetplus.model.Fichier;
import fr.projetplus.utils.ConversionUtils;

public class ManipulableFichierCSV extends ManipulableFichier {

	public ManipulableFichierCSV(Fichier fic) {
		super(fic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String convertir() {
		System.out.println("MANIPULABLECSV CONVERTIR");
		String contenuConverti = ConversionUtils.convertToYML(getaManipuler());
		
		return contenuConverti;
	}

}
