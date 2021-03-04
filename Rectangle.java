package week16.com.it;

public class Rectangle {
	//instance variable //global variable
	public String name;
	public double width;
	double lenght;
	private double area;
	
	public void printArea() {
		area = width * lenght;
		System.out.println("The area of " + name + "Rectangle is " + area );
	}
	
    public static void main(String[]args) {
    	Rectangle A = new Rectangle();
    	A.name = "A";
    	A.width = 4.0;
    	A.lenght = 5.0;
    	System.out.println("Name : " + A.name + "\nWidth : " + A.width + " \nLenght : " + A.lenght);
    	
    	A.printArea();
    	
    	System.out.println("==========");
        
    	
    	Rectangle B = new Rectangle();
    	B.name = "B";
    	B.width = 2.0;
    	B.lenght = 6.0;
    	System.out.println("Name : " + B.name );
    	System.out.println("Width : " + B.width);
    	System.out.println("Lenght : " + B.lenght);
    	B.printArea();
    	
    	
    	System.out.println(A.getArea());
    	System.out.println(B.getArea());
    	
    }
    

	public double getArea() {
		area = width * lenght;
		return area;
	}
}
