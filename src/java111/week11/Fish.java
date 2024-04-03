package java111.week11;

import java.util.Random;

//Fish class
public class Fish extends PolyAnimal{
	
	//Step-1: add a constructor with three parameters to initialize the x_coordinate, y_coordinate, and id 
	//call Animal class constructor inside Fish constructor to complete this task
	private double x_coordinate;   
	private double y_coordinate; 
	//(2) private instance variable: id to provide identifier for each animal object
    private String id;
	
	//Constructor with three parameters
	public Fish(double x, double y, String id) {
		super(x,y,id);
	}
	public Fish(){
	   this(0, 0, "");
	}
	
	//Step-1: add a constructor without parameter

	
	@Override
	public void move() {
		swim(3);
	//bonus-point step: instead of using a constant 3 here, modify the code to use a random number generator to 
		//to generate random swimming distance between -3 (means move to the left-side of current position) to 3 (move to the right-side of current position)
	    //by calling randomMove() method
		//double rMove = randomMove(-3, 3);
		//swim(rMove);
	}
	
	//generate random move distance
	/*private double randomMove(int min, int max) {
		Random r = new Random();
		return r.nextDouble(max - min +1) - 3; //[-3, 3]
		
	}*/
	
	private void swim(double feet) {
		//call setX_coordinate() method to update x_coordinate by adding distance (# of feet) to x_coordinate
		setX_coordinate(getPosition()[0] + feet);
		System.out.printf("%s swam: %.1f feet.\n", this.getClass().getSimpleName(), feet);
	}
	
	
}
