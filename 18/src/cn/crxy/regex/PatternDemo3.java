package cn.crxy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo3 {


	public static void main(String[] args) {
		// Pattern:����ʵ��		Matcher�������������
		
		//��д���򲢱����Patternʵ��
		Pattern pt = Pattern.compile("[0-9]{5,10}");
		
		//��������ʵ����ȡ��������
		Matcher m = pt.matcher("23QQ1123QQ:46984056QQ:46984yy056QQ:46984056");
		
		
		//��������������ʹ�ò���
		
		//1.�������ַ����н���ƥ��
		//boolean r = m.matches();
		
		//2.���ַ�����ͷ��ʼƥ�䣬û����ȫƥ�����У���ֻ�ӿ�ʼλ��ƥ��
//		boolean r = m.lookingAt();
		
		//3.find() ��������ʼ��ͷ��ʼƥ�䣬���ظ�findƥ�䣬��һ�ε�ƥ���Ǵ���һ�ν�β��ʼ
//		boolean r = m.find();
		
		while (m.find()){
			//������Ϣ��ȡ
			int start = m.start();
			int end = m.end();
			String group = m.group();
			
			
			System.out.println(start+"-------"+end+"-----"+group);
		}
		
		

		
	}

}
