class Solution {
    public boolean isValid(String st) {
        Stack <Character> s=new Stack<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='(' || st.charAt(i)=='{'||st.charAt(i)=='['){
                s.push(st.charAt(i));
                 }
                 else if(!s.isEmpty() && ((st.charAt(i)==')' && s.peek()=='(' || st.charAt(i)=='}' && s.peek()=='{' || st.charAt(i)==']' && s.peek()=='[' )))
                 s.pop();
                 else
                 return false;


        }
        return s.isEmpty();
       







        // String []r=new String[s];
        // for(int i=0;i<s.length();i++){
        //     if(s[i]==s[i+1]){
        //         return true;
        //     }

        // }
        // return false;
       
        
    }
}