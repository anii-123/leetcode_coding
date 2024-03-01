class Solution {
    public String maximumOddBinaryNumber(String s) {
         int count = 0;
        StringBuilder res = new StringBuilder();
        
        for (char ch :s.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (count > 1) {
                count--;
                res.append('1');
            } else {
                res.append('0');
            }
        }
        
        res.append('1');
        return res.toString();


        // int cnt1 = 0, cnt0 = 0;
        // for (char a : s.toCharArray()) {
        //     if (a == '1')
        //      cnt1++;
        //     else if (a == '0') 
        //     cnt0++;
        // }
        // StringBuilder ans = new StringBuilder();

        // ans.append("1".repeat(cnt1 - 1));

        // ans.append("0".repeat(cnt0));

        // ans.append("1");
        // return ans.toString();

        //  char[] chars = s.toCharArray();
        // Arrays.sort(chars);
        // for (int i = chars.length - 1; i >= 0; i--) {
        //     if (chars[i] == '1') {
        //         char temp = chars[i];
        //         chars[i] = chars[chars.length - 1];
        //         chars[chars.length - 1] = temp;
        //         break;
        //     }
        // }
        // return new String(chars);

        // StringBuilder res=new StringBuilder();
        // int count=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==1){
        //         count++;
        //     }
        // }
        // if(count==0){
        //     count--;
        // }
        // for(int i=1;i<count;i++){
        //     res.append(1);
        // }
        // for(int i=count;i<s.length();i++){
        //     res.append(0);
        // }
        // res.append(1);
        // return res.toString();




        // int zero=0;
        // int ones=0;
        // for(char n:s.toCharArray()){
        //     if(n==0){
        //         zero++;
        //     }
        //     else{
        //         ones++;
        //     }
        // }
        // n[n.length()-1]=1;
        // ones--;
        // // for(int i=0;i<f.length-1;i++){
        // //      if(f[i]==1){
        // //          count++;
        // //     }
        // //  }
        // for(int i=0;i<s.length()-1;i++){
        //     if(ones>0){
        //         s[i]=1;
        //         ones--;
        //     }else{
        //         s[i]=0;
        //         zero--;
        //     }
        // }
        // return s;







        // // char []f=s.toCharArray();
        // int count=0;
        // StringBuilder res =new StringBuilder();
        // for(char f:s.toCharArray()){
        //     if(f==1){
        //         count++;
        //     }
        // }
        // // for(int i=0;i<f.length-1;i++){
        // //     if(f[i]==1){
        // //         count++;
        // //     }
        // // }
        // for(int i=0;i<s.length()-1;i++){
        //     if(count>1){
        //         count--;
        //         res.append('1');
        //     }else{
        //         res.append('0');
        //     }
        // }
        
        // res.append('1');
        
        // return res.toString();
        // Arrays.sort(f);
        // for(int i=f.length-1;i>=0;i--){
        //     if(f[i]==1){
        //         char temp=f[i];
        //         f[i]=f[f.length-1];
        //         f[f.length-1]=temp;
        //         break;
        //     }
        // }
        // return new String(f);
    }
}