class Solution {
    public static int removeDuplicates(int[] nums) {
        int x=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[x]=nums[i];

                x++;
            }
        }
        return x;
        
    }
    public static void main(String[] args){
        int arr[]={1,1,2};
        System.out.print(removeDuplicates(arr));
    }
}