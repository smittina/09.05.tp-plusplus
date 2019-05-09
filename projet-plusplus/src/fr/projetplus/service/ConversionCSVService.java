package fr.projetplus.service;

import fr.projetplus.model.Fichier;

public class ConversionCSVService extends ConversionService {

	public ConversionCSVService(Fichier fic) {
		super(fic);
		
	}

	@Override
	public void executeCS() {
		getManip().lire(getManip().getaManipuler());
		// POINT SENSIBLE : 
		getManip().convertir();
		// getManip().enregistrer();

	}

	@Override
	public String toString() {
		return "ConversionCSVService [toString()=" + super.toString() + "]";
	}

	
}
