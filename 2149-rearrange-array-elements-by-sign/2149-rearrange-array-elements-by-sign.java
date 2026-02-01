class Solution {
    public int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                arr1.add(nums[i]);

            } else {
                arr2.add(nums[i]);
            }

        }
        for(int i=0;i<arr2.size();i++){
            arr3.add(arr2.get(i));
            arr3.add(arr1.get(i));
        }

        int num[]=new int [arr3.size()];
        int j=0;

        for(int i=0;i<arr3.size();i++){
            num[j]=arr3.get(i);
            j++;

        }
        return num;



    }
}