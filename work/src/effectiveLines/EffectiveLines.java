package effectiveLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EffectiveLines {
    static int effectiveLines;
    static int whiteLines;
    static int commentLines;
	public static void main(String[] args) throws IOException {
		EffectiveLines.readLines(new File("D:\\eclipse\\pokerGame\\src\\pokerGame\\Game.java"));
        System.out.println("��Ч��:"+effectiveLines);
        //System.out.println("�հ���:"+whiteLines);
       // System.out.println("ע����:"+commentLines);
	}
	
	public static void readLines(File file) throws IOException{
		if(!file.exists()){
			throw new IllegalArgumentException("Ŀ¼"+file+"�����ڣ�");
		}
		if(!file.isFile()){
			throw new IllegalArgumentException(file+"�����ļ�");
		}else{
			try {
				FileInputStream in = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(in);
				BufferedReader br = new BufferedReader(isr);
				String line;
				while((line=br.readLine())!=null){
					countEffectiveLines(line);
				}
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
			} 
		}
	
	public static void countEffectiveLines(String line){

//		if(line.matches("^\\s*")){
//			whiteLines++;
//		}else if(line.matches("\\s*//.*")){
//	    	commentLines++;
//	    }else if(line.matches("\\s*/\\*{1,}.*\\*/$")){
//	    	commentLines++;
//	    }
//		else{
//	    	effectiveLines++;
//	    }
		if(!(line.matches("^\\s*")||line.matches("\\s*//.*")||line.matches("\\s*/\\*{1,}.*\\*/$"))){
			effectiveLines++;
		}
	
	}
	}
    
	

