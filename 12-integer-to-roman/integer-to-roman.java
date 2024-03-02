class Solution {
    public String intToRoman(int num) {
     int []c={1000,900,500,400,100,90,50,40,10,9,5,4,1};
      String [] d={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
      StringBuilder res= new StringBuilder();
      for(int i =0;i<c.length;i++){
          while(num>=c[i]){
              res.append(d[i]);
              num =num-c[i];
          }
      } 
      return res.toString();
        
    }
}