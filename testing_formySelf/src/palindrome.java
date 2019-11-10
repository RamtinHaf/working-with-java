import java.util.Scanner;

public class palindrome{
    static String t;
    static String s;
    static String ordet;
    public static String check_word_polindrome() {
        String reverse_ord = "";
        
        for(int i = ordet.length() - 1; i >= 0; i--)
        {
            reverse_ord = reverse_ord + ordet.charAt(i);
            
        }
        System.out.println(reverse_ord);
        System.out.println("Comparing (" + reverse_ord+ " and " + ordet + "): " + reverse_ord.equals(ordet));
        return "Now to the menu again.";
          }

    public static String check_sentence_polindrome(){
        //String trimma_ordet = ordet;
        String reverse_trimma_ordet = "";
        String ordet_men_trimma="";
      
      
        for(int i = ordet.length() - 1; i >= 0; i--)
        {
            reverse_trimma_ordet = reverse_trimma_ordet.trim() + ordet.charAt(i);
        }
              
       
        ordet_men_trimma =ordet.replaceAll("\\s","");
        
        
        System.out.println(ordet_men_trimma);
        System.out.println("Comparing (" + ordet + " AND " + reverse_trimma_ordet + "): " + ordet_men_trimma.equals(reverse_trimma_ordet));
        return "Now to the menu again.";
        

    }
        
    public static void main(String[] args) {
        String navn;
        int valg;
        System.out.println("Welcome to Palindrome check program");
        System.out.println("Enter your name: ");
        Scanner a = new Scanner(System.in);
        navn = a.nextLine();
        while (true){
            System.out.println("__________________");
            System.out.println("Hi, " + navn);
            System.out.println("What dou you want to do?");
            System.out.println("1. Check if a WORD is polindrome or nah.");
            System.out.println("2. Check if a SENTENCE is polindrome or nah.");
            Scanner b = new Scanner(System.in);
            valg = b.nextInt();

            if (valg == 1 ){
                System.out.println("What is the WORD you want to check?: ");
                Scanner ord = new Scanner(System.in);
                ordet = ord.nextLine();
                check_word_polindrome();

            }
            if (valg == 2 ){
                System.out.println("What is the SENTENCE you want to check?: ");
                Scanner ord1 = new Scanner(System.in);
                ordet = ord1.nextLine();
                check_sentence_polindrome();

            }

        }
        
    }
}