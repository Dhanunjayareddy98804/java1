class ChairTester{
public static void main(String data[]){

//ClasssetName ref = new Constructor (ClasssetName());
	Chair chair = new Chair();
	
	chair.setName("astride");
	chair.setPrice("3349");
	chair.setColor("black");
	chair.setFinishType("powder coated");
	chair.setStyle("modern");
	
	System.out.println(chair.getName() +" "+ chair.getPrice() +" "+ chair.getColor() +" "+ chair.getFinishType()+" "+ chair.getStyle());
	
	Chair chair1 = new Chair();
	chair1.setName("newturn");
	chair1.setPrice("3419");
	chair1.setColor("grey");
	chair1.setFinishType("metal black coated");
	chair1.setStyle("modern");
	
	System.out.println(chair1.getName() +" "+ chair1.getPrice() +" "+ chair1.getColor() +" "+ chair1.getFinishType()+" "+ chair1.getStyle());

	Chair chair2 = new Chair();	
	chair2.setName("green soul");
	chair2.setPrice("4098");
	chair2.setColor("seoul");
	chair2.setFinishType("polished");
	chair2.setStyle("modern");
	
	System.out.println(chair2.getName() +" "+ chair2.getPrice() +" "+ chair2.getColor() +" "+ chair2.getFinishType()+" "+ chair2.getStyle());
	
	Chair chair3 = new Chair();
	chair3.setName("pebble");
	chair3.setPrice("3998");
	chair3.setColor("blue");
	chair3.setFinishType("powder coated");
	chair3.setStyle("pebble");
	
	System.out.println(chair3.getName() +" "+ chair3.getPrice() +" "+ chair3.getColor() +" "+ chair3.getFinishType()+" "+ chair3.getStyle());
	
	Chair chair4 = new Chair();
	chair4.setName("fylica");
	chair4.setPrice("9500");
	chair4.setColor("green");
	chair4.setFinishType("powder coated");
	chair4.setStyle("modern");
	
	System.out.println(chair4.getName() +" "+ chair4.getPrice() +" "+ chair4.getColor() +" "+ chair4.getFinishType()+" "+ chair4.getStyle());
	
}

}