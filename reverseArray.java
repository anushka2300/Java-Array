import java.util.*;
public class reverseArray{
    public static void Reverse(int n[]){
        int start=0,end=n.length-1;
        while(start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            end--;
            start++;
        }
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={4,3,1,7,9,10,23,21};
Reverse(n);
for(int i=0;i<n.length;i++){
    System.out.print(n[i]+" ");
}
sc.close();
}
}
