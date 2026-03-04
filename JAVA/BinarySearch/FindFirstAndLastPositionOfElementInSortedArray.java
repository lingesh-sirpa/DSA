import java.util.*;

public class Main {
    public static void findPosition(int a[], int n,int k)
    {
        int firstocc = -1; int lastocc = -1;

        if(a.length == 1 && a[0] == k){
          firstocc = 0; lastocc = 0;
        }

        int i = 0; int j = a.length-1;
        while(i < j){
            int mid = i+(j-i)/2;
            if(a[mid] == k){
                firstocc = mid;
                j = mid;
            }
            else if(a[mid] < k){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }

        
        i = 0; j = a.length-1;
        boolean flag = false;

        while(i <= j){
            int mid = i+(j-i)/2;
            if(a[mid] <= k){
                lastocc = mid;
                if(a[mid] == k){
                    flag = true;
                }
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        if(flag == false){
          lastocc = -1;
        }
        System.out.print(firstocc+" "+lastocc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        findPosition(array,n,k);
    }
}
