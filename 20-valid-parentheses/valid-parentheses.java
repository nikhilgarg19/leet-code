class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(s.charAt(i)==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}