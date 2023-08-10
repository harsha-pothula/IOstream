package com.byteapp;


import java.io.*;

public class ReadStream {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("buginfo.dat.txt");
			byte[] bt=new byte[fin.available()];
			fin.read(bt);
			for(byte b:bt) {
				System.out.print((char)b);
			}
		}
		catch(Exception e)
		{
		}
		}
}

