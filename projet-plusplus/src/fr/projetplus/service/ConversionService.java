package fr.projetplus.service;

import fr.projetplus.factory.ManipulableFactory;
import fr.projetplus.model.Fichier;
import fr.projetplus.storage.ManipulableFichier;

public class ConversionService {

	ManipulableFichier manip;
	
	public ConversionService(Fichier fic) {
		ManipulableFactory manF = new ManipulableFactory();
		manip = (ManipulableFichier) manF.creerManipulable(fic);
	}
	
	public ManipulableFichier getManip() {
		return manip;
	}

	public void setManip(ManipulableFichier manip) {
		this.manip = manip;
	}

	public void executeCS() {
		// LIRE 
		//getManip().lire();
		// CONVERTIR
		getManip().convertir();
		// ENREGISTER
		
	};
}
