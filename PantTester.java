class PantTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	Pant p = new Pant();
	
	p.setPantName("rynogear");
	p.setPrice("500");
	p.setMaterial("cotton");
	p.setColor("black");
	p.setSize("s");
	
	
	System.out.println(p.getPantName() +" "+ p.getPrice() +" "+ p.getMaterial() +" "+ p.getColor()+" "+ p.getSize());
	
	Pant p1 = new Pant();
	p1.setPantName("chozi");
	p1.setPrice("399");
	p1.setMaterial("acrylic");
	p1.setColor("green");
	p1.setSize("m");
	
	System.out.println(p1.getPantName() +" "+ p1.getPrice() +" "+ p1.getMaterial() +" "+ p1.getColor()+" "+ p1.getSize());

	Pant p2 = new Pant();	
	p2.setPantName("symbol");
	p2.setPrice("567");
	p2.setMaterial("polister");
	p2.setColor("blue");
	p2.setSize("l");
	
	System.out.println(p2.getPantName() +" "+ p2.getPrice() +" "+ p2.getMaterial() +" "+ p2.getColor()+" "+ p2.getSize());
	
	Pant p3 = new Pant();
	p3.setPantName("addiz");
	p3.setPrice("649");
	p3.setMaterial("cotton");
	p3.setColor("grey");
	p3.setSize("xl");
	
	System.out.println(p3.getPantName() +" "+ p3.getPrice() +" "+ p3.getMaterial() +" "+ p3.getColor()+" "+ p3.getSize());
	
	Pant p4 = new Pant();
	p4.setPantName("lymio");
	p4.setPrice("550");
	p4.setMaterial("polister");
	p4.setColor("white");
	p4.setSize("m");
	
	System.out.println(p4.getPantName() +" "+ p4.getPrice() +" "+ p4.getMaterial() +" "+ p4.getColor()+" "+ p4.getSize());
	
}

}