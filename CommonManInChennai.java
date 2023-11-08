package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules {

	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Go by Deisel vehicle in Chennai");

	}

	public void goByBicycle() {
		// TODO Auto-generated method stub
		
		System.out.println("Go by Bicycle in Chennai");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonManInChennai cic = new CommonManInChennai();
		cic.goByBicycle();
		cic.goByDieselVehicle();
		System.out.println(cic.trafficCommisssioner);

	}

}
