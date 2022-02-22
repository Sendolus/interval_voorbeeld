package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	
	@Test
	void test() {
		Interval mijnInterval = new Interval(0, 0);
		assertEquals(0, mijnInterval.getOndergrens());
		assertEquals(0, mijnInterval.getBovengrens());
		
		mijnInterval.setBovengrens(2);
		assertEquals(2, mijnInterval.getBovengrens());
		
		assertEquals(2, mijnInterval.getLengte());
	}

}
