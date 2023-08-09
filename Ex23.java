
package ex23;


public class Ex23 {
static boolean solve(int index,int arr[],int n,int target){
    if(index>=n)
        return false;
    if(target<0)
        return false;
    if(target==0)
        return true;
    boolean inc=solve(index+1,arr,n,target-arr[index]);
    boolean exc=solve(index+1,arr,n,target-0);
    return inc||exc;
}
static boolean equalpartition(int n,int arr[]){
    int total=0;
    for(int i=0;i<n;i++){
        total+=arr[i];
    }
    if(total%2!=0){
        return false;
    }
    int target=total/2;
    return solve(0,arr,n,target);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = { 3, 1, 5, 9, 12 };
        int n = arr.length;
 
        // Function call
        if (equalpartition( n,arr) == true)
            System.out.println("Can be divided into two "
                               + "subsets of equal sum");
        else
            System.out.println(
                "Can not be divided into "
                + "two subsets of equal sum");
    }
    
}
