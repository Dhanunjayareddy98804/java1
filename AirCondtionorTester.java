class AirCondtionorTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	AirCondtionor ac = new AirCondtionor();
	
	ac.setBrandName("panasonic");
	ac.setType("splitype");
	ac.setCapacity("2tons");
	ac.setColor("white");
	ac.setCoolingCapacity("21155 btus");
	
	System.out.println(ac.getBrandName() +" "+ ac.getType() +" "+ ac.getCapacity() +" "+ ac.getColor()+" "+ ac.getCoolingCapacity());
	
	AirCondtionor ac1 = new AirCondtionor();
	ac1.setBrandName("carrier");
	ac1.setType("splitype");
	ac1.setCapacity("1 tons");
	ac1.setColor("blue");
	ac1.setCoolingCapacity("6000 kilowats");
	
	System.out.println(ac1.getBrandName() +" "+ ac1.getType() +" "+ ac1.getCapacity() +" "+ ac1.getColor()+" "+ ac1.getCoolingCapacity());

	AirCondtionor ac2 = new AirCondtionor();	
	ac2.setBrandName("lg");
	ac2.setType("splitype");
	ac2.setCapacity("3 tons");
	ac2.setColor("orange");
	ac2.setCoolingCapacity("2kilowats");
	
	System.out.println(ac2.getBrandName() +" "+ ac2.getType() +" "+ ac2.getCapacity() +" "+ ac2.getColor()+" "+ ac2.getCoolingCapacity());
	
	AirCondtionor ac3 = new AirCondtionor();
	ac3.setBrandName("lioyd");
	ac3.setType("splitype");
	ac3.setCapacity("4 tons");
	ac3.setColor("red");
	ac3.setCoolingCapacity("6 kilowats");
	System.out.println(ac3.getBrandName() +" "+ ac3.getType() +" "+ ac3.getCapacity() +" "+ ac3.getColor()+" "+ ac3.getCoolingCapacity());
	
	AirCondtionor ac4 = new AirCondtionor();
	ac4.setBrandName("voltas");
	ac4.setType("syatem");
	ac4.setCapacity("1.65 tons");
	ac4.setColor("yellow");
	ac4.setCoolingCapacity("2 kilowats");
	
	System.out.println(ac4.getBrandName() +" "+ ac4.getType() +" "+ ac4.getCapacity() +" "+ ac4.getColor()+" "+ ac4.getCoolingCapacity());
	
}

}