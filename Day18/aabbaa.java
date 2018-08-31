package doufu;

public class aabbaa {
	public static void main(String[] args) {
		String a="aabbaa";
		System.out.println(ismirro(a));
		
	}
	
	public static boolean ismirro(String str){
	/*	String a =str.substring(0,str.length()/2);
		String b =str.substring(str.length()/2);*/
		
		StringBuffer sb= new StringBuffer(str);
		//System.out.println(a);
		//System.out.println(sb.reverse());
		 String b=new String(sb.reverse());
		// System.out.println(b);
		if(str.equals(b)){
			return true;
		}else{
			return false;
		}
		
	}
}
