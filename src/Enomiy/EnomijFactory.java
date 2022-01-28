package Enomiy;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *  from class Factory all objects have been created  get from 
 *  EnomijFactory.getCachedEnomij(String type)  method
 */
 class EnomijFactory {

	// must be static to can use it in static getCachedEnomij(String type)
	static Map<String, Enomij> cachedEnomij = new HashMap<>();
//	List<EnomijType> list = new ArrayList<EnomijType>(Arrays.asList(Enomij.enomijType.like));
	

	public static Enomij getCachedEnomij(String type) {

		Enomij enomij = null; // must here inside the method otherwise must be static object and it's error

		if (cachedEnomij.containsKey(type)) {
			enomij = cachedEnomij.get(type);
	
//			System.out.println(EnomijType.like);
			System.out.println(enomij.hashCode());
			System.out.println();
		} else {
			switch (type) {
			case "like":
				System.out.printf("%s is created.%n", type);
				enomij = new Enomij();
				System.out.println(EnomijType.like);
				System.out.println(enomij.hashCode());
				break;
			case "unlike":
				System.out.printf("%s is created.%n", type);
				enomij = new Enomij();
				System.out.println(EnomijType.unlike);
				System.out.println(enomij.hashCode());
				break;
			case "share":
				System.out.printf("%s is created.%n", type);
				enomij = new Enomij();
				System.out.println(EnomijType.share);
				System.out.println(enomij.hashCode());
				break;
			default:
				System.out.printf("sorry we don't have this %s.%n", type);
			}
		}

		cachedEnomij.put(type, enomij); // don't forget this otherwise create new object every time
		return enomij;

	}
}
