
public class _01HemoWork {

	/***
	 * 1.定一个方法，传入一个数组，以字符串格式[11,22,33,44,55,66]返回，并打印public static String print(int[] arr)
		2.完成第一天内容的预习和代码练习
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.定一个方法，传入一个数组，以字符串格式[11,22,33,44,55,66]返回，
		//并打印public static String print(int[] arr)
		int[] arr = {11,22,33,44,55,66};//定义一个int类型的数组arr
		String str = print(arr);
		System.out.println(str);//输出打印
	}
	
	public static String print(int[] arr){//定义一个print的方法，传入int类型的数组，可返回一个String类型的数据
		String str = "[";//定义一个string类型的变量
		for(int i = 0;i<arr.length;i++){//循环遍历数据
			if(i==arr.length-1){//如果是最后一个元素，就链接一个]
				str+=arr[i]+"]";
			}else{
				str+=arr[i]+",";
			}
		}
		return str;//返回一个String类型的数据
	}
	
	public static String print1(int[] arr){
		String str = "[";
		for(int e:arr){
			if(e==arr[arr.length-1]){
				str+=e+"]";
			}else{
				str+=e+",";
			}
		}
		return str;
	}
}
