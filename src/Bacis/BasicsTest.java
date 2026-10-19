package Bacis;

import java.sql.SQLOutput;

public class BasicsTest {

    public static void main(String [] args) {

        int[] arr = {10, 20, 30, 40, 50, 10, 45, 23, 89, 12};
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }

        System.out.println(max);


        //30 hai ki nahi
        for(int x= 0;x<arr.length;x++){
            if(arr[x] == 30){
                System.out.println("Present 30");
            }
        }
        //palindrom
        String str = "madam";
        String re = "";
        StringBuilder sb = new StringBuilder(str);
        re =  re+ sb.reverse();

        if(re.equals(str)){
            System.out.println( "Pelimdrom number ");
        }
//find even array in the arrays
        int[] arr1 = {10, 20, 30, 40, 50};
        for(int j= arr1.length-1;j>=0;j--){
            System.out.println(arr1[j]);
        }

        int count1 =0;
        for(int i=0;i<arr1.length;i++){

            if(arr1[i]%2 ==0){
                count1++;
            }
        }
        System.out.println(count1);
        String str2 = "Hello Java".toLowerCase();
        //Count karo ki string mein kitne vowels hain.
        //Vowels: a, e, i, o, u
        int count3 = 0;
        for(int x=0;x<str2.length();x++){
            char ch =str2.charAt(x);
            if(ch =='a'||ch =='i'||ch =='o'||ch =='u'||ch =='e'){
                count3++;
            }
        }
        System.out.println(count3);

        int num = 12345;
        String s = String.valueOf(num);
        StringBuilder sb1 = new StringBuilder(s);
         String st = String.valueOf(sb1.reverse());
        System.out.println(st);

    }
}
