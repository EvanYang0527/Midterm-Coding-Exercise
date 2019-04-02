package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{

	private int iDepth;
	
	public Cuboid(int Width, int Length, int Depth) {
		this.iDepth = Depth;
		super.setLength(Length);
		super.setWidth(Width);
		if (iDepth <= 0)
			throw new IllegalArgumentException();
	}
	
	public int getDepth() {
		return iDepth;
	}
	
	public void setDepth(int a) {
		if(a<=0) {
			throw new IllegalArgumentException();
		}
		this.iDepth = a;
		}
	
	public double volume() {
		double answer = iDepth * super.getLength() * super.getWidth();
		return answer;
	}
	
	@Override
	public double area() {
		double answer = 2 * (super.getLength()*super.getWidth() + iDepth * super.getLength() + iDepth * super.getWidth());
		return answer;
	}
	
	@Override
	public double perimeter() {
		throw new IllegalArgumentException();
	}
	
	public int compareTo(Object i) {
		if(this.area() > ((Cuboid)i).area()) {
			return 1;
		}
		else if (this.area() < ((Cuboid)i).area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		public SortByArea() {
		}
		
		@Override
		public int compare(Cuboid a, Cuboid b) {
			if(a.area() > b.area()) {
				return 1;
			}
			else if (a.area() < b.area()) {
				return -1;
			}
			else {
				return 0;
			}
	}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		public SortByVolume() {
		}
		
		@Override
		public int compare(Cuboid a,Cuboid b) {
			if(a.volume() > b.volume()) {
				return 1;
			}
			else if (a.volume() < b.volume()) {
				return -1;
			}
			else {
				return 0;
			}
		}
	}
	
	
}


	
