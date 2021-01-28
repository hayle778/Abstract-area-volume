
public class SquareContainer extends Container{

	public void calcVol(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public double calcAreaOfBase1(int length) {
		// TODO Auto-generated method stub
		
		double area = length*length;
		System.out.println("Square area = " + area);
		
		return area;
	}

	@Override
	public double calcAreaOfBase(int length) {
		// TODO Auto-generated method stub
		return 0;
	}

}
