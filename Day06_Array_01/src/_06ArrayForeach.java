
public class _06ArrayForeach {
	
	

	/***
	 * 遍历数组：增强for循环
	 * for(数据源的数据类型 变量:数据源){
			System.out.println(e);//通过变量取值
		}
		数据源:数组    集合（Iterable实现）
		1.优点：简单
		2.缺点：没有索引；
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明数组
		int[] num = {1,2,3,4,5};
		for(int e:num){
			System.out.println(e);
		}
		String[] name = {"陈洪","方文达","陈启明","汪锐琪","陈伟","李明奇","刘勇国","吕焜","潘希孝","孙奥","唐学名","叶洋","周博文","陈智新","高源","浦勇江","闫欣悦","阙健强"};
		for(int i = 0;i<name.length;i++){
			System.out.println(name[i]);
		}
		for(int i = 0;i<=name.length-1;i++){
			System.out.println(name[i]);
		}
		for(String e:name){
			System.out.println(e);
		}
	}

}
