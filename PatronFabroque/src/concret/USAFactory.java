package concret;

import abstracts.AbstractFactory;
import abstracts.Oriental;
import abstracts.Reine;
import abstracts.TroisFromage;

public class USAFactory extends AbstractFactory {
	
	
	private static final AbstractFactory SENEGAL = null;
	private static final AbstractFactory PAYS = SENEGAL;
	
	private Oriental gambasSauceHarira;
	private TroisFromage sansFromagedechevre;
	private Reine abacon;
	
	
	

	public USAFactory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public USAFactory(Oriental gambasSauceHarira, TroisFromage sansFromagedechevre, Reine abacon) {
		super();
		this.gambasSauceHarira = gambasSauceHarira;
		this.sansFromagedechevre = sansFromagedechevre;
		this.abacon = abacon;
	}
	
	



	public Oriental getGambasSauceHarira() {
		return gambasSauceHarira;
	}



	public void setGambasSauceHarira(Oriental gambasSauceHarira) {
		this.gambasSauceHarira = gambasSauceHarira;
	}



	public TroisFromage getSansFromagedechevre() {
		return sansFromagedechevre;
	}



	public void setSansFromagedechevre(TroisFromage sansFromagedechevre) {
		this.sansFromagedechevre = sansFromagedechevre;
	}



	public Reine getAbacon() {
		return abacon;
	}



	public void setAbacon(Reine abacon) {
		this.abacon = abacon;
	}



	public static AbstractFactory getSenegal() {
		return SENEGAL;
	}



	public static AbstractFactory getPays() {
		return PAYS;
	}



	@Override
	public AbstractFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Oriental createOriental() {
		
		return new OrientalUSA();
	}

	@Override
	public Reine createReine() {
		
		return new ReineUSA();
	}

	@Override
	public TroisFromage createTroisFromage() {
		
		return new TroisFromageUSA();
	}

}
