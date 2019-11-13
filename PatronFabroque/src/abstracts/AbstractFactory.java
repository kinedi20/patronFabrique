package abstracts;

import concret.FRFactory;
import concret.SNFactory;
import concret.USAFactory;

public abstract class AbstractFactory {
	
	
	 
	  // getFactory()
	  public static AbstractFactory createFactory(String type) {
	    AbstractFactory factory = null;
	    if (type.equalsIgnoreCase("fr")) {
	      factory = new FRFactory();
	    } 
	    else if (type.equalsIgnoreCase("usa")) {
	      factory = new USAFactory();
	    } 
	    else if (type.equalsIgnoreCase("sn"))  {
		      factory = new SNFactory();
		    }else 
	    return factory;
		return factory;
	  }
	
	public abstract AbstractFactory getFactory();
	public abstract Oriental createOriental() ;
	public abstract Reine  createReine();
	public abstract TroisFromage  createTroisFromage();

}
