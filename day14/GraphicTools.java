package doufu;
/*编写一个GraphicTools类，有一个静态方法：
public static void sort(Object[] arr)
可以为圆数组对象排序*/
public class GraphicTools {
	
	public static void sort(Object[] arr){
		CircleCompare cc=new CircleCompare();
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(cc.compare( arr[j],arr[j+1])>0){
					Object temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	}

}
