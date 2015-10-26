/*
***Apro.java***
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
}


class Apro {
	public static void main(String[] args) {
		
		int sec = 60;
		BigCircle bc = new BigCircle();

		bc.setValues(1.0, 1.0, 1.5, 1.5, 4.0);
		for(int i=0; i<sec; i++){
			bc.oneSecond();
		}
	}
}


/*
2-A
*/
