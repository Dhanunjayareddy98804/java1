class SmartWatchTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	SmartWatch watch = new SmartWatch();
	
	watch.setWatchName("apple");
	watch.setPrice("28900");
	watch.setSoldBy("amazon");
	watch.setModelNumber("MNJT3");
	
	
	System.out.println(watch.getWatchName() +" "+ watch.getPrice() +" "+ watch.getSoldBy() +" "+ watch.getModelNumber());
	
	SmartWatch watch1 = new SmartWatch();
	watch1.setWatchName("samsung");
	watch1.setPrice("9999");
	watch1.setSoldBy("amazon");
	watch1.setModelNumber("yd-fd-dhk-rd");
	
	
	System.out.println(watch1.getWatchName() +" "+ watch1.getPrice() +" "+ watch1.getSoldBy() +" "+ watch1.getModelNumber());

	SmartWatch watch2 = new SmartWatch();	
	watch2.setWatchName("nexus");
	watch2.setPrice("3999");
	watch2.setSoldBy("amazon");
	watch2.setModelNumber("nexus - silver");
	
	System.out.println(watch2.getWatchName() +" "+ watch2.getPrice() +" "+ watch2.getSoldBy() +" "+ watch2.getModelNumber());
	
	SmartWatch watch3 = new SmartWatch();
	watch3.setWatchName("firebolt");
	watch3.setPrice("2499");
	watch3.setSoldBy("amazon");
	watch3.setModelNumber("BSW046");
	
	
	System.out.println(watch3.getWatchName() +" "+ watch3.getPrice() +" "+ watch3.getSoldBy() +" "+ watch3.getModelNumber());
	
	SmartWatch watch4 = new SmartWatch();
	watch4.setWatchName("redmi");
	watch4.setPrice("1699");
	watch4.setSoldBy("amazon");
	watch4.setModelNumber("M2109W1");
	
	System.out.println(watch4.getWatchName() +" "+ watch4.getPrice() +" "+ watch4.getSoldBy() +" "+ watch4.getModelNumber());
	
}

}