package eLuoSiFangKuai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class List {
	private int score;
	private int line;
	private String name;
	
	public List(int score,int line,String name) {
		this.score = score;
		this.line = line;
		this.name = name;
	}
	
	public int getscore() {
		return this.score;
	}
	public void setscore(int score) {
		this.score=score;
	}
	public int getline() {
		return this.line;
	}
	public void setline(int line) {
		this.line = line;
	}
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void iswrite() {
		 File file = new File("write.txt");  
	        BufferedReader reader = null;  
	        try {  
	            System.out.println("以行为单位读取文件内容，一次读一整行：");  
	            reader = new BufferedReader(new FileReader(file));  
	            String tempString = null;  
	            int line = 1;  
	            // 一次读入一行，直到读入null为文件结束  
	            while ((tempString = reader.readLine()) != null) {  
	                // 显示行号  
	                System.out.println("line " + line + ": " + tempString);  
	                line++;  
	            }  
	            reader.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        } finally {  
	            if (reader != null) {  
	                try {  
	                    reader.close();  
	                } catch (IOException e1) {  
	                }  
	            }  
	        }  
	}
}
