
public class _05AutoAdd {

	/***
	 * 自增 ++  ----------用于变量运算
	 * 自减--  ----------用于变量运算
	 * @param args
	 */
	public static void main(String[] args) {
		//1.最常用的
		int i = 10;
		i++;//原来基础上+1
		System.out.println("第一次++："+i);//11
		
		i++;//原来基础上+1
		System.out.println("第二次++："+i);//12
		
		
		++i;
		System.out.println("第三次++："+i);//13
		
		//++ 在右边，先赋值在++
		//++ 在左边，先++在赋值
		int j = i++;
		System.out.println("j的值："+j);//13
		System.out.println("i的值："+i);//14
		
		
		int k = ++i;
		System.out.println("K的值："+k);//15
		System.out.println("i的值："+i);//1
		i = i++;
		System.out.println("i = i++的值："+i);//15
		i = ++i;
		System.out.println("i = ++i的值："+i);//16
		
		//-- 在右边，先赋值在--
		//-- 在左边，先--在赋值
		int j1 = i--;
		System.out.println("j1的值："+j1);//15
		System.out.println("i的值："+i);//14
		
		
		int k1 = --i;
		System.out.println("K1的值："+k1);//12
		System.out.println("i的值："+i);//12	
	}
}
