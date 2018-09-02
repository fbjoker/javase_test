package doufu;

import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		Integer[] datas = {1,2,3,4,5};
		List list = Arrays.asList(datas);
		//list.add(5);
		System.out.println(list);

}

public static int test(int x, int y){
	int result = x;
	try{
		if(x<0 || y<0){
			return 0;
		}
		result = x + y;
		return result;
	}finally{
		result = x - y;
		return result;

	}
}

}