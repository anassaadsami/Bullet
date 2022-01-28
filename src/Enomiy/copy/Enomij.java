package Enomiy.copy;

 class Enomij {
	EnomijType type;

//	public Enomij() {
//		
//	}
	public Enomij(EnomijType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Enomij [enomijType=" + type + "]";
	}

	public void showEnomij(EnomijType type , int times) {
		for (int i = 0; i < times; i++) {
			EnomijFactory.getCachedEnomij(type);
		}

	}

//	EnomijType e1 = EnomijType.like;
//	EnomijType e2 = EnomijType.unlike;
//	EnomijType e3 = EnomijType.share;
//	EnomijType[] y = { e1, e2, e3 };
//
//	public static void showEnomijItem(EnomijType[] x , EnomijType type) {
//		for (EnomijType item : x) {
//			if (item == type){
//				System.out.println(item);
//			}
//		}
//
//	}

}
