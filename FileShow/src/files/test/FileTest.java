package files.test;

import java.io.File;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import files.simple.FileTree;
import files.simple.StringLengthComparator;


public class FileTest {
	
	private FileTree fileTree;
	File f = new File("/Users/johanna/Desktop/Informationsverarbeitung/FileDirectoryTesting/");
	
	@Before
	public void setup(){
		fileTree = new FileTree();
		//File f = new File("/Users/johanna/Desktop/Informationsverarbeitung/FileDirectoryTesting/");
		fileTree.showFiles(f);
		System.out.println("--------");
	}

	@Test
	public void showFiles(){
		Assert.assertNotNull(fileTree);
		Assert.assertEquals(7, fileTree.size());
	}
	
	@Test
	public void getFiles(){
		List<File> listOfFiles = fileTree.getFiles(f);
		Assert.assertNotNull(listOfFiles);
		Assert.assertEquals(4, listOfFiles.size());
	}
	
	@Test
	public void compare(){
		List<File> listOfFiles = fileTree.getFiles(f);
		Assert.assertNotNull(listOfFiles);
		Collections.sort(listOfFiles, new StringLengthComparator());
		Assert.assertNotNull(listOfFiles);
		Assert.assertEquals(4, listOfFiles.size());
		Assert.assertEquals(new String("huhu"), listOfFiles.get(0).getName());
		Assert.assertEquals(new String("huhuhuhuhuhu"), listOfFiles.get(3).getName());
	}
	
	
}
