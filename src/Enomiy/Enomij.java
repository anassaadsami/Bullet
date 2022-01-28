package Enomiy;

 class Enomij {
	EnomijType enomijType;
	
	


//	public Enomij(String type) {
//		
//	}
//		this.enomijType.name   = type;
	
//	public Enomij(EnomijType enomijType) {
//		this.enomijType = enomijType;
//	}
	
//	@Override
//	public String toString() {
//		return "Enomij [enomijType=" + enomijType + "]";
//	}
	
	public void showEnomij(String type , int times) {
		for (int i = 0; i < times; i++) {
			EnomijFactory.getCachedEnomij(type);
		}
		
		
	}


	
	 
	
}
