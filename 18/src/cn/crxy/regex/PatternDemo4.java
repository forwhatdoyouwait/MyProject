package cn.crxy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo4 {

	public static void main(String[] args) {
		// 
		
		//创建正则实例		tel：1[3578][0-9]{9}		email:\\w+@\\w+(\\.com){1}(\\.cn)?
		Pattern p = Pattern.compile("user:tel:(1[3578][0-9]{9}),(email:\\w+@\\w+(\\.com){1}(\\.cn)?)");

		// 创建正则操作引擎
		String m ="user:tel:15577778888,email:zhangsan@qq.comuser:tel:17577776666,email:lisi@qq.comuser:tel:15577779999,email:wangwu@qq.com";
		Matcher matcher = p.matcher(m);
		
		// 开始操作
		while (matcher.find()) {
			
			String tel = matcher.group(1);
			String email = matcher.group(2);

			System.out.println(tel + "======"+email);
			
		}

	}

}
