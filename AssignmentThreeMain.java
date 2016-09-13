import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AssignmentThreeMain extends AssignmentThree {

	public static void main(String[] args) throws IOException {
		boolean status;
		
		AssignmentThree at = new AssignmentThree();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String EnteredString, StringToMatch;
		
		System.out.println("Enetr a String :");
		EnteredString = br.readLine();
		
		System.out.println("Enter the substring to be searched :");
		StringToMatch = br.readLine();
		status = at.AssignmentThree(EnteredString, StringToMatch);
		
		if(status){
			System.out.println("String found");
		}
		else{
			System.out.println("not found");
		}
		
	}
	

}
