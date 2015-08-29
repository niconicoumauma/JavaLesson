//SampleClassRunner.java
class SampleClass
{
	private boolean status;
	public void setStatus(boolean x){
		status = x;
	}
	public boolean getStatus(){
		return status;
	}
}

class SampleClassRunner
{
	public static void main(String[] args) {
		SampleClass sc = new SampleClass();
		sc.setStatus(false);
		System.out.println(sc.getStatus());
	}
}
