/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 *Java Program to Copy Strings from one file to another file.
 */
import java.io.*;  
import java.util.*;  
public class program55 {
    public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("Provide source file name :");  
  String sfile = sc.next();  
  System.out.print("Provide destination file name :");  
  String dfile = sc.next();  
  FileReader fin = new FileReader(sfile);  
  FileWriter fout = new FileWriter(dfile, true);  
  int c;  
  while ((c = fin.read()) != -1) {  
   fout.write(c);  
  }  
  System.out.println("Copy finish...");  
  fin.close();  
  fout.close();  
 }  
}   
    

