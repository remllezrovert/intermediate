package java111.week11;

public class Bird extends PolyAnimal{
	//Step-1: add a constructor with three parameters to initialize the x_coordinate, y_coordinate, and id 
		//call Animal class constructor inside Bird constructor to complete this task
	//Define common attributes for all animals
	//(1) private instance variables: x_coordinate, y_coordinate to tell the location of each animal
	private double x_coordinate;   
	private double y_coordinate; 
	//(2) private instance variable: id to provide identifier for each animal object
    private String id;
	
	//Constructor with three parameters
	public Bird(double x, double y, String id) {
		super(x,y,id);
	}
	public Bird(){
	   this(0, 0, "");
	}
	
	//Step-1:add a constructor without parameter

	
	@Override
	public void move() {
		fly(5);
	}
	
	private void fly(double feet) {
		//call setX_coordinate() method, and setY_coordinate() method to update x_coordinate and y_coordinate by adding distance (# of feet) to x_coordinate, and y_coordinate
		setX_coordinate(getPosition()[0] + feet);
		setY_coordinate(getPosition()[1] + feet);
		double distance = Math.sqrt(feet*feet + feet*feet);
		System.out.printf("%s flew: %.1f feet.\n", this.getClass().getSimpleName(), distance);
	}
}


