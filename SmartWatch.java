public class SmartWatch {
 
	private String watchName;
	private String price;
	private String soldBy;
	private String modelNumber;
	
	
	public SmartWatch(){
	System.out.println("SmartWatch constructor is invoked");
	}

	public void setWatchName(String watchName){
	this.watchName = watchName;
	}
	
	public String getWatchName(){
	return this.watchName;
	}
	
	public void setPrice(String price){
	this.price = price;
	}
	
	public String getPrice(){
	return this.price;
	}

	public void setSoldBy(String soldBy){
	this.soldBy = soldBy;
	}
	
	public String getSoldBy(){
	return this.soldBy;
	}
	
	public void setModelNumber(String modelNumber){
	this.modelNumber = modelNumber;
	}
	
	public String getModelNumber(){
	return this.modelNumber;
	}	
}