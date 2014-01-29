
import java.util.Scanner;

import edu.stanford.nlp.tagger.maxent.MaxentTagger;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MaxentTagger tagger  = new MaxentTagger("Models/english-left3words-distsim.tagger");
		
		String frase = scanner.nextLine(); 
		System.out.println(frase);
		System.out.println(tagger.tagString(frase));
		
		scanner.close();
	}

}
