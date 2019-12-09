package com.zhanggm.common.utils.test;

import java.util.List;

import org.junit.Test;

import com.zhanggm.common.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void test() {
		List<String> readTextFileOfList = FileUtil.readTextFileOfList("C:\\Users\\Administrator\\Desktop\\pom.xml");
		System.out.println(readTextFileOfList);
	}
}
