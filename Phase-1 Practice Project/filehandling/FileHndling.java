package filehandling;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.*;
public class FileHndling {
	
	public void Create()
	{
		try {
			File obj= new File ("myfile.txt");
			if(obj.createNewFile()) {
				System.out.println("FIle is Created!" +obj.getName());
			}
			else {
				System.out.println("File already exist");
			}
		}
		catch(IOException e) {
			System.out.println("Exception has Occured");
			e.printStackTrace();
		}
	
	}
	
	
	public void Write()
	{
		try {
			FileWriter Writer=new FileWriter("myfile.txt");
			Writer.write("File is Ready to Roll!");
			Writer.close();
			System.out.println("Successfully Written");
		}
		catch(IOException e) {
			System.out.println("Exception has Occured");
			e.printStackTrace();
		
		}
	}
	
	public void Read()
	{
		try {
		File obj=new File ("myfile.txt");
		Scanner Sc=new Scanner(obj);
		while(Sc.hasNextLine()) {
			String data=Sc.nextLine();
			System.out.println(data);
		}
		Sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception has Occured");
			e.printStackTrace();
		}
		
	}
	public void Append()
	{
		try {
			File file=new File("myfile.txt");
			FileWriter fr=new FileWriter(file,true);
			BufferedWriter br=new BufferedWriter(fr);
			br.write(" And Rock");
			br.close();
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("Error has occured");
			e.printStackTrace();
		}
	}
	public void Read1()
	{
		try {
		File obj=new File ("myfile.txt");
		Scanner Sc=new Scanner(obj);
		while(Sc.hasNextLine()) {
			String data=Sc.nextLine();
			System.out.println(data);
		}
		Sc.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Exception has Occured");
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		FileHndling obj= new FileHndling();
		obj.Create();
		obj.Write();
		obj.Read();
		obj.Append();
		obj.Read1();
		
	}

}
