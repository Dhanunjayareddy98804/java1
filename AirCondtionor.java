public class AirCondtionor {
 
	private String brandName;
	private String type;
	private String capacity;
	private String color;
	private String coolingCapacity;
	
	
	public AirCondtionor(){
	System.out.println("AirCondtionor constructor is invoked");
	}

	public void setBrandName(String brandName){
	this.brandName = brandName;
	}
	
	public String getBrandName(){
	return this.brandName;
	}
	
	public void setType(String type){
	this.type = type;
	}
	
	public String getType(){
	return this.type;
	}

	public void setCapacity(String capacity){
	this.capacity = capacity;
	}
	
	public String getCapacity(){
	return this.capacity;
	}
	
	public void setColor(String color){
	this.color = color;
	}
	
	public String getColor(){
	return this.color;
	}
	
	public void setCoolingCapacity(String coolingCapacity){
	this.coolingCapacity = coolingCapacity;
	}
	
	public String getCoolingCapacity(){
	return this.coolingCapacity;
	}
}