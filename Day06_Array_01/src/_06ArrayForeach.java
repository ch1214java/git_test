
public class _06ArrayForeach {
	
	

	/***
	 * �������飺��ǿforѭ��
	 * for(����Դ���������� ����:����Դ){
			System.out.println(e);//ͨ������ȡֵ
		}
		����Դ:����    ���ϣ�Iterableʵ�֣�
		1.�ŵ㣺��
		2.ȱ�㣺û��������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��������
		int[] num = {1,2,3,4,5};
		for(int e:num){
			System.out.println(e);
		}
		String[] name = {"�º�","���Ĵ�","������","������","��ΰ","������","���¹�","���j","��ϣТ","���","��ѧ��","Ҷ��","�ܲ���","������","��Դ","���½�","������","�ڽ�ǿ"};
		for(int i = 0;i<name.length;i++){
			System.out.println(name[i]);
		}
		for(int i = 0;i<=name.length-1;i++){
			System.out.println(name[i]);
		}
		for(String e:name){
			System.out.println(e);
		}
	}

}
