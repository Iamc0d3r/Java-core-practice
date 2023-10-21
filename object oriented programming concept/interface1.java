interface inter1{
	public abstract void m1();
		 //m1()  method does not have any implementation because it is an abstract method.
}
class a implements inter1{

	public void m1(){		//m1() method gets imlementation after interface implementation.
		System.out.println("this is a interface concept");
	}
	}
class interface1{
	public static void main(String[] args){
		a i = new a();
		i.m1();
	}
}
