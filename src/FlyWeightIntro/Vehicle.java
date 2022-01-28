package FlyWeightIntro;
 interface Vehicle {
	void assignColor(String color);    // we assign extrinsic fields by Client 
	void startEngine();

}
class Truck implements Vehicle{
	private final String maxSpeed ;    // intrinsic field ( immutable)
	private String color ;                        // extrinsic field  ( mutable)
	
	public Truck( ) {              // in constructor we assign just intrinsic fields 
		this.maxSpeed = "250";    // every time we create a new Truck we assign this value to max speed 
		
	}


	@Override
	public void assignColor(String color) {
		this.color = color;
	}

	@Override
	public void startEngine() {
		System.out.printf("%s truck with max speed %s is started.%n",this.color, this.maxSpeed);
		
		
	}

	@Override
	public String toString() {
		return "Truck [maxSpeed=" + maxSpeed + ", color=" + color + "]";
	}
	
}
class Cyckle implements Vehicle{
	private final String maxSpeed ;    // intrinsic field ( immutable)
	private String color ;                        // extrinsic field  ( mutable)
	
	public Cyckle( ) {
		this.maxSpeed = "25";    // every time we create a new Truck we assign this value to max speed 
		
	}
	
	
	@Override
	public void assignColor(String color) {
		this.color = color;
	}
	
	@Override
	public void startEngine() {
		System.out.printf("%s cyckle with max speed %s is started.%n",this.color, this.maxSpeed);
		
		
	}
	@Override
	public String toString() {
		return "Cyckle [maxSpeed=" + maxSpeed + ", color=" + color + "]";
	}
	
}
