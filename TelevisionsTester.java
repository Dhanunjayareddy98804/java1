class TelevisionsTester{
public static void main(String data[]){

//ClasssetName ref = new Constructor (ClasssetName());
	Televisions tv = new Televisions();
	
	tv.setName("sony");
	tv.setPrice("37999");
	tv.setColor("blue");
	tv.setDisplay("led");
	tv.setResolution("3840 x 2160 pixles");
	
	
	System.out.println(tv.getName() +" "+ tv.getPrice() +" "+ tv.getColor() +" "+ tv.getDisplay()+" "+ tv.getResolution());
	
	Televisions tv1 = new Televisions();
	tv1.setName("samsung");
	tv1.setPrice("28990");
	tv1.setColor("pink");
	tv1.setDisplay("led");
	tv1.setResolution("3840 x 2160 pixles");
	
	System.out.println(tv1.getName() +" "+ tv1.getPrice() +" "+ tv1.getColor() +" "+ tv1.getDisplay()+" "+ tv1.getResolution());

	Televisions tv2 = new Televisions();	
	tv2.setName("hisense");
	tv2.setPrice("24999");
	tv2.setColor("red");
	tv2.setDisplay("qled");
	tv2.setResolution("3840 x 2160 pixles");
	
	System.out.println(tv2.getName() +" "+ tv2.getPrice() +" "+ tv2.getColor() +" "+ tv2.getDisplay()+" "+ tv2.getResolution());
	
	Televisions tv3 = new Televisions();
	tv3.setName("redmi");
	tv3.setPrice("25000");
	tv3.setColor("pep blue");
	tv3.setDisplay("led");
	tv3.setResolution("3840 x 2160 pixles");
	
	System.out.println(tv3.getName() +" "+ tv3.getPrice() +" "+ tv3.getColor() +" "+ tv3.getDisplay()+" "+ tv3.getResolution());
	
	Televisions tv4 = new Televisions();
	tv4.setName("acer");
	tv4.setPrice("22999");
	tv4.setColor("yellow");
	tv4.setDisplay("qled");
	tv4.setResolution("3840 x 2160");
	
	System.out.println(tv4.getName() +" "+ tv4.getPrice() +" "+ tv4.getColor() +" "+ tv4.getDisplay()+" "+ tv4.getResolution());
	
}

}