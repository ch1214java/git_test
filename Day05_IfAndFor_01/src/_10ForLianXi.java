
public class _10ForLianXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		2.��������ʾ���� ���i��ֵ�Ƕ��� �ж�ִ���˼��� ѭ������ ��������յ��������Ƕ��٣�
		(1)
		
		��2��
		*/
		//1.��forѭ������1-10�� ��(��10�Ľ׳�)1*2*3*4*5*6  ~   *10
		int t = 10,count = 1;
		for(int i = 1;i<=t;i++){
			count *=i;
			System.out.println(i+"�Ľ׳�:"+count);
		}
		
		for(int i = 1;i<=10;i+=2){
			System.out.println("i="+i);
		}
		
		
		for(int j = 1;j++<=10;j+=2){
			System.out.println("j="+j);
		}
	}

}
