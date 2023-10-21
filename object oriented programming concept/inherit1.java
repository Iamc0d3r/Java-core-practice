class parent{  
		 //parent class having method home().
	public void home(){
		System.out.println("We have home.");
	}
}
class child extends parent{
		//child class inherit home() method and now has 2 methods home() and car().
	public void car(){
		System.out.println("we have car.");
	}
}
class inherit1{
	public static void main(String[] args){
		child ch = new child();
		ch.home();
	}
}
