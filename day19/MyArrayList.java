package doufu;

import java.util.Arrays;

/*
 * 模仿ArrayList，自己设计一个容器，动态数组
 * 1、Object get(int index)
2、boolean contains(Object obj)
3、remove(int index)
4、remove(Object obj)//如果有重复，只删除第一个
5、set(int index,Object value)
 */
public class MyArrayList {
	private Object[] data;//因为不知道将来这个容器用来装什么对象
	private int total;//记录实际存储元素的个数
	
	public MyArrayList(){
		data = new Object[10];
	}
	
	//添加一个元素，默认添加到列表最后
	public void add(Object obj){
		grow();//是否要扩容
		data[total++] = obj;
	}

	private void grow() {
		//是否要扩容
		if(total>=data.length){
			//(1)创建新数组，（2）把旧数据的元素复制过去
			data = Arrays.copyOf(data, data.length*2);
		}
	}
	
	//添加一个元素到指定位置
	public void add(int index, Object obj)throws IndexOutOfBoundsException{
		if(index<0 || index>total){
			throw new IndexOutOfBoundsException(index + "超出边界");
		}
		
		//(1)先把index以及后面的元素后移
		/*
		 * 假设total=5,length=10,index=2  [0]~[4] 移动[2][3][4]  个数：total-index
		 * 假设total=10,length=10,index=2 [0]~[9] 移动[2]~[9] 所以要扩容，否则[9]移出了数组了
		 */
		grow();//是否要扩容
		System.arraycopy(data, index, data, index+1, total-index);
		
		//(2)
		data[index] = obj;
		//(3)元素个数增加
		total++;
	}
	
	//返回实际存储的元素个数
	public int size(){
		return total;
	}
	
	//返回实际容量
	public int capacity(){
		return data.length;
	}
	
	//返回实际存储的所有元素
	public Object[] toArray(){
		return Arrays.copyOf(data, total);
	}
	
	public Object get(int index){
		if(index<0||index>total){
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}
	
	public boolean contains(Object obj){
		boolean flag= false;
		for (int i = 0; i < total; i++) {
			if(data[i].equals(obj)){
				flag=true;
			}
		}
		return flag;
	}
	public void remove(int index) throws IndexOutOfBoundsException{
		if(index<0||index>total){
			throw new IndexOutOfBoundsException();
		}
		System.arraycopy(data, index+1, data, index, total-index-1);
		data[--total]=null;
		
		
	}
	
	public void remove(Object obj){
		if(contains(obj)){
			int index =-1;
			for (int i = 0; i < total; i++) {
				if(data[i].equals(obj)){
					index=i;
				}
			}
			remove(index);
			
		}
	}
	
	public void set(int index,Object value){
		if(index<0||index>total){
			throw new IndexOutOfBoundsException();
		}
		data[index]=value;
	}

	@Override
	public String toString() {
		return "MyArrayList [data=" + Arrays.toString(data) ;
	}
	
	
	
}
