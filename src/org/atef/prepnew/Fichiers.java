package org.atef.prepnew;

import java.io.File;

public class Fichiers {
	static int nbrFiles = 0;
	static int nbrDirectories = 0;
	public static void main(String[] args) {
		itererRepertoire(new File("C:\\JAVA\\cours"));
	}
	public static void itererRepertoire(File dir) {   
		
        if (dir.isDirectory()){
        	System.err.println(dir.getPath());
        	nbrDirectories++;
           File[] subDirs = dir.listFiles();
           if (subDirs != null) {
           
	           for (int i=0; i<subDirs.length; i++){
	              File subDir = subDirs[i];
	              itererRepertoire(subDir);
	           }
           }
          
        } 
        else {
        	nbrFiles++;
        	System.out.println(dir);
        }
	}


}
