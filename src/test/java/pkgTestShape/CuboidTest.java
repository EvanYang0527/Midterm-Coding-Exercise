package pkgTestShape;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

import static org.junit.Assert.*;

public class CuboidTest {

	@Test
	public void Cuboid_Construction_Test() {
		Cuboid x = new Cuboid(2,4,6);
		int depth = 5;
		x.setDepth(5);
		assertEquals(depth,x.getDepth());
	}
	
	@Test
	public void Volume_exception_Test1() {
		
		boolean thrown = false;
		try {
			Cuboid x = new Cuboid(2,4,-6);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Volume_exception_Test2() {
		Cuboid x = new Cuboid(2,4,6);
		boolean thrown = false;
		try {
			x.setDepth(-1);
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Cuboid_volume_Test() {
		Cuboid x = new Cuboid(2,4,6);
		double volume = 48;
		boolean a = volume == x.volume();
		assertTrue(a);
	}
	
	@Test
	public void Cuboid_area_Test() {
		Cuboid x = new Cuboid(2,4,6);
		double area = 88;
		boolean a = area == x.area();
		assertTrue(a);
	}
	
	@Test
	public void Cuboid_perimeter_Test() {
		Cuboid x = new Cuboid(2,4,6);
		boolean thrown = false;
		try {
			x.perimeter();
		}catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void compareTo_Test1() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(1,2,3);
		assertEquals(1,x.compareTo(y));
	}
	
	@Test
	public void compareTo_Test2() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(1,2,3);
		assertEquals(-1,y.compareTo(x));
	}
	
	@Test
	public void compareTo_Test3() {
		Cuboid x = new Cuboid(12,14,16);
		assertEquals(0,x.compareTo(x));
	}
	
	@Test
	public void SortByArea_Test1() {
		Cuboid x = new Cuboid(120,140,160);
		Cuboid y = new Cuboid(12,14,16);	
		boolean a = y.new SortByArea().compare(x,y) == 1;
		assertTrue(a);
	}
	
	@Test
	public void SortByArea_Test2() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(120,140,160);	
		boolean a = y.new SortByArea().compare(x,y) == -1;
		assertTrue(a);
	}
	
	@Test
	public void SortByArea_Test3() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(12,14,16);	
		boolean a = y.new SortByArea().compare(x,y) == 0;
		assertTrue(a);
	}
	
	@Test
	public void SortByVolume_Test1() {
		Cuboid x = new Cuboid(120,140,160);
		Cuboid y = new Cuboid(12,14,16);
		boolean a = y.new SortByVolume().compare(x,y) == 1;
		assertTrue(a);
	}
	
	@Test
	public void SortByVolume_Test2() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(120,140,160);
		boolean a = y.new SortByVolume().compare(x,y) == -1;
		assertTrue(a);
	}
	@Test
	public void SortByVolume_Test3() {
		Cuboid x = new Cuboid(12,14,16);
		Cuboid y = new Cuboid(12,14,16);
		boolean a = y.new SortByVolume().compare(x,y) == 0;
		assertTrue(a);
	}
	
	

}

