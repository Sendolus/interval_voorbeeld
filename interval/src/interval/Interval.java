package interval;

/**
 * Abstractetoestandsinvarianten:
 * 
 * @invar De ondergrens is niet groter dan de bovengrens.
 * 		| getOndergrens() <= getBovengrens()
 * @invar De lengte is gelijk aan het verschil van de bovengrens en de ondergrens
 * 		| getLengte() == getBovengrens() - getOndergrens()
 *
 */
public class Interval {
	// Verschillende voorstellingen voor hezelfde idee
	// Verschillende voorstellingen voor eenzelfde abstracte toestandsruimte
	// je zou lengte ipv bovengrens kunnen gebruiken
	
	/**
	 * Representatie-invariant:
	 * 
	 * @invar De lengte is niet negatief
	 * 		| 0 <= bovengrens - ondergrens
	 */
	private int ondergrens;
	private int bovengrens; // door dit te doen kunnen klanten niet mijninterval.lengte gebruiken
							// dit is bad behaviour van klant maar zo vermijden wij dat hij dit doet
	
	// instantiemethode
	
	public int getOndergrens() {
		return this.ondergrens;
	}
	
	public int getBovengrens() {
		return this.bovengrens;
	}
	
	public int getLengte() {
		return this.bovengrens - this.ondergrens;
	}
	
	/**
	 * @post | getOndergrens() == 0
	 * @post | getBovengrens() == 0
	 */
	public Interval() {}
	
	/**
	 * @throws IllegalArgumentException | ondergrens > bovengrens
	 * 
	 * @post | getOndergrens() == ondergrens
	 * @post | getBovengrens() == bovengrens
	 */
	public Interval(int ondergrens, int bovengrens) {
		if (ondergrens > bovengrens) 
			throw new IllegalArgumentException("'ondergrens' is groter dan 'bovengrens'");
		this.ondergrens = ondergrens;
		this.bovengrens = bovengrens;
	}
	
	/**
	 * Stelt de ondergrens in. Laat de bovengrens ongewijzigd.
	 * 
	 * @pre | waarde <= getBovengrens()
	 * 
	 * @post | getOndergrens() == waarde
	 * @post | getBovengrens() == old(getBovengrens())
	 */
	public void setOndergrens(int waarde) {
		this.ondergrens = waarde;
	}
	
	/**
	 * Stelt de bovengrens in. Laat de ondergrens ongewijzigd.
	 * 
	 * @pre | waarde >= getBovengrens()
	 * 
	 * @post | getBovengrens() == waarde
	 * @post | getOndergrens() == old(getOndergrens())
	 */
	public void setBovengrens(int waarde) {
		this.bovengrens = waarde;
	}
}
