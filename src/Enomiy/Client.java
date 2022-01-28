package Enomiy;
 class Client {

	public static void main(String[] args) {
		Enomij smile = EnomijFactory.getCachedEnomij("like");
//		Enomij smile1 = EnomijFactory.getCachedEnomij("like");
//		Enomij smile2 = EnomijFactory.getCachedEnomij("like");
		smile.showEnomij("like", 10);

	}

}
