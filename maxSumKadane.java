import java.util.*;
public class maxSumKadane{
public static int kadane(int n[]){
    int sum=0,max=0;
    for(int i=0;i<n.length;i++){
        sum+=n[i];
        if(sum<0){
            sum=0;
        }
        max=Math.max(sum,max);
    }
    return max;

}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={-2,-3,4,-1,-2,1,5,-3};
System.out.print("Max sum is:"+kadane(n));
sc.close();
}
}