package junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addstrings {

	@Test
	void test() {
		twofunctions hello=new twofunctions();
		String result=hello.concate("hello","world");
		assertEquals("helloworld",result);
	}

}
