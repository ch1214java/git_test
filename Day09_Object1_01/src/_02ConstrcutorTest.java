
public class _02ConstrcutorTest {
	/***
	 * 1.什么是构造方法：（对比普通方法认识）
	 * 		1.都是存在于类的结构体中
	 * 		2.构造方法也是可以有修饰符的public；
	 * 		3.构造方法没有返回值的位置
	 * 		4.构造方法的名字与类名一致
	 * 		5.构造方法也可以有形式参数
	 * 2.构造方法的作用:
	 * 		目前：通过 new 类名（参数......）
	 * 3.构造方法的作用：
	 * 		创建对象 --------等于是复印了一份；
	 * 		创建对象--------初始化对象
	 * 4.构造方法的特点：
	 * 		1.构造方法默认存在一个隐式的无参数的构造方法
	 * 		2.构造方法显示的写出来了，默认影藏的就不存在了；
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu1 = new Student();
		//1.通过new关键字调用无参数的构造方法，创建了一个Student类型的对象
		Student stu2 = new Student();
		//2.给对象的name字段，和age字段，赋值【第一次赋值，初始化值】
		stu2.name = "小芳";
		stu2.age = 19;
		
		
		//穿件对象的同时初始化值
		Student stu3 = new Student("小小",20);
		System.out.println(stu3.name+"   "+stu3.age);
		
	}

}
