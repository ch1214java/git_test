
public class _08DoWhileLIanXi {

	/***
	 * dowhile��ϰ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	1.���10����2�ı��������� �� ������
		2.��� 1-10������ż���ĺ�*/
		
		//1.
		int i = 1,j = 0;
		do{
			if(i%2==0){
				j+=1;
			}
			i++;
		}while(i<=10);
		System.out.println("10����2�ı��������� �� ������"+j);
		
		//2.
		int t = 1,sum = 0;
		do{ 
			if(t%2==0){
				sum+=t;
			}
			t++;
		}while(t<=10);
		System.out.println("1-10������ż���ĺͣ�"+sum);
		
		
	}

}
