package Enomiy.copy;

class Client {

	public static void main(String[] args) {
//		Enomij smile = EnomijFactory.getCachedEnomij(EnomijType.like);
//		Enomij smile1 = EnomijFactory.getCachedEnomij("like");
//		Enomij smile2 = EnomijFactory.getCachedEnomij(EnomijType.share);
//		smile.showEnomij(EnomijType.like, 10);
//		smile2.showEnomij(EnomijType.share, 10);
//		EnomijType like = EnomijType.like;
		
		EnomijGun gun = new EnomijGun(10);
		gun.loadGun(10 , EnomijType.share);
		gun.shootEnomij();

	}

}
