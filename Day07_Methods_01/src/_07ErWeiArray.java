
public class _07ErWeiArray {
	/**
	 * ��λ���飬�˽�һ��
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ����ά����arr,����������Ԫ��
		int[][] arr = {{1,2,3,40},{4,5,6},{7,8,9,10}};
		for(int[] e:arr){//������ά����
			for(int n:e){//������λ�����Ԫ��
				System.out.print(n);
			}
			System.out.println();
		}
		//�ڶ���ѭ��������ʽ��
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
