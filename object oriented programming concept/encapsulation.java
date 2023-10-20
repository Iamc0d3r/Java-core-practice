class test7{
	private String text;
	
	public String getText(){
		return text;
	}
	
	public void setText(String text){
		this.text = text;
	}
}
class encapsulation{
	public static void main(String[] args){
		test7 t = new test7();
		t.setText("Hello");
		String j = t.getText();
		System.out.println(j);
	}
}

