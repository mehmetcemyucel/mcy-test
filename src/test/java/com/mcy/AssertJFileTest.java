package com.mcy;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.contentOf;

import java.io.File;

import org.junit.Test;

public class AssertJFileTest {


	@Test
	public void test() {
		File file = new File(getClass().getClassLoader().getResource("test.txt").getFile());
		assertThat(file).canRead().canWrite().hasExtension("txt").hasName("test.txt");
		
		assertThat(contentOf(file)).startsWith("deneme");
	}

}
