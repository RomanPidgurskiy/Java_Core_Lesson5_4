package ua.lviv.lgs;

public class Application {
	 
	private String name;
	private int width;
	private int height;
	
	Application(){
		name="Square";
		width=5;
		height=10;
	}
	
	Application(String name){
		this();
		this.name=name;
	}
	Application(int width, int height){
		this();
		this.width=width;
		this.height=height;
		
	}

	@Override
	public String toString() {
		return "Application [name=" + name + ", width=" + width + ", height=" + height + "]";
	}

	





	
	

}
