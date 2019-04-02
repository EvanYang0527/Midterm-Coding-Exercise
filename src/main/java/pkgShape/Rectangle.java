package pkgShape;

public class Rectangle extends Shape {
	
	
	
	private int iWidth;
	private int iLength;
	
	public Rectangle() {
	}
	
	public Rectangle (int Width, int Length){
		this.iWidth = Width;
		this.iLength = Length;
		if (iWidth <= 0 || iLength <=0)
			throw new IllegalArgumentException();
	}
	
	
	public int getWidth() {
		return iWidth;
}
	
	public void setWidth(int a) {
		if(a<=0) {
			throw new IllegalArgumentException();
		}
		this.iWidth = a;
		}
	
	public int getLength() {
		return iLength;
	}
	
	public void setLength(int a) {
		try {
			if(a<=0) {
				throw new IllegalArgumentException();
			}}
			finally {
			this.iLength = a;
			}
		}
	
	@Override
	public double area() {
		double answer = iLength * iWidth;
		return answer;
	}
	
	public double perimeter() {
		double answer = 2 * (iLength + iWidth);
		return answer;
	}
	
	public int compareTo(Object i) {
		if(this.area() > ((Rectangle)i).area()) {
			return 1;
		}
		else if(this.area() < ((Rectangle)i).area()) {
			return -1;
		}
		else {
			return 0;
		}
		}
		
	}
	
