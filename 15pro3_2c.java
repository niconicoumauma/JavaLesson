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
	public void show(){
		System.out.println("xPoint:" + xPoint);
		System.out.println("yPoint:" + yPoint);
		System.out.println("xSpeed:" + xSpeed);
		System.out.println("ySpeed:" + ySpeed);
		System.out.println("radius:" + radius);
		System.out.println("==============");
	}

	public double putXPoint(){
		return(xPoint);
	}

	public double putYPoint(){
		return(yPoint);
	}

	public void oneSecond(){
		xPoint += xSpeed;
		yPoint += ySpeed;
	}

	public void corrXSpeed(){
		xSpeed = -xSpeed;
	}

	public void corrXPoint(int limit){
		if(limit == 0){
			xPoint = -xPoint;
		}else{
			xPoint = limit - (xPoint - limit);
		}
	}

	public void corrYSpeed(){
		ySpeed = -ySpeed;
	}

	public void corrYPoint(int limit){
		if(limit == 0){
			yPoint = -yPoint;
		}else{
			yPoint = limit - (yPoint - limit);
		}
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
		if(target.putXPoint() < 0){
			target.corrXSpeed();
			target.corrXPoint(0);
		}else if(width < target.putXPoint()){
			target.corrXSpeed();
			target.corrXPoint(width);
		}

		if(target.putYPoint() < 0){
			target.corrYSpeed();
			target.corrYPoint(0);
		}else if(depth < target.putYPoint()){
			target.corrYSpeed();
			target.corrYPoint(depth);
		}

		target.show();
	}

}


class Cpro {
	public static void main(String[] args) {
		
		int sec = 100;

		Area ar = new Area();
		ar.setValues(100, 100);
		ar.target.setValues(1.0, 1.0, 2, 3, 4.0);
		for(int i=0; i<sec; i++){
			ar.oneSecond();
		}
		
	}
}


/*
2-C
*/
