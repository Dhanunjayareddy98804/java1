public class Televisions {
 
	private String name;
	private String price;
	private String color;
	private String display;
	private String resolution;
	
	
	public Televisions(){
	System.out.println("Televisions constructor is invoked");
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
	
	public void setDisplay(String display){
	this.display = display;
	}
	
	public String getDisplay(){
	return this.display;
	}
	
	public void setResolution(String resolution){
	this.resolution = resolution;
	}
	
	public String getResolution(){
	return this.resolution;
	}
}