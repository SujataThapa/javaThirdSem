import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo{
	public static void main(String[] aregs){
		try{
	FileWriter pw= new FileWriter("test.txt");
pw.write("Hello World");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			pw.close();
}
}
}
