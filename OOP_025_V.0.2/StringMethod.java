package stringmethod;

/**
 *
 * @author MD.Humayun Kabir
 */
public class StringMethod {

    public static void main(String[] args) {
        String str = " no risk no reward "; // String text
        String txt = "NO RISK NO REWARD";
        System.out.println("str = " + str + "\n" + "txt = " + txt);

        StringOperation strOp = new StringOperation();

        strOp.charAt(str);
        strOp.codePointAt(str);
        strOp.codePointBefore(str);
        strOp.codePointCount(str);
        strOp.compareTo(str, txt);
        strOp.compareToIgnoreCase(str, txt);
        strOp.concat(str, txt);
        strOp.contains(str);
        strOp.contentEquals(str, txt);
        strOp.endsWith(str);
        strOp.equals(str, txt);
        strOp.equalsIgnoreCase(str, txt);
        strOp.hashCode(str);
        strOp.indexOf(str);
        strOp.lastIndexOf(str);
        strOp.isEmpty(str);
        strOp.length(str);
        strOp.replace(str);
        strOp.startsWith(str);
        strOp.toLowerCase(txt);
        strOp.toUpperCase(str);
        strOp.trim(str);
        strOp.substring(str);
        strOp.subsequence(str);
    }

}
