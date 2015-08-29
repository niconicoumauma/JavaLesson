//SampleClassRunner07.java
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

class SampleClassRunner07
{
	public static void main(String[] args) {
		SampleClass ins = new SubClass();
		ins.callPrintMyName();
	}
}
