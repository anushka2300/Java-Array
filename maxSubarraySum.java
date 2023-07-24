import java.util.*;
public class maxSubarraySum{
     public static int subarrayMaxSum(int n[]){
        int max=0;
        int sum=0;
        int pre[]=new int[n.length];
        pre[0]=n[0];
        for(int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+n[i];
        }

        for(int i=0;i<n.length;i++){ //start
            for(int j=i;j<n.length;j++){  //end
                sum=i==0?pre[j]:pre[j]-pre[i-1]; //pre[end]-pre[start-1]
                if(max<sum){
                    max=sum;
                }
                } 
            }
            return max;    
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={2,3,4,6,8,10};
int out=subarrayMaxSum(n);
System.out.print("Max sum is:"+out);
sc.close();
}
}
