package file;

import java.util.Enumeration;
import java.io.SequenceInputStream;
import java.util.Vector;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * - Duoc su dung de doc du lieu tu nhieu stream
 * - Duoc doc du lieu tuan tu
 */

public class SequenceInput_Stream {
    
	public void SequenceInputStream() throws IOException {
		FileInputStream fin1 = new FileInputStream("D:\\TestFile.txt");
        FileInputStream fin2 = new FileInputStream("D:\\TestBuffered.txt");
        FileOutputStream fout = new FileOutputStream("D:\\TestSequence.txt");
        SequenceInputStream s = new SequenceInputStream(fin1, fin2);
        
        int i;
        while ((i = s.read()) != -1) {
            fout.write(i);
        }
        
        s.close();
        fout.close();
        fin1.close();
        fin2.close();
        System.out.println("Doc file thanh cong...");
	}
	
	public void Sequence() throws IOException {
		// Tao cac object cua FileInputStream cho tat ca cac file
		FileInputStream fin1 = new FileInputStream("D:\\TestFile.txt");
        FileInputStream fin2 = new FileInputStream("D:\\TestBuffered.txt");
        FileInputStream fin3 = new FileInputStream("D:\\TestSequence.txt");
        
        // Tao object cua vector de luu cac stream
        Vector<FileInputStream> v = new Vector<FileInputStream>();
        v.add(fin1);
        v.add(fin2);
        v.add(fin3);
        
        // Tao object cua Enumeration bang cach goi elements method
        Enumeration<FileInputStream> e = v.elements();
        
        // Truyen object Enumeration toi constructor
        SequenceInputStream s = new SequenceInputStream(e);
        
        int i = 0;
        while ((i = s.read()) != -1) {
            System.out.print((char) i);
        }
        
        s.close();
        fin1.close();
        fin2.close();
        fin3.close();
	}
	
	public static void main(String[] args) throws IOException {
		SequenceInput_Stream se = new SequenceInput_Stream();
		se.SequenceInputStream();
		se.Sequence();
	}
} 