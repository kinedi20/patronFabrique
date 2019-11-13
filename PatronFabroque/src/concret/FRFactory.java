package concret;

import abstracts.AbstractFactory;
import abstracts.Oriental;
import abstracts.Reine;
import abstracts.TroisFromage;

public class FRFactory extends AbstractFactory {

	 private static final AbstractFactory FRANCE = null;
	private static final AbstractFactory PAYS = FRANCE;
	
	private Oriental calamars;
	private TroisFromage agruyere;
	private Reine ajambonp;
	
	

	public Oriental getCalamars() {
		return calamars;
	}

	public void setCalamars(Oriental calamars) {
		this.calamars = calamars;
	}

	public TroisFromage getAgruyere() {
		return agruyere;
	}

	public void setAgruyere(TroisFromage agruyere) {
		this.agruyere = agruyere;
	}

	public Reine getAjambonp() {
		return ajambonp;
	}

	public void setAjambonp(Reine ajambonp) {
		this.ajambonp = ajambonp;
	}

	@Override
	public AbstractFactory getFactory() {
		return PAYS;
	}

	@Override
	public Oriental createOriental() {
		return  new OrienetalFR();
			
		
		
	}

	@Override
	public Reine createReine() {
		
		return new ReineFR();
	}

	@Override
	public TroisFromage createTroisFromage() {
		
		return new TroisFromageFR();
			
			
	}
}
