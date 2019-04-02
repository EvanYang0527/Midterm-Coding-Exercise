package pkgTestShape;

import org.junit.Test;

import pkgShape.Rectangle;

import static org.junit.Assert.*;

public class RectangleTest {

	@Test
	public void Construction1_Test() {
		Rectangle x = new Rectangle(1,2);
		int width = 3;
		x.setWidth(3);
		assertEquals(width,x.getWidth());
	}
	
	@Test
	public void Construction2_Test() {
		Rectangle x = new Rectangle();
		int width = 3;
		x.setWidth(3);
		assertEquals(width,x.getWidth());
	}
	@Test
	public void setLength_Test() {
		Rectangle x = new Rectangle(1,2);
		int Length = 2;
		x.setLength(2);
		assertEquals(Length,x.getLength());
	}
	
	@Test
	public void getWidth_Test() {
		Rectangle x = new Rectangle(1,2);
		int width = 1;
		assertEquals(width,x.getWidth());
	}
	
	@Test
	public void getLength_Test() {
		Rectangle x = new Rectangle(1,2);
		int Length = 2;
		assertEquals(Length,x.getLength());
	}
	
	
	@Test
	public void area_Test() {
		Rectangle x = new Rectangle(1,2);
		double area = 2;
		boolean a = (area == x.area());
		assertTrue(a);
	}
	
	@Test
	public void perimeter_Test() {
		Rectangle x = new Rectangle(1,2);
		double perimeter = 6;
		assertTrue(perimeter == x.perimeter());
	}
	
	@Test
	public void compareTo_Test1() {
		Rectangle x = new Rectangle(1,2);
		Rectangle y = new Rectangle(2,4);
		assertEquals(1,y.compareTo(x));
	}
	
	@Test
	public void compareTo_Test2() {
		Rectangle x = new Rectangle(1,2);
		Rectangle y = new Rectangle(2,4);
		assertEquals(-1,x.compareTo(y));
	}
	
	@Test
	public void compareTo_Test3() {
		Rectangle x = new Rectangle(2,4);
		Rectangle y = new Rectangle(2,4);
		assertEquals(0,y.compareTo(x));
	}
	
	@Test
	public void assertException1() {
		Rectangle x = new Rectangle(2,4);
		boolean thrown = false;
		try {
			x.setLength(-1);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void assertException2() {
		Rectangle x = new Rectangle(2,4);
		boolean thrown = false;
		try {
			x.setWidth(-1);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void assertException3() {
		
		boolean thrown = false;
		try {
			Rectangle x = new Rectangle(-2,-4);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void assertException4() {
		
		boolean thrown = false;
		try {
			Rectangle x = new Rectangle(-2,4);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void assertException5() {
		
		boolean thrown = false;
		try {
			Rectangle x = new Rectangle(2,-4);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
}

