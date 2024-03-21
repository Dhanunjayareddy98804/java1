public class Refregirator {
 
	private String name;
	private String price;
	private String color;
	private String capacity;
	private String freezerCapacity;
	
	
	public Refregirator(){
	System.out.println("Refregirator constructor is invoked");
	}

	public void setName(String name){
	this.name = name;
	}
	
	public String getName(){
	return this.name;
	}
	
	public void setPrice(String price){
	this.price = price;
	}
	
	public String getPrice(){
	return this.price;
	}

	public void setColor(String color){
	this.color = color;
	}
	
	public String getColor(){
	return this.color;
	}
	
	public void setCapacity(String capacity){
	this.capacity = capacity;
	}
	
	public String getCapacity(){
	return this.capacity;
	}
	
	public void setFreezerCapacity(String freezerCapacity){
	this.freezerCapacity = freezerCapacity;
	}
	
	public String getFreezerCapacity(){
	return this.freezerCapacity;
	}
}