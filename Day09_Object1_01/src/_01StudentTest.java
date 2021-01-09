
public class _01StudentTest {

	/**
	 * 复制一份模板，并且填写信息【穿件了一个对象，填写信息】
	 * 暂且记住   new Student();  复制了一份；
	 * @param args
	 */
	public static void main(String[] args) {
		//part1:错误的方式
		new Student();//复制了一份模板，创建了一个对象；
		//填写信息
		new Student().name="小芳";
		
		System.out.println(new Student().name);//null
		//part2:正确的 操作
		//创建了一个Student类型的对象stu;
		Student stu = new Student();
		System.out.println(stu);//Student@15db9742
		
		stu.name = "小叶";//给stu的静态属性赋值   .name  .age
		stu.age = 20;
		
		System.out.println(stu.name+"---"+stu.age);
		
		Student stu1 = new Student();//new一个Student类型的对象stu1
		stu1.name="oo";
		stu1.age = 20;
		stu1.add(2, 1);
		System.out.println(stu1.name+"---"+stu1.age);
		
	}

}
