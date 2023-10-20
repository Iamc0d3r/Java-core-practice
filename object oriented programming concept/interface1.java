interface inter1{
	public abstract void m1();
}
class a implements inter1{

	public void m1(){
		System.out.println("this is a interface concept");
	}
	}
class interface1{
	public static void main(String[] args){
		a i = new a();
		i.m1();
	}
}