package fst_m1_java;



import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;


public class Activity14 {
	
	public static void main(String args[]) throws IOException{
	
	try {
	File file = new File("src/main/java/fst_m1_java/newtextfile.txt");
	boolean fStatus = file.createNewFile();
	
	if (fStatus==true)
	{
		System.out.println("File is created");
	}
	else {
		System.out.println("File is not created");
	}
	
	
	File fileUtil = FileUtils.getFile("src/main/java/fst_m1_java/newtextfile.txt");
	
	System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
	
	File destDir = new File("src/main/resources");
	
	FileUtils.copyFileToDirectory(file, destDir);
	//File file2 = new File("src/main/java/fst_m1_java/newfile.txt");
	
	File newFile = FileUtils.getFile(destDir, "newdatafile1.txt");
    
    String newFileData = FileUtils.readFileToString(newFile, "UTF8");
   
    System.out.println("Data in new file: " + newFileData);
    } catch(IOException errMessage) {
    	
    System.out.println(errMessage);
}
	
	
	}

}
