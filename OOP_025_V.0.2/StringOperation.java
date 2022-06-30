package stringmethod;

/**
 *
 * @author MD.Humayun Kabir
 */
public class StringOperation {

    public void charAt(String str) {
        System.out.println("\t\t\t1.charAt()");
        System.out.println("Returns character at given index\nFor example char at 5 in str is : " + str.charAt(5));
        System.out.println("============================================");
    }

    public void codePointAt(String str) {
        System.out.println("\t\t\t2.codePointAt()");
        System.out.println("Returns unicode of char at given index\nFor example unicode at 5 in str is : " + str.codePointAt(5));
        System.out.println("============================================");
    }

    public void codePointBefore(String str) {
        System.out.println("\t\t\t3.codePointBefore()");
        System.out.println("Returns unicode of char before at given index\nFor example unicode before at 5 in str is : " + str.codePointBefore(5));
        System.out.println("============================================");
    }

    public void codePointCount(String str) {
        System.out.println("\t\t\t4.codePointCout()");
        System.out.println("Returns the number of unicode values in string\nFor example number of unicode values of str : " + str.codePointCount(0, str.length() - 1));
        System.out.println("============================================");
    }

    public void compareTo(String str, String txt) {
        System.out.println("\t\t\t5.compareTo()");
        System.out.println("Compares two strings lexicographically\nFor example compare str with txt : " + str.compareTo(txt));
        System.out.println("============================================");
    }

    public void compareToIgnoreCase(String str, String txt) {
        System.out.println("\t\t\t6.compareToIgnoreCase()");
        System.out.println("Compares two strings lexicographically ignore case difference\nFor example compare str with txt : " + str.compareToIgnoreCase(txt));
        System.out.println("============================================");
    }

    public void concat(String str, String txt) {
        System.out.println("\t\t\t7.concat()");
        System.out.println("Appends a string to the end of another string\nFor example concat str and txt : " + str.concat(txt));
        System.out.println("============================================");
    }

    public void contains(String str) {
        System.out.println("\t\t\t8.contains()");
        System.out.println("Check whether a string contain a sequence of char\nFor example check is str contain 'no': " + str.contains("no"));
        System.out.println("============================================");
    }

    public void contentEquals(String str, String txt) {
        System.out.println("\t\t\t9.contentEquals()");
        System.out.println("Check two string equality\nFor example check is str and txt are equals?: " + str.contentEquals(txt));
        System.out.println("============================================");
    }

    public void endsWith(String str) {
        System.out.println("\t\t\t10.endsWith()");
        System.out.println("Check is a string ends with specified characters \nFor example check is str endswith 'no': " + str.endsWith("reward"));
        System.out.println("============================================");
    }

    public void equals(String str, String txt) {
        System.out.println("\t\t\t11.equals()");
        System.out.println("Check two string are equal or not\nFor example check str and txt are equal?: " + str.equals(txt));
        System.out.println("============================================");
    }

    public void equalsIgnoreCase(String str, String txt) {
        System.out.println("\t\t\t12.equalsIgnoreCase()");
        System.out.println("Check two string are equal or not ignorecase\nFor example check str and txt are equal?: " + str.equalsIgnoreCase(txt));
        System.out.println("============================================");
    }

    public void hashCode(String str) {
        System.out.println("\t\t\t13.hashCode()");
        System.out.println("Returns the hash code of a string\nFor example check hascode in str: " + str.hashCode());
        System.out.println("============================================");
    }

    public void indexOf(String str) {
        System.out.println("\t\t\t14.indexOf()");
        System.out.println("Returns the position of first matching char\nFor example find char at reward: " + str.indexOf("no"));
        System.out.println("============================================");
    }

    public void lastIndexOf(String str) {
        System.out.println("\t\t\t15.lastIndexOf()");
        System.out.println("Returns the last matching char position\nFor example check hascode in str:" + str.lastIndexOf("no"));
        System.out.println("============================================");
    }

    public void isEmpty(String str) {
        System.out.println("\t\t\t16.isEmpty()");
        System.out.println("Check whether a string is empty or not\nFor example check str: " + str.isEmpty());
        System.out.println("============================================");
    }

    public void length(String str) {
        System.out.println("\t\t\t17.length()");
        System.out.println("Returns the length of a string\nFor example length of str: " + str.length());
        System.out.println("============================================");
    }

    public void replace(String str) {
        System.out.println("\t\t\t18.replace()");
        System.out.println("Replace the matches in a string \nFor example replace reward to gain in str: " + str.replace("reward", "gain"));
        System.out.println("============================================");
    }

    public void startsWith(String str) {
        System.out.println("\t\t\t19.startsWith()");
        System.out.println("Checks whether a string starts with specified characters\nFor example check is str starts with no: " + str.startsWith("no"));
        System.out.println("============================================");
    }

    public void toLowerCase(String txt) {
        System.out.println("\t\t\t20.toLowerCase()");
        System.out.println("Converts a string to lowercase format\nFor example converts txt to lowercase formate: " + txt.toLowerCase());
        System.out.println("============================================");
    }

    public void toUpperCase(String str) {
        System.out.println("\t\t\t21.toUpperrCase()");
        System.out.println("Converts a string to uppercase format\nFor example converts str to uppercase formate: " + str.toUpperCase());
        System.out.println("============================================");
    }

    public void trim(String str) {
        System.out.println("\t\t\t22.trim()");
        System.out.println("remove white space from both sides of a string\nFor example removes white space from both side in str: " + str.trim());
        System.out.println("============================================");
    }
    
    public void substring(String str){
        System.out.println("\t\t\t23.substring()");
        System.out.println("Returns a specified portion of a string\nFor example returns a part str from index 5 to 10: " + str.substring(0, 8));
        System.out.println("============================================");
    }
    
    public void subsequence(String str){
        System.out.println("\t\t\t24.subsequence()");
        System.out.println("Returns a charsequence of a string\nFor example returns charsequence of str from index 5 to 10: " + str.subSequence(9, str.length()));
        System.out.println("============================================");
    }
}
