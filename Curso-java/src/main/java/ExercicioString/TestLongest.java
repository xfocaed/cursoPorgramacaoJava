package ExercicioString;

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