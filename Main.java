
  
import java.util.Scanner;


//Complete this program that the user will be able to choose the quadilateral it wants to calculate its perimeter and area

class Main {
  public static void main(String[] args) {
    //Declare a char to store the chosen quadilateral
	  char Parallelogram;
	  char Rhombus;
	  char Square;
	  char Rectangle;
	  char Trapezoid;

    //using a switch check what the user selected and use it to calculate the perimeter and area of the desired quadilateral
	  System.out.println("This program is to check the desired the area and perimeter of any quadilateral");
	  System.out.println("Input p for Parallelogram, Input r for Rhombus, Input s for Square, Input g for rectangle, Input t for trapezoid");
	  Scanner scan = new Scanner(System.in);
	  char quad = scan.next().charAt(0);
	  switch (quad) {
	  case 'p' :
	  
    //this should be in the parallelogram case
    System.out.println("This program calculates the area and perimeter of the parallelogram.");
    System.out.println("Input the base of your Parallelogram");
    float pBase = scan.nextFloat();
    System.out.println("Input the height of your Parallelogram");
    float pHeight = scan.nextFloat();
    Parallelogram p = new Parallelogram(pBase, pHeight);
    
    Quadilateral q = p;

  
    System.out.println("Input the dimension of the first pair of your Parallelogram");
    q.setLength(scan.nextFloat());
    System.out.println("Input the second pair of your Parallelogram");
    q.setBreadth(scan.nextFloat());
    
    System.out.printf("The area of the parallelogram with base %.2f and height %.2f is %.2f", pBase, pHeight, p.Area());

    System.out.println("");
    System.out.printf("The perimeter of the parallelogram with First Pair: %.2f and SecondPair: %.2f is %.2f", q.getLength(), q.getBreadth(), q.calculatePerimeter());
    System.out.println("");
    System.out.println("");
    System.out.println("");
	  
    //this should be in the Trapezoid case
	  case 't' :
     System.out.println("Calculation for a Trapezoid");
     System.out.println("Input first side");
     float a = scan.nextFloat();
     System.out.println("Input second side");
     float b = scan.nextFloat();
     System.out.println("Input third side");
     float c = scan.nextFloat();
     System.out.println("Input fourth side");
     float d = scan.nextFloat();
     Trapezoid t = new Trapezoid(a, b, c, d);
    System.out.printf("The perimeter of the Trapezoid with First Side: %.2f, Second Side: %.2f, Third Side: %.2f, and Fourth Side: %.2f is %.2f", a, b, c, d, t.calculatePerimeter());
    
    //this should be in the Rhombus case
	  case 'r':
		  System.out.println("Calculation for a Rhombus");
		  System.out.println("Input the diagonals of your rhombus");
		  	float rhoLength = scan.nextFloat();
		  	Rhombus r = new Rhombus(rhoLength);
		  System.out.printf("The area of the Rhombus with first diagonal: %.2f, second diagonal: %.2f is %,2f", rhoLength, rhoLength,  r.AreaforRhombus());
		  
		  System.out.println("");
		  System.out.println("");
		  System.out.printf("The perimeter of the rhombus with side: %.2f is %.2f", rhoLength, r.perimeterForRhombus());
		  
		  
	  case 's':
		  System.out.println("This program calculates the area and perimeter of the square");
		  System.out.println("Input the length of your square");
		  float slength = scan.nextFloat();
		  System.out.println("Input the bradth of the square");
		  float sbreadth = scan.nextFloat();
		  square s = new square(slength, sbreadth);
		  System.out.printf("The area of the sqaure with length: %.2f and breadth %.2f is %.2f", slength, sbreadth, s.AreaForSquare());
		  System.out.println("");
		  System.out.println("");
		  
		  System.out.printf("The perimeter of the square with length is %.2f ", slength, s.perimeterForSquare());
		  
	  case 'g' :
		  System.out.println("Thisn program is to calculate the area and perimeter of rectangle");
		  System.out.println("Input the length of the rectangle");
		  float rlength = scan.nextFloat();
		  System.out.println("Input the breadth of the rectangle");
		  float rbreadth = scan.nextFloat();
		  Rectangle g = new Rectangle(rlength, rbreadth);
		  System.out.printf("The area of the rectangle with length  %.2f and breadth %.2f", rlength, rbreadth, g.AreaForRectangle());
		  System.out.println("");
		  System.out.println("");
		  System.out.printf("The perimeter of the rectangle with length %.2f and bradth %.2f", rlength, rlength, g.perimeterForRectangle());
  }
}

//Create class for Rhombus
class Rhombus extends Quadilateral{
	private float length;
	public Rhombus (float l) {
		if (l <= 0) {
			System.out.println("You cannot have a negative or zero length. Therefore height returns to default which is 1");
			length = 1;
		}
		else
			length = 1;
	}
	public float perimeterForRhombus(){
		return 4 * length;
	}
	
	public float AreaforRhombus() {
		return (float) 0.5 * length * length;
	}
		
	}
}

//Create class for square
class square extends Quadilateral{
	private float length;
	private float breadth;
	public square (float l, float b) {
		length = l;
		breadth = b;
	}

	public float perimeterForSquare() {
		return 4 * length;
	}
	
	public float AreaForSquare() {
		return (float) length * breadth;
	}
}

//create class for Rectangle
class Rectangle extends Quadilateral{
	private float length;
	private float breadth;
	public Rectangle (float l, float b) {
		length = l;
		breadth = b;
		if (l <= 0){
		      System.out.println("You cannot have a negative or zero length. Therfore base returns to default which is 1");
		      length = 1;
		    }
		  else
		      length = l;
		    if (b <= 0){
		      System.out.println("You cannot have a negative or zero width. Therfore height returns to default which is 1");
		      breadth = 1;
		    }
		    else
		      breadth = b;
		  }
	
	public float perimeterForRectangle() {
		return 2*(length + breadth);
	}
	
	public float AreaForRectangle() {
		return (float) length * breadth;
	}
}

class Trapezoid extends Quadilateral{
  private float side1;
  private float side2;
  private float side3;
  private float side4;
  public Trapezoid (float a, float b, float c, float d){
    side1 = a;
    side2 = b;
    side3 = c;
    side4 = d;
  }

  public float calculatePerimeter(){
    return side1+side2+side3+side4;
  }
}
class Parallelogram extends Quadilateral{
  private float base;
  private float height;
  public Parallelogram (float b, float h){
    if (b <= 0){
      System.out.println("You cannot have a negative or zero base. Therfore base returns to default which is 1");
      base = 1;
    }
    else
      base = b;
    if (h <= 0){
      System.out.println("You cannot have a negative or zero height. Therfore height returns to default which is 1");
      height = 1;
    }
    else
      height = h;
  }
  public float Area(){
    return base*height;
  }

}
class Quadilateral {
  private float length;
  private float breadth;
  

  public void setLength(float l){
    length = l;
  }

  public float getLength(){
    return length;
  }

  public void setBreadth(float b){
    breadth = b;
  }

  public float getBreadth(){
    return breadth;
  }

  public float calculatePerimeter(){
    return 2*(length+breadth);
  }
 
}
