class MobileTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	Mobile mob = new Mobile();
	
	mob.setMobileName("one plus");
	mob.setCamera("front and rear");
	mob.setScreenType("lcd");
	mob.setBattery("5000mah");
	mob.setRam("8gb");
	mob.setOs("oxygenOS");
	
	System.out.println(mob.getMobileName() +" "+ mob.getCamera() +" "+ mob.getScreenType()+" "+ mob.getBattery()+" "+mob.getRam()+" "+ mob.getOs());
	
	Mobile mob1 = new Mobile();
	mob1.setMobileName("oppo");
	mob1.setCamera("front and rear");
	mob1.setScreenType("amoled");
	mob1.setBattery("5000");
	mob1.setRam("8gb");
	mob1.setOs("android 14");
	
	
	System.out.println(mob1.getMobileName() +" "+ mob1.getCamera() +" "+ mob1.getScreenType() +" "+ mob1.getBattery()+" "+mob1.getRam()+" "+ mob1.getOs());

	Mobile mob2 = new Mobile();	
	mob2.setMobileName("redmi");
	mob2.setCamera("rear and front");
	mob2.setScreenType("amoled");
	mob2.setBattery("5100");
	mob2.setRam("12gb");
	mob2.setOs("android 13");
	
	
	System.out.println(mob2.getMobileName() +" "+ mob2.getCamera() +" "+ mob2.getScreenType() +" "+ mob2.getBattery()+" "+mob2.getRam()+" "+ mob2.getOs());
	
	Mobile mob3 = new Mobile();
	mob3.setMobileName("xiaomi");
	mob3.setCamera("triple rear camera");
	mob3.setScreenType("amoled");
	mob3.setBattery("6000");
	mob3.setRam("4gb");
	mob3.setOs("miui");
	
	System.out.println(mob3.getMobileName() +" "+ mob3.getCamera() +" "+ mob3.getScreenType() +" "+ mob3.getBattery()+" "+mob3.getRam()+" "+ mob3.getOs());
	
	Mobile mob4 = new Mobile();
	mob4.setMobileName("samsung");
	mob4.setCamera("front and rear");
	mob4.setScreenType("amoled plus");
	mob4.setBattery("4500");
	mob4.setRam("12gb");
	mob4.setOs("one ui");
	
	
	System.out.println(mob4.getMobileName() +" "+ mob4.getCamera() +" "+ mob4.getScreenType()+" "+ mob4.getBattery()+" "+mob4.getRam()+" "+ mob4.getOs());
	
}

}