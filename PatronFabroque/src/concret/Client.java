package concret;

import abstracts.AbstractFactory;
import abstracts.Oriental;
import abstracts.Reine;
import abstracts.TroisFromage;

public class Client {

	public static void main(String[] args) {
		
		String pays = "fr";
		String pays1 = "sn";
		String pays2 = "usa";
		AbstractFactory factory;
		AbstractFactory factory1;
		AbstractFactory factory2;
	    factory = AbstractFactory.createFactory(pays);
	    factory1 = AbstractFactory.createFactory(pays1);
	    factory2 = AbstractFactory.createFactory(pays2);
	    
	    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
	    System.out.println("                                                    ");
	    System.out.println("    composants pour les pizzas fabrique en france");
	    System.out.println("                                                    ");
	   
	    
	  Oriental pizza= factory.createOriental();
	  pizza.service();
	  Reine pizza1= factory.createReine();
	  pizza1.service();
	  TroisFromage pizza2= factory.createTroisFromage();
	  pizza2.service();
	  System.out.println("                                                    ");
	 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
	 System.out.println("                                                      ");
	 System.out.println("    composants pour les pizzas fabrique au senegal");
	 
	 System.out.println("                                                      ");
	 
	 Reine PR= factory1.createReine();
	  PR.service();
	  Oriental PR1= factory1.createOriental();
	  PR1.service();
	  TroisFromage PR2= factory1.createTroisFromage();
	  PR2.service();
	  System.out.println("                                                    ");
		 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"); 
		 System.out.println("                                                      ");
		 System.out.println("    composants pour les pizzas fabrique au usa");
		 
		 System.out.println("                                                      ");
		 
		 Reine Piz= factory2.createReine();
		  Piz.service();
		  Oriental Piz1= factory2.createOriental();
		  Piz1.service();
		  TroisFromage Piz2= factory2.createTroisFromage();
		  Piz2.service();
		

	}

}
