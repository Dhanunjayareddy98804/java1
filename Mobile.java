public class Mobile {
 
	private String mobileName;
	private String camera;
	private String screenType;
	private String battery;
	private String ram;
	private String os;
	
	public Mobile(){
	System.out.println("Mobile constructor is invoked");
	}

	public void setMobileName(String mobileName){
	this.mobileName = mobileName;
	}
	
	public String getMobileName(){
	return this.mobileName;
	}
	
	public void setCamera(String camera){
	this.camera = camera;
	}
	
	public String getCamera(){
	return this.camera;
	}

	public void setScreenType(String screenType){
	this.screenType = screenType;
	}
	
	public String getScreenType(){
	return this.screenType;
	}
	
	public void setBattery(String battery){
	this.battery = battery;
	}
	
	public String getBattery(){
	return this.battery;
	}
	
	public void setRam(String ram){
	this.ram = ram;
	}
	
	public String getRam(){
	return this.ram;
	}
	
	public void setOs(String os){
	this.os = os;
	}
	
	public String getOs(){
	return this.os;
	}
}