
public class _02IfLianXi {

	public static void main(String[] args) {
		//���2�������е����ֵ
		int i = 30,j = 20;
		if (i>j) {
			System.out.println("���ֵ�ǣ�"+i);
		} else {
			System.out.println("���ֵ�ǣ�"+j);
		}
		
		//2.�ж�һ�����Ƿ���3�ı���
		if(i%3==0){
			System.out.println("��3�ı���");
		}else{
			System.out.println("����3�ı���");
		}
		
		/*
		3.С��java ���Գɼ� ���ȼ���A B C D ���жϱ���ֵ�ڲ�ͬ�ķ�Χ�ģ���ӡ�����ͬ�ĵȼ�
		90~100  A�ȡ�
		80-89    B�ȡ�
		70-79    C�ȡ�
		60-69    D�ȡ�
		60����   E�ȡ�
		*/
		int num = 60;
		if (num>=90) {
			System.out.println("A��");
		}else if(num>=80 && num<90){
			System.out.println("B��");
		}else if(num>=70 && num<80){
			System.out.println("C��");
		}else if(num>=60 && num<70){
			System.out.println("D��");
		}else if(num<60){
			System.out.println("E��");
		}else {
			System.out.println("������ɼ�");
		}
	}

}
