package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDao {
	@Test
	public void Test1() {
		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("Current Date: " + ft.format(now));
	}
}
