import java.util.*;
public class binarySearch{
    public static int BinarySearch(int n[],int key){
        int start=0,end=n.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(n[mid]==key){
                return mid;
            }
            else if(n[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;    }
public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n[]={2,3,4,6,8,10,12};
int key=8;
int out=BinarySearch(n,key);
if(out>0){
System.out.print("elemnt found at:"+(out+1));
 }
else{
System.out.print("element not found");}
sc.close();
}
}