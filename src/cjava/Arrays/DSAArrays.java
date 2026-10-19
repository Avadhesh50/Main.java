package cjava.Arrays;

public class DSAArrays {
    public static void main(String[] args) {

        int[] arr = {2, 5, 12, 15, 20, 2, 7};
        int target = 10;
        int bestA=0, bestB=0;
        int bestdiff = Integer.MAX_VALUE;

        for(int x=0;x<arr.length;x++){
            for(int y=x+1;y<arr.length;y++){

                int max = arr[x]+arr[y];
                int diff = Math.abs(target-bestdiff);
                if(diff<bestdiff){

                    diff = bestdiff;
                    bestA = arr[x];
                    bestB = arr[y];



                }

            }
        }
        System.out.println(bestA+" "+bestB);


    }


}
