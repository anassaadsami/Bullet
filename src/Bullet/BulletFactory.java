package Bullet;

import java.util.HashMap;
import java.util.Map;

class BulletFactory {
	/*
	 * static HashMap to can use it in static method
	 */
	static Map<BulletType, Bullet> bulletCache = new HashMap<>();
	/*
	 *  this method check if we have the same bullet type in HashMap and return it as a shared object
	 *  if not we invoke another method which create new bullet and store it in HashMap so we can use
	 *  it over and over quickly on demand
	 */
	 static Bullet getCachedBullet(BulletType type) {
		Bullet bullet = null;
		if (bulletCache.containsKey(type)) {
			bullet = bulletCache.get(type);
		} else {
			bullet = getUncachedBullet(type);
			bulletCache.put(type, bullet);
		}
		return bullet;
	}

		/*
		 *  this method create just new bullet all times when we call it 
		 *  so if we want to create just unshared bullet so we invoke just this method
		 */
	private static Bullet getUncachedBullet(BulletType type) {
		Bullet bullet = null;
		switch (type) {
		case PISTOL:
			bullet = new Bullet();
			System.out.println("pistol bullet is created now.");
			break;
		case SHOTGUN:
			bullet = new Bullet();
			System.out.println("shotgun bullet is created now.");
			break;
		case SINPER:
			bullet = new Bullet();
			System.out.println("sniper bullet is created now.");
			break;
			default :
				System.out.println("we have not this "+ type + "bullet");

		}
		return bullet;

	}

}
