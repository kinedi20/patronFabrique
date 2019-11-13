package concret;

import abstracts.AbstractFactory;
import abstracts.Oriental;
import abstracts.Reine;
import abstracts.TroisFromage;

public class SNFactory extends AbstractFactory {
	
	private static final AbstractFactory SENEGAL = null;
	private static final AbstractFactory PAYS = SENEGAL;
	
	private Oriental crevette;
	private TroisFromage fromagedechevre;
	private Reine ajambonb;

	
	
	
	public SNFactory() {
		super();
		
	}
	

	public SNFactory(Oriental crevette, TroisFromage fromagedechevre, Reine ajambonb) {
		super();
		this.crevette = crevette;
		this.fromagedechevre = fromagedechevre;
		this.ajambonb = ajambonb;
	}

	
	
	
	

	public Oriental getCrevette() {
		return crevette;
	}


	public void setCrevette(Oriental crevette) {
		this.crevette = crevette;
	}


	public TroisFromage getAfromagedechevre() {
		return fromagedechevre;
	}


	public void setAgruyere(TroisFromage agruyere) {
		this.fromagedechevre = fromagedechevre;
	}


	public Reine getAjambonb() {
		return ajambonb;
	}


	public void setAjambonb(Reine ajambonb) {
		this.ajambonb = ajambonb;
	}


	public static AbstractFactory getSenegal() {
		return SENEGAL;
	}


	public static AbstractFactory getPays() {
		return PAYS;
	}


	@Override
	public AbstractFactory getFactory() {
		
		return null;
	}

	@Override
	public Oriental createOriental() {
		
		return new OrientalSN();
	}

	@Override
	public Reine createReine() {
		
		return new ReineSN();
	}

	@Override
	public TroisFromage createTroisFromage() {
		
		return new ToisFromageSN();
	}

}
