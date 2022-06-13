package week1.day2;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 4;
	long chassisNumber = 500860;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 50000.09;
	

	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println(obj.noOfWheels);
		System.out.println(obj.noOfMirrors);
		System.out.println(obj.chassisNumber);
		System.out.println(obj.isPunctured);
		System.out.println(obj.bikeName);
		System.out.println(obj.runningKM);
	}

}
