public class HelloWorldGender extends HelloWorld{
	private boolean Gender;
	
	public HelloWorldGender(String name,boolean Gender){
		super(name);
		this.Gender = Gender;	
	}
	
	public void print(){
		String G;
		if(Gender == false)
			G = "Mr";
		else
			G = "Miss";
		System.out.println("Hello "+G+" "+this.name);
	}
}
