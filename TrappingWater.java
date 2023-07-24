import java.util.*;
public class TrappingWater{
    public static int trap(int n[]){
        //left max
        int l=n.length,trap=0;
        int left[]=new int[l];
        left[0]=n[0];
        for(int i=1;i<l;i++){
            left[i]=Math.max(n[i],left[i-1]);
        }
        
        //right max
        int right[]=new int[l];
        right[l-1]=n[l-1];
        for(int i=l-2;i>=0;i--){
            right[i]=Math.max(n[i],right[i+1]);
        }

        for(int i=0;i<l;i++){
            int waterLevel=Math.min(left[i],right[i]);
            trap+=(waterLevel-n[i]);
        }
        return trap;
    }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n[]={4,2,0,6,3,2,5};
System.out.print("water trapped="+trap(n));
sc.close();
}
}
