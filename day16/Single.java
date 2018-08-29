package doufu;

public class Single {

}
enum Single1{
	INSTANCE
}

class Hungry{
	
	public static final Hungry INSTANCE = new Hungry();
	private Hungry(){
	}
	
}

class Lazy{
	public static  Lazy INSTANCE;	
	private Lazy(){		
	}	
	private Lazy getLzay(){
		if(INSTANCE==null){
			return new Lazy();
		}		
		return INSTANCE;
	}	
}