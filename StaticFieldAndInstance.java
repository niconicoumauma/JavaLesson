//SampleClassRunner02.java
class SampleClass
{
	static int staticNum;
	int normalNum;
}

class SampleClassRunner02
{
	public static void main(String[] args) {
		SampleClass.staticNum = -1;
		
		SampleClass in01 = new SampleClass();
		SampleClass in02 = new SampleClass();

		in01.normalNum = 1;
		in02.normalNum = 2;

		System.out.println("in01.normalNum = " + in01.normalNum + " : in01.staticNum" + in01.staticNum);

		System.out.println("in02.normaiNum = " + in02.normalNum + " : in02.staticNum" + in02.staticNum);

		System.out.println("SampleClass.staticNum = " + SampleClass.staticNum);
	}
}
