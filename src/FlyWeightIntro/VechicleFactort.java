package FlyWeightIntro;

import java.util.HashMap;

/*
 * this class responsible to provide Vehicle object and 
 * return new Vehicle or return one which found already through check it
 * in if condition
 */
public class VechicleFactort {  
	/*
	 * this array called cache ( in this we can store the shared objects with intrinsic properties and
	 * can be retrieved quickly on demand 
	 */
	private static HashMap< String , Vehicle> hm = new HashMap<>();  // we change it to static to can use it in static method 
	
	public static Vehicle getVehicle(String type) {    // static method 
		/*
		 *  we check if (String type) not found in HashMap as a key so we create this object's type
		 *  or we return the value of the key in HashMap (Vehicle) 
		 */
		Vehicle v = null;
		if(hm.containsKey(type)) {
			v = hm.get(type);       // here we return the same object which found in hm (the same hashCode)
		/*
		 * if the String type does not exist as a key in HashMap so we create this object for first time
		 * but next time when we type it in this method we return it from cache 
		 */
		}else {
			switch (type) {
			case "Cyckle":
				v = new Cyckle();
				System.out.printf("%s type is created.%n",type);
				break;
			case "Truck":
				v = new Truck();
				System.out.printf("%s type is created.%n",type);
				break;
				default:
					throw new IllegalArgumentException("this "+ type +" type is not exist.");
			}
		}
		hm.put(type, v);   //  we create Vehicle as a key type (String type)in HashMap
		return v;           // intrinsic property  immutable as the object itself with max speed in this program
		
	}
}
