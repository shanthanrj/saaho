package jumit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mu = new MathUtils();
		int expected=30;
		int actual=mu.add(10, 20);
		assertNotEquals(expected, actual,"denamma");
		
	}
	@Test
	void testDivide()
	{
		MathUtils mu = new MathUtils();
		
		assertThrows(NullPointerException.class, () -> mu.divide(1, 0),"malli nene");
		
	}

}
 