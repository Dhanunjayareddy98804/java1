public class Pant {
 
	private String pantName;
	private String price;
	private String material;
	private String color;
	private String size;
	
	
	public Pant(){
	System.out.println(":Pant constructor is invoked");
	}

	public void setPantName(String pantName){
	this.pantName = pantName;
	}
	
	public String getPantName(){
	return this.pantName;
	}
	
	public void setPrice(String price){
	this.price = price;
	}
	
	public String getPrice(){
	return this.price;
	}

	public void setMaterial(String material){
	this.material = material;
	}
	
	public String getMaterial(){
	return this.material;
	}
	
	public void setColor(String color){
	this.color = color;
	}
	
	public String getColor(){
	return this.color;
	}
	
	public void setSize(String size){
	this.size = size;
	}
	
	public String getSize(){
	return this.size;
	}
}