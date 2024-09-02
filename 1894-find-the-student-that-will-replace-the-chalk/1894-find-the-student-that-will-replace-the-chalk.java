// class Solution {
//     public int chalkReplacer(int[] chalk, int k) {
//         int index = 0;

//         while(k>0 && chalk[index]<=k){
//             if(index<chalk.length){
//                 k -=chalk[index];
//                 index++;

//                 if(index==chalk.length){
//                     index=0;
//                 }
//             }
            
//         }

//         return index;
//     }
// }

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        
        long sum = Arrays.stream(chalk).asLongStream().sum();
        // System.out.println("sum\t"+sum);
        while(sum<=k){
            k -=sum;
        }
        // System.out.println("k\t"+k);
        if(k<=0) return 0;
        for(int index=0;index<chalk.length; index++){

            k -=chalk[index];
            if(k<0) return index;
        }
        

        return 0;
    }
}