import java.util.*;
public class LinearSearch{
    public static int linearSearch(int n[],int f){
        for(int i=0;i<(n.length);i++){
            if(n[i]==f){
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={2,4,1,76,10,10,11};
int f=76;
int out=linearSearch(n,f);
System.out.print("element found at:"+out);











sc.close();
}
}