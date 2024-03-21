class ShirtTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	Shirt s = new Shirt();
	
	s.setShirtName("park avenue");
	s.setPrice("1079");
	s.setMaterial("cotton");
	s.setColor("black");
	s.setSize("s");
	
	
	System.out.println(s.getShirtName() +" "+ s.getPrice() +" "+ s.getMaterial() +" "+ s.getColor()+" "+ s.getSize());
	
	Shirt s1 = new Shirt();
	s1.setShirtName("colebrook");
	s1.setPrice("496");
	s1.setMaterial("cotton blend");
	s1.setColor("green");
	s1.setSize("m");
	
	System.out.println(s1.getShirtName() +" "+ s1.getPrice() +" "+ s1.getMaterial() +" "+ s1.getColor()+" "+ s1.getSize());

	Shirt s2 = new Shirt();	
	s2.setShirtName("majestic");
	s2.setPrice("567");
	s2.setMaterial("polister");
	s2.setColor("blue");
	s2.setSize("l");
	
	System.out.println(s2.getShirtName() +" "+ s2.getPrice() +" "+ s2.getMaterial() +" "+ s2.getColor()+" "+ s2.getSize());
	
	Shirt s3 = new Shirt();
	s3.setShirtName("indoprimo");
	s3.setPrice("500");
	s3.setMaterial("cotton");
	s3.setColor("grey");
	s3.setSize("xl");
	
	System.out.println(s3.getShirtName() +" "+ s3.getPrice() +" "+ s3.getMaterial() +" "+ s3.getColor()+" "+ s3.getSize());
	
	Shirt s4 = new Shirt();
	s4.setShirtName("lymio");
	s4.setPrice("379");
	s4.setMaterial("polister");
	s4.setColor("white");
	s4.setSize("m");
	
	System.out.println(s4.getShirtName() +" "+ s4.getPrice() +" "+ s4.getMaterial() +" "+ s4.getColor()+" "+ s4.getSize());
	
}

}