import java.util.*;
public class subarrays{
    public static void subarray(int n[]){
        for(int i=0;i<n.length;i++){
            for(int j=i;j<n.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(n[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }


    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={2,3,4,6,8,10};
subarray(n);
sc.close();
}
}