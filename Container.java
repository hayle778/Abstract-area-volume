
public abstract class Container {

	public void calcVol(int length, int height) {
	
	
		
		double volume = calcAreaOfBase(length)*height;
	
	    System.out.println("Volume= "+ volume);
		
	}
	
	
	public abstract double calcAreaOfBase(int length);
	
	
	
	
	
	








//	public static void main(String[]args) {
	
	
	
	
//}
}
