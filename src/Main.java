import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
       insertionsort(a);
      //  System.out.println(binærsøk(a,4));
     //   a= Arrays.copyOfRange(a,0,4);
        for (int i:a){
            System.out.print(i+" ");
        }

    }
    public static void insertionsort(int[] a){
        for (int i=1; i<a.length; i++) {
            int temp=a[i];
            int j=i-1;
            for (; j>=0 && temp<a[j]; j--){
                a[j+1]=a[j];
            }
            a[j+1]=temp;
        }
    }







    public static int binærsøk(int[] a, int fra, int til , int verdi){
        int v=fra;
        int h=til-1;
        while (v<h){
            int m=(v+h)/2;
            if (verdi>a[m]){
                v=m+1;
            }
            else h=m;
        }
        if (h<v || verdi<a[v])return -(v+1);
        else if (verdi==a[v])return v;
        else return -(v+2);
    }
    public static int binærsøk(int[] a, int verdi){
        return binærsøk(a,0,a.length,verdi);
    }
}
