
public class _05Method {

	/***
	 * �ɱ��������������ĸ������Ա仯
	 * 		���������﷨������...��������(�����ֵ�������һ������)
	 * ע�����
	 * 		1.һ�������ġ��ɱ������ֻ����һ����
	 * 		2.��������ͨ���������ǿɱ���������ڷ������������һ��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add("��˵",1,23,3);
	}
	
	

	public static void add(String s,int...a){//�ɱ����������ڸ÷������������һ��
		for(int e:a){
			System.out.println(e+" ");
		}
		
	}

}
