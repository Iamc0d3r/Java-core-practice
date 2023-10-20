abstract class test5{
	public abstract void m1();
}
class test6 extends test5{
	public void m1(){
		System.out.println("m1 was abstract method");
	}
}
class abstraction{
	public static void main(String[] args){
		test6 t = new test6();
		t.m1();
	}
}