import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			Solution g = new Solution();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
        sc.close();
		
	}
}

class Solution
{
	int minEle;
	Stack<Integer> s;
    
	Solution()
	{
		s = new Stack<Integer>();
	}
    Stack<Integer> minst = new Stack<>();
	int min = Integer.MAX_VALUE;
	void push(int x){
     	s.push(x);
		if(minst.size() == 0){
	     minst.push(x);
		}else{
		 min = Math.min(minst.peek(), x);
		 minst.push(min);
		}
    }
	
	int pop(){
	 int ans = -1;
     if(s.size() > 0){
       ans = s.peek();
	   s.pop();
	   minst.pop();
	 }
	 return ans;
	}

    int getMin(){
	  int ans = -1;
	  if(s.size() > 0){
		ans = minst.peek();
	  }
	  return ans;
	}	
}
