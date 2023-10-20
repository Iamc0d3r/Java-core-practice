class parent{
	public void home(){
		System.out.println("We have home.");
	}
}
class child extends parent{
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