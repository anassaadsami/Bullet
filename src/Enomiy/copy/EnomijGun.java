package Enomiy.copy;

 class EnomijGun {
	int capacity;
	Enomij enomij ;
	Enomij[]repository ;
	EnomijType type ;
	

	public EnomijGun(int capacity) {
		this.capacity = capacity;
//		this.enomij = enomiy;
//		this.repo = repo;
	} 
	
	public EnomijGun() {
		
	}


	public void loadGun( int capacity , EnomijType type) {
		repository = new Enomij[capacity];
		for (int i = 0; i < capacity ; i++) {
			this.repository[i]= EnomijFactory.getCachedEnomij(type);
		}
//		return this.repository;
		System.out.println(this.repository.length);
	}
	
	public void shootEnomij() {
		for (int i = 0; i < this.repository.length; i++) {
			System.out.print((i+1)+"" + this.repository[i].type +"  ");
//			System.out.println(this.repository[i].hashCode());
			
		}
	}

}
