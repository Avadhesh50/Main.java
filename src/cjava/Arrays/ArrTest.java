package cjava.Arrays;

public class ArrTest {  public static void main(String [] args){

    int data[] =  {442,25,4,8,7,9,25,6,74,9,498,};
    int data2[] = new int[data.length];

    for(int x=0;x<data.length;x++){
        data2[x] = data[x];

        System.out.println(data[x]+" printing the upcaming data");
    }
  for(int x=0;x <data2.length;x++){
      System.out.println();
  }

}
}
