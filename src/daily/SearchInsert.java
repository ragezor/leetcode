package daily;
//总结地址:https://blog.csdn.net/qq_43491066/article/details/107407251
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low;
        int res = nums.length;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                res = mid;
                high = mid - 1;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        System.out.println(searchInsert.searchInsert(nums, target));
    }

}
