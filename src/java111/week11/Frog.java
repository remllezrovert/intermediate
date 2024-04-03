package java111.week11;
public class Frog extends PolyAnimal{
	
	    //step-1: a constructor with three parameters to initialize the x_coordinate, y_coordinate, and id 
		//call Animal class constructor inside Frog constructor to complete this task
	private double x_coordinate;   
	private double y_coordinate; 
	//(2) private instance variable: id to provide identifier for each animal object
    private String id;
	
	//Constructor with three parameters
	public Frog(double x, double y, String id) {
		super(x,y,id);
	}

	public Frog(){
	   this(0, 0, "");
	}
		
		//step-1: add a constructor without parameter
	
		
		@Override
		public void move() {
			jump(5);
		}
		
		private void jump(double feet) {
			//call setY_coordinate() method to update y_coordinate by adding distance (# of feet) to y_coordinate
			setY_coordinate(getPosition()[1] + feet);
			System.out.printf("%s jumped: %.1f feet.\n", this.getClass().getSimpleName(), feet);
		}
		
	}
