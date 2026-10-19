package cjava.Arrays.javaBasic;

public class StringTest {

    public static void main(String[] args) {

        String str  = "Hello avadhesh Kumar Yadav";

        for(int x = str.length()-1;x>= 0;x--){
            System.out.print(str.charAt(x));
        }



        StringBuffer sb = new StringBuffer(str);



        System.out.println(sb.reverse());
    }

}
