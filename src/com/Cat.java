package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cat {
  public static void main(String[] args) throws IOException {
	System.out.println("you  are cat");
	System.out.println("ss");
	FileOutputStream  fos=new  FileOutputStream("xx.txt");
	System.out.println("you  are cat");
	
	fos.write("97".getBytes());
	fos.close();
}
}
