import java.util.*;
public class largestNumber{
    public static int largest(int n[]){
        int max=0;
        for(int i=0;i<(n.length);i++){
            if(n[i]>max){
                max=n[i];
            }
        }
        return max;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={1,2,3,4,5,2,8,9,10,22};
int out=largest(n);
System.out.print(out);
sc.close();
}
}
