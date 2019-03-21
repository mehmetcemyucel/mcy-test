package com.mcy.rules;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderTest {

	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Before
	public void setUp() throws Exception {
//		create folder vs vs sonrasinda after'da temizlicen de breh breh
	}

	@Test
	public void test() throws IOException {
		File file = folder.newFile("deneme.txt");
		assertThat(file).isFile();
	}

}
