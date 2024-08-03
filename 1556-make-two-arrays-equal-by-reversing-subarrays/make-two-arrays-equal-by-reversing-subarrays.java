class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
//         int n= target.length;
//         int j =arr.length;
//         int count=0;

//         for(int i =0;i<n;i++){
//             for(int k=0;k<j;k++){
//                 if(target[i]==arr[i]){
//                     count++;
//                 }
//             }
//             return count;

//         }
//         if(n==count){
//             return true;
//         }

//         return false;
//     }
// }