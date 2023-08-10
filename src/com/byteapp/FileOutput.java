package com.byteapp;


import java.io.*;

public class FileOutput {
	public static void main(String[] args)
	{
		InputStream in=System.in;
		try
		{
			byte[] bt=new byte[20];
			FileOutputStream fs=new FileOutputStream("buginfo.dat.txt");
			
			System.out.print("Enter Developer name:\t");
			in.read(bt);
			String str=new String(bt);
			
			fs.write(str.getBytes());
			
			byte[] bt1=new byte[20];
			System.out.print("Enter Bug no:");
			in.read(bt1);
			String num=new String(bt1);
			fs.write(num.getBytes());
			
			byte[] bt2=new byte[20];
			System.out.print("Enter Bug Description:");
			in.read(bt2);
			String desc=new String(bt2);
			fs.write(desc.getBytes());
			
			fs.flush();
			fs.close();
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}

