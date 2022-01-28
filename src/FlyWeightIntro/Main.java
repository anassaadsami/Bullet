package FlyWeightIntro;

public class Main {

	public static void main(String[] args) {
		/*
		 * for the first time we write "Cyckle " the HashMap key does't have this key 
		 * so we create v by switch condition
		 */
		Vehicle v1 = VechicleFactort.getVehicle("Cyckle");   
		//now Client add the extrinsic property ( mutable) as a colour in this program
		v1.assignColor("red");
		v1.startEngine();
		System.out.println(v1.hashCode());
		System.out.println(v1.toString());
		System.out.println("\n-----------------\n");
		
		// the same here
		Vehicle t1 = VechicleFactort.getVehicle("Truck");
		t1.assignColor("Blue");
		t1.startEngine();
		System.out.println(t1.hashCode());
		System.out.println(t1.toString());
		System.out.println("\n-----------------\n");
		/*
		 *  but here key Truck is already found in HashMap so we return the same object but with DIFFERENT COLOUR
		 *  we does't create a new object but just return it from cache
		 */
		Vehicle t2 = VechicleFactort.getVehicle("Truck");
		t2.assignColor("Black");
		t2.startEngine();
		System.out.println(t2.hashCode());       // the same hashCode for t1 
		System.out.println(t2.toString());
		
		
		

	}

}
