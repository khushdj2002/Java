import java.util.Arrays;

public class Merge_Already_Sorted {
    public static void main(String[] args) {
     int a[] = {5,10,15};
     int b[] = {8,9,16};
     int[]  d;
     d =new int[6];
     int m=0;
     int n=0;
        for (int i = 0; i < d.length; i++) {
            if(m==b.length||(n<a.length&&a[m]>b[n])){
                 d[i]=b[n];
                 n++;
             }
             else {
                d[i] = a[m];
                     m++;
                  }

        }
        System.out.println(Arrays.toString(d));
    }

}
