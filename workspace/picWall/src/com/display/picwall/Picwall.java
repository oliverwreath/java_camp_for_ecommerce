package com.display.picwall;

import java.io.File;
import java.io.FileInputStream;

public class Picwall {
	private String dir = "L:\\Users\\hunter\\workspace\\picWall\\img";
	
	public void Display(String dir){ 
		try{
			File file = new File(dir);
			FileInputStream fi = new FileInputStream(file);
			String [] fileList = file.list();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
