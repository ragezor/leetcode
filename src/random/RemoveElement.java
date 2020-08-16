package random;


public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        removeElement.removeElement(nums, val);


    }

}
