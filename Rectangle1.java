class Rectangle{
	private double length;
	private double breadth;
	public double getLength(){
		return length;
	}
	public double getBreadth(){
		return breadth;
	}
	public void setLength(double l){
		if(l>=0)
		length=l;
		else 
		length=0;
	}
	public void setBreadth(double b){
		if(b>=0)
		breadth=b;
		else 
		breadth=0;
	}
	public double area(){
		return length*breadth;
	}
	public double perimeter(){
		return 2*(length+breadth);
	}
	
	
	public boolean isSquare(){
		if(length==breadth)
			return true;
		else
			return false;
	
	}
}
class Rectangle1{	
	public static void main(String[] args){
		Rectangle c1=new Rectangle();
		c1.setLength(10.5);
		c1.setBreadth(5.5);
		System.out.println("Area :"+c1.area());
		System.out.println("Perimeter :"+c1.perimeter());
		System.out.println("Is it a isSquare :"+c1.isSquare());
	}
}
		
	