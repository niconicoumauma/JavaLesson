/*
***Bpro.java***
*/

class BigCircle{
	private double xPoint;
	private double yPoint;
	private double xSpeed;
	private double ySpeed;
	private double radius;

	//set values
	public void setValues(double inXPoint, double inYPoint, double inXSpeed, double inYSpeed, double inRadius){
		xPoint = inXPoint;
		yPoint = inYPoint;
		xSpeed = inXSpeed;
		ySpeed = inYSpeed;
		radius = inRadius;
	}

	//show values
	private void show(){
		System.out.println("xPoint:" + xPoint);
		System.out.println("yPoint:" + yPoint);
		System.out.println("xSpeed:" + xSpeed);
		System.out.println("ySpeed:" + ySpeed);
		System.out.println("radius:" + radius);
		System.out.println("==============");
	}

	public void oneSecond(){
		xPoint += xSpeed;
		yPoint += ySpeed;
		show();
	}
}


class Area{
	private int width;
	private int depth;
	BigCircle target = new BigCircle();

	public void setValues(int inWidth, int inDepth){
		width = inWidth;
		depth = inDepth;
	}

	public void oneSecond(){
		target.oneSecond();
	}

}


class Bpro {
	public static void main(String[] args) {
		
		int sec = 60;

		Area ar = new Area();
		ar.setValues(100, 200);
		ar.target.setValues(1.0, 1.0, 2.0, 2.1, 4.0);
		for(int i=0; i<sec; i++){
			ar.oneSecond();
		}
		
	}
}


/*
2-A
*/
