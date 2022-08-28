class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack();
        stack.push(-1);
        int m=0;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)==')')
            {
                stack.pop();
                if(stack.size()==0)
                {
                    stack.push(i);
                }
                else
                {
                    m=Math.max(m,i-stack.peek());
                }
            }
            else
            {
                stack.push(i);
            }
        }
        return(m);
    }
}