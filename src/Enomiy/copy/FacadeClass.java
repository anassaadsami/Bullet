package Enomiy.copy;

 class FacadeClass {
	EnomijType e1 = EnomijType.like;
	EnomijType e2 = EnomijType.unlike;
	EnomijType e3 = EnomijType.share;
	EnomijType[] y = { e1, e2, e3 };

	public static void showEnomijItem(EnomijType[] x, String type) {
		for (EnomijType item : x) {
			if (item.name().equals(type)) {
				System.out.println(item);
			}
		}

	}

}
