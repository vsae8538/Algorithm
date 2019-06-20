import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class leetcode {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] res = new int[nums1.length];
            
            for(int i = 0;i < nums1.length;i++){
                for(int j = 0;j < nums2.length;j++){
                    if(nums1[i] == nums2[j]){
                        int status = 0;
                        for(int k = j + 1;k < nums2.length;k++){
                            if(nums2[k] > nums2[j]){
                                res[i] = nums2[k];
                                status = 1;
                                break;
                            }
                        }
                        if(status == 0){
                            res[i] = -1;
                        }
                    }        
                }
            }
            return res;
    }
}
