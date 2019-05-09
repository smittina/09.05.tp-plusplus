package fr.projetplus.utils;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import fr.projetplus.model.Fichier;

public class ConversionUtils {
	
	private static String convertCSVToYML(String str) {
		String yml = "";
		// On stocke les valeurs de la première ligne : nom1, nom2, nom3, etc...
		StringTokenizer st = new StringTokenizer(str);
		String firstLine = st.nextToken();
		System.out.println(firstLine);
	     /*while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken());
	     }*/
		
		return yml;
	}
	
	public static String convertToYML(Fichier fic) {
		String yml = "";
		System.out.println("Hello");
		// Récupération de l'annotation sur l'objet fic
		
		Class<? extends Fichier> aClass = fic.getClass();
		Annotation[] annotations = aClass.getAnnotations();

		for(Annotation annotation : annotations){
		    if(annotation instanceof TypeFile){
		    	TypeFile myAnnotation = (TypeFile) annotation;
		        if(myAnnotation.csv()) {
		        	yml = convertCSVToYML(fic.getContenu());
		        	
		        	// Pour toutes les autres lignes on créé nom1 : valeur1(delaligne), nom2 : valeur2(delaligne)
		        }
		        if(myAnnotation.json()) {
		        	//on stocke la première ligne : nom1, nom2 etc..
		        	// Pour toutes les autres lignes : "nom1" : "valeur"1,
		        }
		        if(myAnnotation.xml()) {
		        	
		        }
		        
		    }
		}
		System.out.println(fic.getClass().getSimpleName());
		
		
		
		// Traitement différents en fonction de l'annotation de la classe
		return yml;
	}
	
	public static String convertToJson(Fichier fic) {
		String json = "";
		// Traitement différents en fonction de l'annotation de la classe
		return json;
	}
	
	public static String convertToXML(Fichier fic) {
		String xml = "";
		// Traitement différents en fonction de l'annotation de la classe
		return xml;
	}
	
	
}
