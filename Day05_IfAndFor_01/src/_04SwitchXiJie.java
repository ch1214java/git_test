
public class _04SwitchXiJie {

	/***
	 * switch ���ݴ����ֵ����caseƥ�䣬����ִ�д��룬һ��ִ�У������ṹ������
	 * 		1.case֮��˳����Խ���
	 * 		2.default��һ����һ������ĩβ��������caseʧЧ��ʱ��ִ�У�
	 * 		3.case��ֵ��key���ͱ���һ��
	 * 		4.���һ��brak����ʡ�ԣ���������
	 * 		5.break����ʡ�ԣ����ᵼ�º���case�����ж�ʧЧ�����մ��ϵ���˳��
	 * 			֪���ҵ���һ��break����ѡ��ṹ���û���ҵ���ִ�е�ĩβ�Զ�����ѡ��ṹ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week = 7;//week�������ڼ�
		switch (week) {//С���������ֵ�����չ涨��
			case 1:
				System.out.println("��һ");
				break;
			case 2:
				System.out.println("�ܶ�");
				break;
			case 3:
				System.out.println("����");
				break;
			case 4:
				System.out.println("����");
				break;
			case 5:
				System.out.println("����");
				break;
			default:
				System.out.println("���������졢��Ϣ");
				break;
		}
		

	}
}
