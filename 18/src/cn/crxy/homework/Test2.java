package cn.crxy.homework;

public class Test2 {

	public static void main(String[] args) {
		//2.���֤��15-18λ(���֡���ĸx��β)�����д.
		
		String str="12345619900101765X";
		
		String reg ="\\d{6}[12]\\d{10}([0-9]|X)";
		
		boolean m = str.matches(reg);
		
		System.out.println(m);

	}

}
