
public class _01HemoWork {

	/***
	 * 1.��һ������������һ�����飬���ַ�����ʽ[11,22,33,44,55,66]���أ�����ӡpublic static String print(int[] arr)
		2.��ɵ�һ�����ݵ�Ԥϰ�ʹ�����ϰ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��һ������������һ�����飬���ַ�����ʽ[11,22,33,44,55,66]���أ�
		//����ӡpublic static String print(int[] arr)
		int[] arr = {11,22,33,44,55,66};//����һ��int���͵�����arr
		String str = print(arr);
		System.out.println(str);//�����ӡ
	}
	
	public static String print(int[] arr){//����һ��print�ķ���������int���͵����飬�ɷ���һ��String���͵�����
		String str = "[";//����һ��string���͵ı���
		for(int i = 0;i<arr.length;i++){//ѭ����������
			if(i==arr.length-1){//��������һ��Ԫ�أ�������һ��]
				str+=arr[i]+"]";
			}else{
				str+=arr[i]+",";
			}
		}
		return str;//����һ��String���͵�����
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
