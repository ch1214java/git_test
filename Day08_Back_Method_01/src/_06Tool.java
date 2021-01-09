
public class _06Tool {//这个类：提供一些静态方法，完成了一些功能；
	/***
	 *
	 */
	public static String toString(int[] arr){
		String str = "[";
		for(int e:arr){
			if(e==arr[arr.length-1]){
				str +=e+"]";
			}else{
				str+=e+",";
			}
		}
		
		return str;
	}
}
