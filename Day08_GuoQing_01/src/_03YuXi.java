
public class _03YuXi {

	/***
	 * 4.���һ������������һ��int�����飬���ظ����������ֵ���ռ���
	 * ˼·��
	 * 		1.������
	 * 		2.��������
	 * 			(1)int max = arr[0];
	 * 			(2)max�������е�ÿһ�����αȽϣ��ϴ�Ĵ���max��
	 * 			(3)ѭ������������ֵ�Ѿ�������max;
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,11,2,33,4,6,788,8,54};
		int m = getMax(a);
		System.out.println(m);
	}
	
	static int getMax(int[] arr){
		int max = arr[0];//�ٶ�arr[0]�������Ǹ�ֵ
		for(int e:arr){//��������
			if(e>max){//����͵�ÿ��Ԫ�غ�max�Ƚϣ�
				max = e;//�б���С��ľ͸�ֵ��max�У�
			}
		}
		//ѭ������max�Ѿ������������������Ǹ�ֵ��
		return max;
	}

}
