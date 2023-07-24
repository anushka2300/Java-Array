import java.util.*;
public class distinctValue{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int max=0;
int n[]={2,2,2,2,3,3,3,4,4};
for(int i=0;i<n.length;i++){
    if(n[i]>max){
        max=n[i];
    }
}
int arr[]=new int[max+1];
for(int i=0;i<n.length;i++){
    arr[n[i]]++;
}
for(int i=0;i<=max;i++){
    if(arr[i]>1){
        System.out.println(i+":"+arr[i]);
    }
}
sc.close();
}
}
