
public class Student {//�ࣺ�������ͣ�������ѧ���ࣻ
	String name;//��̬���ԣ���Ա����
	int age;
	void add(int a,int b){//��̬��Ϊ
		int sum = a+b;
		System.out.println(sum);
	}
	Student(){//�޲εĹ��췽��
		System.out.println("student con");
	}
	Student(int s,int b){//�вι��췽��
		
	}
	Student(String s,int a){//�вι��췽��
		name = s;
		age = a;
	}
}
