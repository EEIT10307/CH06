package ch06;

public class MyRectangle {

double width , depth ; 

void setWidth(double w ) {
	width = w ; 
}
void setdepth(double d) {
	depth = d ; 
}
	
double getArea() {
	
	double x = width*depth ; 
	return x ; 	
	
}

public MyRectangle() {
	
}
public MyRectangle(double width , double depth) {
	
	this.width = width ; 
	this.depth = depth ; 	
	
}


}


