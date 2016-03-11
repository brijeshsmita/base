/**
 * 
 */
package com.cg.loop;

/**
 * @author Brijesh
 *
 */
public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String searchMe = "Look for a java substring in me";
        String substring = "java";
        boolean foundIt = false;
       
        int max = searchMe.length() - substring.length(); 
   test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i; int k = 0;
            while (n-- != 0) {
           if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }//eoif
            }    //eofw
            foundIt = true;
            break test;
        }//eof
   System.out.println(foundIt ? "Found it" : "Didn't find it");
    }//eofm
}//eoc0
