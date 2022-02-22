package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	// Verschillende voorstellingen voor hezelfde idee
	// Verschillende voorstellingen voor eenzelfde abstracte toestandsruimte
	class Interval{
		int ondergrens;
		int bovengrens;
	}
	
	int getLengte(Interval interval) {
		return interval.bovengrens - interval.ondergrens;
	}
	
	@Test
	void test() {
		Interval mijnInterval = new Interval();
		assertEquals(0, mijnInterval.ondergrens);
		assertEquals(0, mijnInterval.bovengrens);
		
		mijnInterval.bovengrens = 2;
		assertEquals(2, mijnInterval.bovengrens);
		
		assertEquals(2, getLengte(mijnInterval));
	}

}
