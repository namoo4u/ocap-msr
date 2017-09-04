package io.swagger;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class RFC3339DateFormatTest {

	private RFC3339DateFormat rfc3339DateFormat;
	
	@Before
	public void init() {
		rfc3339DateFormat = new RFC3339DateFormat();
	}
	
	@Test
	public void testRFC3339DateFormat() throws Exception {
		System.out.println(rfc3339DateFormat.format(new Date()));
	}
}
