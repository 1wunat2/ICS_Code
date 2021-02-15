/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

/**
 *
 * @author nwu10
 */
public class RecursionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] n = {2, 5, 10, 4};
        System.out.println(groupSum5(0, n, 19));
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        int n =0,r=0;
        if (start >= nums.length) {
            return target == 0;
        }

        if ((start > 0 && (nums[start] != 1 || (nums[start] == 1 && nums[start - 1] % 5 != 0))) || (start == 0)) {
            if (groupSum5(start + 1, nums, target - nums[start])) {
                return true;
            }
        }

        if (nums[start] % 5 != 0 && groupSum5(start + 1, nums, target)) {
            return true;
        }

        return false;
    }
}
