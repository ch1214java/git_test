
public class _01StudentTest {

	/**
	 * ����һ��ģ�壬������д��Ϣ��������һ��������д��Ϣ��
	 * ���Ҽ�ס   new Student();  ������һ�ݣ�
	 * @param args
	 */
	public static void main(String[] args) {
		//part1:����ķ�ʽ
		new Student();//������һ��ģ�壬������һ������
		//��д��Ϣ
		new Student().name="С��";
		
		System.out.println(new Student().name);//null
		//part2:��ȷ�� ����
		//������һ��Student���͵Ķ���stu;
		Student stu = new Student();
		System.out.println(stu);//Student@15db9742
		
		stu.name = "СҶ";//��stu�ľ�̬���Ը�ֵ   .name  .age
		stu.age = 20;
		
		System.out.println(stu.name+"---"+stu.age);
		
		Student stu1 = new Student();//newһ��Student���͵Ķ���stu1
		stu1.name="oo";
		stu1.age = 20;
		stu1.add(2, 1);
		System.out.println(stu1.name+"---"+stu1.age);
		
	}

}
