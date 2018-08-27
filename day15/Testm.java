package doufu;

class Outer{
	
	abstract class Inner{
		public abstract void method();
	}
	
}



//让MyClass直接继承Inner
class MyClass extends Outer.Inner{
	
	public  MyClass(Outer outer){
		outer.super();
	}

	@Override
	public void method() {
	}
	 
	
}
