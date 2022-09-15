package file;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.String;

/*
 * 1. FileOutputStream
 * - La 1 output stream duoc su dung de ghi data vao 1 file theo dinh dang byte
 * - Su dung khi phai ghi cac value nguyen thuy vao 1 file 
 * - Cac method: 
 * + flush(): Xa nhung gi duoc luu trong bo dem
 * + getChannel(): tra lai doi tuong file channel
 * + ...
 * 
 * 2. FileInputStream
 * - Doc duoc cac byte tu 1 file, doc data theo dinh dang byte
 * - Cac method:
 * + available(): tra ve so byte co the doc duoc tu file 
 * + get channel(): tra ve cac doi tuong file channel duy nhat
 * + getFD(): tra ve doi tuong file descriptor
 * + skip(long n): su dung de bo qua va loai bo n byte du lieu tu file
 * + ... 
 */

public class FileOutput_InputStream {
	public void FileOutputStream() throws IOException {
		FileOutputStream fout = null;
		try {
			System.out.println("Ghi file:");
			fout = new FileOutputStream("D:\\TestFile.txt");
	
			System.out.println(fout.getChannel());
			System.out.println(fout.getFD().toString());
	        
			String s = "Hello. ";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.write(b, 2, 4);
			
			System.out.println("Hello !");
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fout.close();
		}
	}
	
	public void FileInputStream() throws IOException {
		FileInputStream fin = null;
		System.out.print("\nDoc file:");
		try {
			fin = new FileInputStream("D:\\TestFile.txt");
			System.out.println("\n" + "So byte co trong file: " + fin.available());
			
			
			String s = new String(fin.readNBytes(5));
			System.out.println("ReadNBytes: " + s);
			
			System.out.print("Read File: ");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			
			System.out.print("\n");
			byte b[] = new byte[11];
			i = fin.read(b);
			System.out.println("Doc so b.lengh byte: " + i);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			fin.close();
		}		
	}

	public static void main(String[] args) throws IOException {
		FileOutput_InputStream f = new FileOutput_InputStream();
		f.FileOutputStream();
		f.FileInputStream();
 	}
}