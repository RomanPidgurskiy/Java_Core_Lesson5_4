package ua.lviv.lgs;

public class main {
	
  public static void main(String[] args) {
	  
	  Application app1 = new Application("Rectangle");
	  System.out.println(app1.toString());
	
	  Application app2 = new Application(5,5);
	  System.out.println(app2.toString());
}
}
