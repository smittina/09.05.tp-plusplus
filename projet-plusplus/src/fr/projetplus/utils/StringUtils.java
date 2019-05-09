package fr.projetplus.utils;

public class StringUtils {

	public static String[] decouperChaine(String aDecouper, String separateur) {
		String[] maDecoupe=null;
		maDecoupe = aDecouper.split(separateur);
		 
		return maDecoupe;
	}
	
	public static String rechercherMotAUnePosition(int index, String[] chaine) {
		return chaine[index];
	}
}
