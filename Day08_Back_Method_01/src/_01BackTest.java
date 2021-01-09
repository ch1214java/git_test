
public class _01BackTest {//所有的程序，都是要通过-名字-来使用

	/***
	 * 1.处理数据。【数据类型 值】
	 * 2.新建一个类，提供一个主方法对各种【基本语法】进行测试
	 * 		1.数据类型---类型转换[byte,short,int,long,char,boolean,float,double]
	 * 		2.运算符
	 * 		3.变量：装数据
	 * 		4.流程控制：----顺序，选择，循环----
	 * 		5.数组：装数据int[] arr = new int[10];//arr中转的是地址值，引用数据类型；
	 * 		6.方法：代码块，重复使用，完成独立功能，处理数据的一个代码块，入口，返回值
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 11;
		if(i<99){
			i+=i;
		}
		System.out.println(i);
		int[] arr = {1,2,3,4,5,6,7};
		String str = "[";
		for(int e : arr){
			if(e == arr[arr.length-1]){
				str+=e+"]";
			}else{
				str+=e+",";
			}
		}
		System.out.println(str);
		
		String st = Arrayp(arr);
		System.out.println(st);
		
	}
	public static String Arrayp(int[] arr){
		int temp;
		String str = "[";
		for(int i =0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		for(int e:arr){
			if(e == arr[arr.length-1]){
				str += e + "]";
			}else{
				str += e + ",";
			}
		}
		return str;
	}
}
