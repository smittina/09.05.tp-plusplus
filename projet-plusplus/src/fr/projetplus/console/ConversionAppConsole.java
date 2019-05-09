package fr.projetplus.console;

import java.util.Scanner;

import fr.projetplus.constante.Constante;
import fr.projetplus.factory.ConversionServiceFactory;
import fr.projetplus.factory.FileFactory;
import fr.projetplus.model.Fichier;
import fr.projetplus.service.ConversionService;
import fr.projetplus.utils.StringUtils;

public class ConversionAppConsole {
	
	public void afficherAccueil() {
		System.out.println("**** CONVERTER **** ");
		System.out.println();
		System.out.println("Pour savoir comment utiliser le programme, exécutez la commande \n--> converter --help");
		System.out.println();
	}

	/**
	 * @todo Réviser les bugs pour le chemin ==> CHEMIN ABSOLU
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations et Initialisations
		ConversionAppConsole app = new ConversionAppConsole();
		Scanner scan = new Scanner(System.in);
		String commandUser = "";
		String nomFichier = "";
		String origineFichier = "";
		String destinationFichier = "";
		String extensionFichier = "";
		String optionFichier = "";
		
		// Début du programme
		app.afficherAccueil();
		commandUser = scan.nextLine();
		
		String[] commandeDecoupee = StringUtils.decouperChaine(commandUser, " ");
		
		String[] extensionDecoupee = StringUtils.decouperChaine(commandeDecoupee[Constante.POSITION_ORIGINE], "\\.");
		
		String[] nomDecoupee = StringUtils.decouperChaine(extensionDecoupee[Constante.POSITION_NOM], "\\\\");
		for(int i =0; i<nomDecoupee.length;i++) {
			System.out.println(nomDecoupee[i]);
		}
		nomFichier = nomDecoupee[nomDecoupee.length-1];
		optionFichier = commandeDecoupee[Constante.POSITION_OPTION];
		extensionFichier = extensionDecoupee[extensionDecoupee.length-1];
		for(int i=0; i<nomDecoupee.length-1;i++) {
			origineFichier += nomDecoupee[i]+"/";
		}
		destinationFichier = commandeDecoupee[Constante.POSITION_DESTINATION];
		
		
		System.out.print(nomFichier+" extension :"+extensionFichier);
		// Création du fichier
		FileFactory ff = new FileFactory();
		Fichier fic = ff.creerFichier(nomFichier, extensionFichier, origineFichier, destinationFichier, optionFichier);
				
		ConversionServiceFactory csf = new ConversionServiceFactory();
		ConversionService cs = csf.creerConversionService(fic);
		
		cs.executeCS();
		

		
	}

}
