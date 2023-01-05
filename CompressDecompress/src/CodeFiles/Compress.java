/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFiles;

import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author dewashish painkra
 */
public class Compress {
    // method function
    public static void method(File file) throws FileNotFoundException, IOException{
        String fileDirectory=file.getParent();         // C:\\Users\\dewashish painkra\\Documents\\17079 as string
        System.out.println(fileDirectory);
        FileInputStream fis=new FileInputStream(file); // 
        FileOutputStream fos = new FileOutputStream(fileDirectory+"\\Compressedfile.gz");
         //System.out.println(fileDirectory + "\\Compressedfile.gz");
        GZIPOutputStream gzipOS=new GZIPOutputStream(fos);
        
        byte [] buffer=new byte[2048];
        int len;
        
        while((len=fis.read(buffer))!=-1)      // fis(input file stream) to buffer in 1024 byte of chunks
        {
            gzipOS.write(buffer,0,len);
        }
        fis.close();
        gzipOS.close();
        fos.close();
        //gzipOS.close();
        System.out.println("Compress completed");
        
       
       // fos 
        
    }
    
    // main function
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File path=new File("C:\\Users\\dewashish painkra\\Documents\\17079\\test.txt");
        method(path);
    }
    
    
}

