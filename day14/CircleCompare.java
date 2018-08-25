package doufu;

import java.util.Comparator;

/*1、已知java.util.Comparator接口，这个接口有一个抽象方法：
int compare(Object obj1, Object obj2)
			o1  大于  o2  返回正整数
 * 			o1  小于  o2  返回负整数
 * 			o1  等于  o2  返回0
2、编写一个圆的类Circle，包含属性，radius
3、编写一个Comparator的实现类CircleComparator，可以比较两个圆对象的大小，比较半径
4、编写一个GraphicTools类，有一个静态方法：
public static void sort(Object[] arr)
可以为圆数组对象排序
5、在测试类中测试*/
public class CircleCompare implements Comparator{

	/*@Override
	public int compare(Object o1, Object o2) {
		
		return 0;
	}*/

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Circle&&o2 instanceof Circle){
			
		if(((Circle) o1).getRadius()>((Circle) o2).getRadius()){
			return 1;
		}else if(((Circle) o1).getRadius()>((Circle) o2).getRadius()){
			return -1;
		}
		return 0;
		
		}
		
		return 2;
			
		
	}
	

}
