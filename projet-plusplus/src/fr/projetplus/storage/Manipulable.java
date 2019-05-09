package fr.projetplus.storage;

import fr.projetplus.model.Fichier;

public interface Manipulable<T> {
	
	public void lire(Fichier f); 
	public String convertir();
	public T enregister();
	
}
