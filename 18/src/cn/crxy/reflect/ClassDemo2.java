package cn.crxy.reflect;

import java.lang.reflect.Constructor;

public class ClassDemo2 {

	public static void main(String[] args) throws Exception {
		//��ȡclass���󡣿�ʼ����
		
		//����һ�����ݶ���̬����ʵ���Ĵ���
		Class c1 = Class.forName("cn.crxy.reflect.Student");
		
		//class�����ṩ�˺��������԰���ʹ��student����Ĭ�Ϲ���
//		Object o1 = c1.newInstance();
//		Student s1=(Student)o1;
//		System.out.println();

		//���ι���.1.��ȡ���ι��첢���ݲ�����class����.�ѹ����ȡ��co2
		Constructor co2 = c1.getConstructor(String.class,int.class);
		
		//co2��ִ̬�д���
		Object o1 = co2.newInstance("zhangsan",10);
		System.out.println(o1);
	}

}
