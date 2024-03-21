class MattressTester{
public static void main(String data[]){

//ClassName ref = new Constructor (ClassName());
	Mattress bed = new Mattress();
	
	bed.setMattressName("wakefit");
	bed.setPrice("14187");
	bed.setAgeRange("adult");
	bed.setColor("black");
	bed.setSize("king size");
	
	
	System.out.println(bed.getMattressName() +" "+ bed.getPrice() +" "+ bed.getAgeRange() +" "+ bed.getColor()+" "+ bed.getSize());
	
	Mattress bed1 = new Mattress();
	bed1.setMattressName("wakeup india");
	bed1.setPrice("12326");
	bed1.setAgeRange("adult");
	bed1.setColor("green");
	bed1.setSize("78 inch");
	
	System.out.println(bed1.getMattressName() +" "+ bed1.getPrice() +" "+ bed1.getAgeRange() +" "+ bed1.getColor()+" "+ bed1.getSize());

	Mattress bed2 = new Mattress();	
	bed2.setMattressName("sleepyhead");
	bed2.setPrice("15898");
	bed2.setAgeRange("all ages");
	bed2.setColor("blue");
	bed2.setSize("king");
	
	System.out.println(bed2.getMattressName() +" "+ bed2.getPrice() +" "+ bed2.getAgeRange() +" "+ bed2.getColor()+" "+ bed2.getSize());
	
	Mattress bed3 = new Mattress();
	bed3.setMattressName("sleepwell");
	bed3.setPrice("6642");
	bed3.setAgeRange("adult");
	bed3.setColor("grey");
	bed3.setSize("double");
	
	System.out.println(bed3.getMattressName() +" "+ bed3.getPrice() +" "+ bed3.getAgeRange() +" "+ bed3.getColor()+" "+ bed3.getSize());
	
	Mattress bed4 = new Mattress();
	bed4.setMattressName("nilkamal");
	bed4.setPrice("6009");
	bed4.setAgeRange("adult");
	bed4.setColor("white");
	bed4.setSize("4inch");
	
	System.out.println(bed4.getMattressName() +" "+ bed4.getPrice() +" "+ bed4.getAgeRange() +" "+ bed4.getColor()+" "+ bed4.getSize());
	
}

}