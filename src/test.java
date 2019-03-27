public class test{
    public static void main(String[] args) {
/*        int[] data = {0 ,0};
        int i = 0 ;
        data[++i] = 1;
        System.out.println(data[0]);
        System.out.println(data[1]);*/
        Solution solution = new Solution();
        int[] res = {1,1,3};
        int i = solution.singleNumber(res);
        System.out.println(i);


    }
}



class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        if(nums == null || nums.length == 0)
            return 0;
        int flag = 0 ;
        int res = 0;
        for(int i = 0 ; i < length  ; i++){
            flag = 1;
            for(int j = 0 ; j < length  ; j++){
                if(nums[i] == nums[j] && i != j){
                    flag = 0;  //如果有重复的 flag设为0 结束循环
                    break;
                }
            }
            if(flag == 1){
                res = nums[i];
                break;
            }

        }
        return res;
    }
}