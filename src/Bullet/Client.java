package Bullet;

class Client {

	public static void main(String[] args) {
		BulletType redBulletPistol = BulletType.PISTOL;
		BulletType redBulletShotGun = BulletType.SHOTGUN;
		BulletType redBulletSniper = BulletType.SINPER;
		
		Bullet bullet = BulletFactory.getCachedBullet(redBulletSniper);
		System.out.println(bullet.toString());
		System.out.println(bullet.hashCode());
		
		Bullet bullet1 = BulletFactory.getCachedBullet(redBulletSniper);
		System.out.println(bullet1.toString());
		System.out.println(bullet1.hashCode());
		
		

	}

}
