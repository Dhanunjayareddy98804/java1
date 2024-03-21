public class Chair {
 
	private String name;
	private String price;
	private String color;
	private String finishType;
	private String style;
	
	
	public Chair(){
	System.out.println("Chair constructor is invoked");
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
	
	public void setFinishType(String finishType){
	this.finishType = finishType;
	}
	
	public String getFinishType(){
	return this.finishType;
	}
	
	public void setStyle(String style){
	this.style = style;
	}
	
	public String getStyle(){
	return this.style;
	}

}