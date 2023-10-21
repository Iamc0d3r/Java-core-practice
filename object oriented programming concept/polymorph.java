class test1{
	public void m1(){
		System.out.println("this is a method");
	}
}
class test2 extends test1{
	public void m1(){
		System.out.println("method overriding");
	}
}
class polymorph{
	public static void main(String[] args){
		test2 t = new test2();
		t.m1();
	}
}

//This is method overriding. 
//m1() method is decalerd and defined again times with same parameters.
