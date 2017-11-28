package files.simple;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FileTree  {
	
	int size;
	ArrayList<File> fileList = new ArrayList<File>();
	
	//File[] f = new File("/Users/johanna/Desktop/Informationsverarbeitung/FileDirectoryTesting/").listFiles();
	
	public void showFiles(File directory){
		
		File[] arrayFile = directory.listFiles();
		showAllFiles(arrayFile);
	}
	
	private void showAllFiles(File[] currentFiles) {
		
		 for (File file : currentFiles) {
		 if (file.isDirectory()) {
	            System.out.println("Dateiverzeichnis:" + file.getName());
	            size++;
	            showAllFiles(file.listFiles()); 
	        } else {
	            System.out.println("Datei: " + file.getName());
	            size++;
	        }
		 }
	}
	
	public int size(){
		return size;
	}
	
	public List<File> getFiles(File directory){
		
		File[] arrayFile = directory.listFiles();
		List<File> f = getAllFiles(arrayFile);
		
		return f;
	}
	
	private List<File> getAllFiles(File[] currentFiles){
		 for (File file : currentFiles) {
			 if (file.isDirectory()) {
		          
		            getAllFiles(file.listFiles()); 
		        } else {
		        	 
//		        	 System.out.println("Datei: " + file.getName());
		        	fileList.add(file);
		        }
			 }
		
		
		return fileList;
		
	}
	

	
}
