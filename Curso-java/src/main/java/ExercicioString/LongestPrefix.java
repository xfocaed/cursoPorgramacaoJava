package ExercicioString;

public class LongestPrefix {
	package ExercicioB;

	public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] s)
	{
	     String reference = lowerString(s);
	    
	     char[] prefix = new char[reference.length()];
	    char[] ref = reference.toCharArray();

	     for(int i=0; i < s.length; i++)
	     {
	         char[] aux = s[i].toCharArray();
	       
	        int k=0;
	         for (int j=0; j < ref.length; j++)
	         {
	             if (aux[j]==ref[j])
	                 prefix[k] = aux[j];
	              else {
	                   prefix[k]='\0';
	                 ref = prefix;
	                 break;
	             }
	             k++;
	         }
	     }
	     int k = 0;
	     char[] formattedPrefix = new char[prefix.length];
	     while(prefix[k]!='\0') {
	         formattedPrefix[k]= prefix[k];
	         k++;
	     }
	    
	     String result = new String(formattedPrefix);
	     //if(result.equals(reference)) return "Nao existe";
	     return result;
	}

	public static String lowerString(String[] s1)
	{
	    String lower;
	   
	    lower = s1[0];
	   
	    for (int i=0; i < s1.length; i++)
	    {
	        if(lower.length() > s1[i].length())
	        {
	            lower = s1[i];
	        }
	    }
	    return lower;
	}

	}

	package ExercicioB;

	public class TestLongest {

	   
	    public static void main(String[] args) {
	       
	        LongestCommonPrefix lcp = new LongestCommonPrefix();
	       
	        String[] teste = {"casa","casinha","casei","casebre","casta"};
	        String[] teste1 = {"joao","joana","jaco"};
	        String[] teste2 = {"casa","foguete","escada","revolver"};
	        String[] teste3 = {"maria","mariana","mario","marisa","marita"};
	       
	        String resultado = lcp.longestCommonPrefix(teste3);
	       
	        System.out.println(resultado);
	    }
	}
}
