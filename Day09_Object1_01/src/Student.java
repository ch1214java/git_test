
public class Student {//类：数据类型，描述了学生类；
	String name;//静态属性，成员变量
	int age;
	void add(int a,int b){//动态行为
		int sum = a+b;
		System.out.println(sum);
	}
	Student(){//无参的构造方法
		System.out.println("student con");
	}
	Student(int s,int b){//有参构造方法
		
	}
	Student(String s,int a){//有参构造方法
		name = s;
		age = a;
	}
}
