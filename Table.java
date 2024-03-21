public class Table {
 
	private String name;
	private String price;
	private String color;
	private String finishType;
	private String weight;
	
	
	public Table(){
	System.out.println("Table constructor is invoked");
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
	
	public void setWeight(String weight){
	this.weight = weight;
	}
	
	public String getWeight(){
	return this.weight;
	}

}