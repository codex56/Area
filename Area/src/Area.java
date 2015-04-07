import java.util.Scanner;

 class ROOM {
	private float length,breadth,area;
	 void get_length(float x,float y)
	 {
		 length=x;
		 breadth=y;
	 }
	 void area()
	 {
		 area=length*breadth;
		 System.out.println("Area is ="+area);
	 }
	
}



public class Area {

	public static void main(String[] args) {
		
  float length,breadth;
  System.out.println("Eneter length and breadth..\n");
  Scanner in = new Scanner(System.in);
  length=in.nextInt();
  breadth=in.nextInt();
  ROOM ROOM1=new ROOM();
  ROOM1.get_length(length,breadth);
  ROOM1.area();
	}

}
