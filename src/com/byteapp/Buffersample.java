package com.byteapp;


import java.io.*;

public class Buffersample {
	public static void main(String[] args) {
		//InputStream in=System.in;
		try {
			FileOutputStream fstream=new FileOutputStream("bufferdata.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fstream);
			bout.write("Developer Name: Shravani\n".getBytes());
			bout.write("Bug No : 20\n".getBytes());
			bout.write("Bug Description : FileNotFounException".getBytes());

			bout.flush();
			bout.close();
			
			FileInputStream fin=new FileInputStream("bufferdata.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			byte[] btt=new byte[bin.available()];
			bin.read(btt);
			System.out.println(new String(btt));
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}

}

