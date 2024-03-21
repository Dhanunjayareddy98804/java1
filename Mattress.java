public class Mattress {
 
	private String mattressName;
	private String price;
	private String ageRange;
	private String color;
	private String size;
	
	
	public Mattress(){
	System.out.println("Mattress constructor is invoked");
	}

	public void setMattressName(String mattressName){
	this.mattressName = mattressName;
	}
	
	public String getMattressName(){
	return this.mattressName;
	}
	
	public void setPrice(String price){
	this.price = price;
	}
	
	public String getPrice(){
	return this.price;
	}

	public void setAgeRange(String ageRange){
	this.ageRange = ageRange;
	}
	
	public String getAgeRange(){
	return this.ageRange;
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