import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
   public static void main(String[] args) throws Exception{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   char s = br.readLine().charAt(0);
	  
	   int num = s;
	   
	   System.out.println(num);
	   
   }
}