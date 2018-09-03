package doufu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/*请从键盘随机输入10个整数保存到List中，并按倒序、从大到小的顺序显示出来*/
public class ArrayTest {
	   public static void main(String[] args){
           List list= new ArrayList();
           ArrayList list2= new ArrayList();
           
           
           Scanner input = new Scanner(System.in);
           for (int i = 0; i < 10; i++) {
        	   list.add(input.nextInt());
			
           }
           Collections.sort(list);
           
           
           System.out.println(Arrays.toString(list.toArray()));
     }


}


