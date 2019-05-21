package com.codeclan.example;

import com.codeclan.example.models.File;
import com.codeclan.example.repositories.FileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilesandfoldersApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test // NEW
	public void createFile(){
		File file1 = new File(".rb", 25);
		fileRepository.save(file1);
	}

}
