
public class _06Tool {//����ࣺ�ṩһЩ��̬�����������һЩ���ܣ�
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
