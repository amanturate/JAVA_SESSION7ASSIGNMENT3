
public class AssignmentThree {
	
	public static boolean AssignmentThree(String mainString,String subString){
	    boolean check = false;
	    if(mainString == null && mainString.trim().equals("")){
	        return check;
	    }
	    if(subString == null){
	        return check;
	    }

	    char string[] = mainString.toCharArray();
	    char sub[] = subString.toCharArray();
	    int count=0;
	    if(sub.length == 0){
	        check = true;
	        return check;
	    }

	    for(int i=0; i<string.length; i++){

	        if(string[i] == sub[count]){
	            count++;
	        }else{
	        	 if(count > 0){ i -= count; }
	            count=0;
	        }

	        if(count == sub.length){
	        check=true;
	        return check;

	        }

	    }
	    return check;

	}

}
