
public class _01BackTest {//���еĳ��򣬶���Ҫͨ��-����-��ʹ��

	/***
	 * 1.�������ݡ����������� ֵ��
	 * 2.�½�һ���࣬�ṩһ���������Ը��֡������﷨�����в���
	 * 		1.��������---����ת��[byte,short,int,long,char,boolean,float,double]
	 * 		2.�����
	 * 		3.������װ����
	 * 		4.���̿��ƣ�----˳��ѡ��ѭ��----
	 * 		5.���飺װ����int[] arr = new int[10];//arr��ת���ǵ�ֵַ�������������ͣ�
	 * 		6.����������飬�ظ�ʹ�ã���ɶ������ܣ��������ݵ�һ������飬��ڣ�����ֵ
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
