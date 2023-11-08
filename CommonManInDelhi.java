package india.newdelhi;

import tamilnadu.chennai.TrafficRules;

public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules {

	@Override
	public void dontGoByDieselVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Dont go by Diesel vehicle in Delhi");

	}

	@Override
	public void goByBicycle() {
		// TODO Auto-generated method stub
		
		System.out.println("go by Bicycle in Delhi");

	}
	
	// As we are implementing TrafficRulesChennai, we have to override this method also
	@Override
	public void goByDieselVehicle() {
		// TODO Auto-generated method stub
		
		System.out.println("Overide Go by diesl vehicle in Delhi");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonManInDelhi cid = new CommonManInDelhi();
		
		cid.dontGoByDieselVehicle();
		cid.goByBicycle();
		cid.goByDieselVehicle();
//		System.out.println(cid.trafficCommisssioner);

	}

	

}
