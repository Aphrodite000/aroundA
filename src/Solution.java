import java.util.*;
public  class Solution {
    public static void rotate(int[] nums, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=nums.length-1;i>=0;i--){
            queue.add(nums[i]);
        }
        for(int i=0;i<k;i++){
            int j=queue.poll();
            queue.add(j);
        }
        for(int i=nums.length-1;i>=0;i--){
            nums[i]=queue.poll();
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
    }
}
