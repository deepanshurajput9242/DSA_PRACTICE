import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] ans = new int[arr1.length];
        int index = 0;

        // arr2 ke order me elements add karo
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    ans[index++] = arr1[j];
                    arr1[j] = -1; // mark as used
                }
            }
        }

        // arr1 ko sort karo
        Arrays.sort(arr1);

        // jo elements -1 nahi hain unhe last me add karo
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                ans[index++] = arr1[i];
            }
        }

        return ans;
    }
}