package doufu;

import java.math.BigDecimal;
import java.math.BigInteger;

/*8.	输入整型数98765，输出是56789*/
public class Test8 {
	public static void main(String[] args) {
		int test=98765;
		StringBuffer sb=new StringBuffer(""+test);		
		System.out.println(sb.reverse());
		
		BigInteger a = new BigInteger("123457");
		BigDecimal dd = new BigDecimal(a);
		int cc=a.toByteArray().length;
		//int dd=a.bitLength();
		System.out.println(dd);
		
	
	}

}
