package junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addnumbers {

	@Test
	void test() {
		twofunctions hello=new twofunctions();
		int result=hello.add(200,300);
		assertEquals(500,result);
		
	}

}
