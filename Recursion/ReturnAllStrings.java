package Recursion;

private static void printCodes(String str, String ans) {
    if (str.length() == 0) {
        System.out.println(ans);
        return;
    }

    char ch1 = str.charAt(0);
    char code = (char) (ch1 - '1' + 'a');
    printCodes(str.substring(1), ans + code);

    if (str.length() >= 2 && ch1 <= '2') {
        int i = Integer.parseInt(str.substring(0, 2), 10);
        if (i > 0 && i <= 26) {
            code = (char) (i + 'a' - 1);
            printCodes(str.substring(2), ans + code);
        }
    
}

public class ReturnAllStrings {
	
	String str = "1123" ;
	String ans = "" ;
	printCodes( str, ans) ;
}
