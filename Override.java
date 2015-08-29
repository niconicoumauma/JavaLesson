//SampleClassRunner06.java
class SampleClass
{
	public void printMyName(){
		System.out.println("niconicoumauma");
	}
	public void callPrintMyName(){
		printMyName();
	}
}

class SubClass extends SampleClass{
	public void printMyName(){
		System.out.println("NICONICOUMAUMA");
	}
}

class SampleClassRunner06
{
	public static void main(String[] args) {
		SubClass ins = new SubClass();
		ins.callPrintMyName();
	}
}
