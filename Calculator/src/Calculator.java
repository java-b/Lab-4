/**
 * Lab 4
 *
 * For more details, visit https://github.com/java-b/Lab-4
 *
 * Created by Yi Zhou on 2016/10/11.
 */
public class Calculator {
    public static int eval(String s){
        int result=0;
        /*
         * Instruction:
         *      1. You can only write code between the two label "YOUR CODE HERE".
         *      2. You should calculate the expression s, and assign it to the variable result.
         *
         */
        // ====== YOUR CODE HERE ========






        // ====== YOUR CODE HERE ========
        System.out.println(s+"="+result);
        return result;
    }

    public static void main(String[] args){
        boolean passed=eval("1+1")==2
                & eval("1+1+1")==3
                & eval("1+1+1+1")==4
                & eval("1+99+100")==200
                & eval("997+1+1+1")==1000
                & eval("1+2+3+4+5+6+7+8+9+10")==55;
        if (passed)
            System.out.println(":) You have passed all tests, please upload your code onto FTP.");
        else
            System.err.println(":( Sorry, it seems that there is something wrong with your code.");
    }
}
