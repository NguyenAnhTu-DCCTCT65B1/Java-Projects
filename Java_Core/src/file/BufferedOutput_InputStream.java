package file;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * 1. BufferedOutputStream
 * - Su dung de dem 1 output stream
 * - Su dung bo dem de luu tru data
 * => Giup hieu suat ghi du lieu nhanh
 * 
 * NOTE: flush() method xa du lieu cua 1 stream va gui no vao 1 stream khac. 
 *       No duoc yeu cau su dung khi da ket noi 1 stream voi 1 stream khac.
 *       
 * 2. BufferedInputStream
 * - Su dung co che dem => hieu suat doc nhanh hon
 */

// 1. Annotation
// 2. Generics
// 3. Lambda funtion / Anonymous function

public class BufferedOutput_InputStream {
	
	public void BufferedOutputStream() throws IOException {
		
		FileOutputStream fout = null;
		BufferedOutputStream bout = null;
		System.out.println("Ghi file:");
		try {
			fout = new FileOutputStream("D:\\TestBuffered.txt");
			bout = new BufferedOutputStream(fout);
			
			String s = "Welcome to java. ";
			byte b[] = s.getBytes();
			bout.write(b);
			bout.write(b, 2, 5);
			
			String x = "\nWelcome to java. ";
			byte c[] = x.getBytes();
			bout.write(c);
			bout.write(c, 4, 14);

			System.out.println("2 gia tri String co giong nhau ? " + s.equals(x));
		} catch (Exception e) {
			e.addSuppressed(e);
		} finally {
			bout.close();
			fout.close();
		}
		System.out.println("Hello...");
	}
	
	public void BufferedInputStream() {
		FileInputStream fin = null;
	    BufferedInputStream bin = null;
	    System.out.println("\nDoc file:");
	    try {
	    	fin = new FileInputStream("D:\\TestBuffered.txt");
	        bin = new BufferedInputStream(fin);	
	        String s = new String(bin.readAllBytes());
			System.out.println("ReadNBytes: " + s);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedOutput_InputStream bi = new BufferedOutput_InputStream();
		bi.BufferedOutputStream();
		bi.BufferedInputStream();
 	}
}