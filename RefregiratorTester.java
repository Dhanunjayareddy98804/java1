class RefregiratorTester{
public static void main(String data[]){

//ClasssetName ref = new Constructor (ClasssetName());
	Refregirator fridge = new Refregirator();
	
	fridge.setName("whirpool");
	fridge.setPrice("11990");
	fridge.setColor("blue");
	fridge.setCapacity("184 litrs");
	fridge.setFreezerCapacity("14.3ltrs");
	
	
	System.out.println(fridge.getName() +" "+ fridge.getPrice() +" "+ fridge.getColor() +" "+ fridge.getCapacity()+" "+ fridge.getFreezerCapacity());
	
	Refregirator fridge1 = new Refregirator();
	fridge1.setName("samsung");
	fridge1.setPrice("14980");
	fridge1.setColor("inox");
	fridge1.setCapacity("183 litrs");
	fridge1.setFreezerCapacity("18 litrs");
	
	System.out.println(fridge1.getName() +" "+ fridge1.getPrice() +" "+ fridge1.getColor() +" "+ fridge1.getCapacity()+" "+ fridge1.getFreezerCapacity());

	Refregirator fridge2 = new Refregirator();	
	fridge2.setName("haier");
	fridge2.setPrice("10990");
	fridge2.setColor("red");
	fridge2.setCapacity("165 litrs");
	fridge2.setFreezerCapacity("15 litrs");
	
	System.out.println(fridge2.getName() +" "+ fridge2.getPrice() +" "+ fridge2.getColor() +" "+ fridge2.getCapacity()+" "+ fridge2.getFreezerCapacity());
	
	Refregirator fridge3 = new Refregirator();
	fridge3.setName("godrej");
	fridge3.setPrice("12590");
	fridge3.setColor("pep blue");
	fridge3.setCapacity("180 litrs");
	fridge3.setFreezerCapacity("13.5 litrs");
	
	System.out.println(fridge3.getName() +" "+ fridge3.getPrice() +" "+ fridge3.getColor() +" "+ fridge3.getCapacity()+" "+ fridge3.getFreezerCapacity());
	
	Refregirator fridge4 = new Refregirator();
	fridge4.setName("lg");
	fridge4.setPrice("16390");
	fridge4.setColor("scarlet");
	fridge4.setCapacity("185 litrs");
	fridge4.setFreezerCapacity("16 litrs");
	
	System.out.println(fridge4.getName() +" "+ fridge4.getPrice() +" "+ fridge4.getColor() +" "+ fridge4.getCapacity()+" "+ fridge4.getFreezerCapacity());
	
}

}