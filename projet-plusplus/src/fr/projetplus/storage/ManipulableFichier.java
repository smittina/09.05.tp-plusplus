package fr.projetplus.storage;

import java.io.BufferedReader;
import java.io.FileReader;

import fr.projetplus.model.Fichier;

public abstract class ManipulableFichier implements Manipulable<Fichier> {
	
	private Fichier aManipuler;
	

	public ManipulableFichier(Fichier fic) {
		
		this.aManipuler = fic;
	}

	/**
	 * Lit le contenu d'un fichier et le stocke dans la classe fichier correspondante
	 */
	@Override
	public void lire(Fichier f) {

		String contenu = "";
		try {
			String ligne ;
			BufferedReader fichier1 = new BufferedReader(new FileReader("C:\\Users\\Formation\\Documents\\WorkSpace09.05\\projet-plusplus\\test.csv"));
			while ((ligne = fichier1.readLine()) != null) {
				contenu += ligne;
			}
			fichier1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}     
		// Sauvegarde du contenu dans le fichier
		aManipuler.setContenu(contenu);
		System.out.println(aManipuler.getContenu());
	}

	
	@Override
	public abstract String convertir();

	@Override
	public Fichier enregister() {
		Fichier f = null;
		return f;
		
	}

	public Fichier getaManipuler() {
		return aManipuler;
	}

	public void setaManipuler(Fichier aManipuler) {
		this.aManipuler = aManipuler;
	}
	
	

	

}
