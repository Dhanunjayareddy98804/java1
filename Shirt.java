public class Shirt {
 
	private String shirtName;
	private String price;
	private String material;
	private String color;
	private String size;
	
	
	public Shirt(){
	System.out.println("Shirt constructor is invoked");
	}

	public void setShirtName(String shirtName){
	this.shirtName = shirtName;
	}
	
	public String getShirtName(){
	return this.shirtName;
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