//Number of Visible People in a Queue

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        if(heights == null || heights.length == 0) {
            return new int[0];
        }
       Stack<Integer> stack = new Stack<>();
	   int[] result = new int [heights.length];
	   for(int i = heights.length - 1; i >= 0; i--) {
		   while(!stack.isEmpty() && heights[i]>stack.peek()) {
			 stack.pop();
			 result[i]++;
		   }
		   if(!stack.isEmpty()){
               result[i]++;
           }
		   stack.push(heights[i]);
	   }
	   return result;
    }
}

//Sqrt(x)

class Solution {
    public int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }
        int low = 1;
        int high = x / 2;
        
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if((long) mid * mid == x) {
                return mid;
            } else if((long) mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
        return high;
    }
}