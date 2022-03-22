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
		
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 23771100);
	}
	
	@Test
	public void test_ofDays() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofDays(k);
		}
		long end = System.nanoTime();
		
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 3447400);
	}
	
	@Test
	public void test_ofHours() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofHours(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 2148100);
	}
	
	@Test
	public void test_ofMillis() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofMillis(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 105970500);
	}
	
	@Test
	public void test_ofMinutes() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofMinutes(k);
			
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 16549200);
	}
	
	@Test
	public void test_ofNanos() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofNanos(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 2104200);
	}
	
	@Test
	public void test_ofSeconds() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Duration.ofSeconds(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 1123700);
	}
	
	@Test
	public void test_ofDays1() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofDays(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 663300);
	}
	
	@Test
	public void test_ofMonths() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofMonths(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 787800);
	}
	
	@Test
	public void test_ofWeeks() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofWeeks(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 638200);
	}
	
	@Test
	public void test_ofYears() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			Period.ofYears(k);
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 655800);
	}
	
	@Test
	public void test_now() {
		long start = System.nanoTime();
		for (int k = 0; k < size; k++) {
			LocalDate.now();
		}
		long end = System.nanoTime();
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 952300);
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
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 557900);
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
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 901800);
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
		System.out.println(end-start);
		
		Assert.assertTrue((end - start) >= 733200);
	}
}
