package com.zhanggm.common.utils.test;

import org.junit.Test;

import com.zhanggm.common.utils.Md5Util;

public class Md5Tests {
	@Test
	public void test() {
		// 测试主函数  
        String s = new String("tangfuqiang");
        System.out.println("原始：" + s);  
        System.out.println("MD5后：" + Md5Util.string2MD5(s));  
        System.out.println("加密的：" + Md5Util.convertMD5(s));  
        System.out.println("解密的：" + Md5Util.convertMD5(Md5Util.convertMD5(s)));  
	  
	}
}
