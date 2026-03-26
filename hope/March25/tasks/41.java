import java.util.*;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for(int i=1;i<100002;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
