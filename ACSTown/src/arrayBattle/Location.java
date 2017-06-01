package arrayBattle;

public class Location {
	
	float x, y;
	
	Unit unit;
	
	
	
	public Location(float ix, float iy){
		x = ix;
		y = iy;
	}
	
	float getLocX(){
		return x;
	}
	
	float getLocY(){
		return y;
	}
	
	
}
