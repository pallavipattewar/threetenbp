package org.threeten.bp;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestTrial {
	int size = 10000;
	
	@Test
	public void testNow() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Year.now();
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofDays() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofDays(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofHours() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofHours(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofMillis() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofMillis(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofMinutes() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofMinutes(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofNanos() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofNanos(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofSeconds() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofSeconds(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofDays1() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofDays(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofMonths() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofMonths(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofWeeks() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofWeeks(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_ofYears() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofYears(k);
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void test_now() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			LocalDate.now();
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void testLocalDate_of() {
		int year = 2020;
		int month = 1;
		int dayOfMonth = 5;
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			LocalDate.of(year, month, dayOfMonth);
			year++;
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void testLocalDate_ofYearDay() {
		int year = 2020;
		int dayOfYear = 10;
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			LocalDate.ofYearDay(year, dayOfYear);
			year++;
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	@Test
	public void testLocalTimeOf() {
		int hour = 4;
		int minute = 10;
		long start = System.nanoTime();
		for (int k = 0; k < 50; k++) {
			LocalTime.of(hour, minute);
			minute++;
		}
		long end = System.nanoTime();
		
		Assert.assertTrue((end - start) >= 10000);
	}
	
	// Memory usage Test cases
	
	@Test
	public void test_NowMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Year.now();
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to test_NowMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 4194304);
	}
	
	
	@Test
	public void test_ofHoursMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Duration.ofHours(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofHoursMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
	
	@Test
	public void test_ofMinutesMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Duration.ofMinutes(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofMinutesMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
	@Test
	public void test_ofNanosMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Duration.ofNanos(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofNanosMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
	@Test
	public void test_ofSecondsMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Duration.ofSeconds(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofSecondsMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336 );
	}
	
	@Test
	public void test_ofDays1Mem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Period.ofDays(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofDays1Mem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 522240);
	}
	
	@Test
	public void test_ofMonthsMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Period.ofMonths(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofMonthsMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
	@Test
	public void test_ofWeeksMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Period.ofWeeks(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofWeeksMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 522240);
	}
	
	@Test
	public void test_ofYearsMem() {
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			Period.ofYears(k);
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get test_ofYearsMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
	@Test
	public void testLocalDate_ofYearDayMem() {
		int year = 2020;
		int dayOfYear = 10;
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		for (int k = 0; k < size; k++) {
			LocalDate.ofYearDay(year, dayOfYear);
			year++;
		}
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Memory Used to get testLocalDate_ofYearDayMem:"+ (afterUsedMem- beforeUsedMem));
		Assert.assertTrue((afterUsedMem - beforeUsedMem)>= 526336);
	}
	
}
