package org.threeten.bp.format;

import static org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH;

import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.threeten.bp.LocalDate;
import org.threeten.bp.format.DateTimeFormatterBuilder.TextPrinterParser;

@Test
public class TestZonePerformance {
	
int size = 100;
private DateTimeFormatter fmt;

@BeforeMethod
public void setUp() {
    fmt = new DateTimeFormatterBuilder().appendLiteral("ONE")
                                        .appendValue(DAY_OF_MONTH, 1, 2, SignStyle.NOT_NEGATIVE)
                                        .toFormatter();
}
	
	@Test
	public void testNow() {
		
		long start = System.nanoTime();
		
		DateTimeFormatter test = fmt.withLocale(Locale.ENGLISH).withDecimalStyle(DecimalStyle.STANDARD);
		for (int k = 0; k < size; k++) {
			
			System.out.println("Output..........."+test.format(LocalDate.of(2008, 6, 30)));
			
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) <= 10);
	}
	

}
