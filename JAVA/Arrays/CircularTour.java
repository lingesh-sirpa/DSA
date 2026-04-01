import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;

        for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
			System.out.println(new Solution().tour(p,d));
	}
}
class Solution
{
	int tour(int petrol[], int distance[])
	{

		int ans = -1;
		for(int i = 0; i < petrol.length; i++){
			int petrolfill = 0;
			int disttravel = 0;
			int count = petrol.length;
			for(int j = i; j <= petrol.length; j++){
				if(j == petrol.length){
					j = 0;
				}
                if(count == 0){
					break;
				}
			    petrolfill = petrolfill + petrol[j];
				if(j == petrol.length - 1){
                 disttravel = petrolfill - distance[petrol.length-1];
				}else{
			     disttravel = petrolfill - distance[j];
				}
				if(disttravel < 0){
					break;
				}
                petrolfill = disttravel;
				count--;
			}
			if(disttravel >= 0){
				ans = i;
				break;
			}

		}

		return ans;
	}
}
