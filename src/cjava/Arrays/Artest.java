package cjava.Arrays;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Artest {
            public static void main(String []main){


                int [] arr = {4,52,454,85,66,54,66,4,1,5,2,};

                for(int x=0;x<arr.length; x++){
                    for(int y=1; y<arr.length; y++){

                        if(arr[x]< arr[y]){
                            System.out.println(arr[x] +"Get the value"+arr[y]);
                        }

                    }



                }




            }
}
