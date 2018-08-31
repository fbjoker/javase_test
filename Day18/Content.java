package doufu;

public class Content {
	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		Content aa=new Content();
		String bb=aa.contens(arr);
		System.out.println(bb);
		
	}
	
	public  String contens(int[] arr){
		StringBuffer sb= new StringBuffer();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(""+arr[i]+",");
			sb.append(true);
		}
		sb.append("]");
		return new String(sb);
	}

}
