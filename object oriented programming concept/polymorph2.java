class test3{
	public void m1(){
		System.out.println("this is a method");
	}
	public void m1(int a){
		System.out.println(a*a);
	}
	public void m1(int a, int b){
		System.out.println(a*b);
	}
	
}
class polymorph2{
	public static void main(String[] args){
		test3 t = new test3();
		t.m1();
		t.m1(4);
		t.m1(4,6);
	}
}