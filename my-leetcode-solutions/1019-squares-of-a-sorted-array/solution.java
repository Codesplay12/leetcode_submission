class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        // Count positives and negatives first to size the arrays
        int posCount = 0, negCount = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) posCount++;
            else negCount++;
        }

        int a[] = new int[posCount];  // fixed: initialized with correct size
        int b[] = new int[negCount];  // fixed: initialized with correct size

        // Fixed: separate counters for a and b instead of using i
        int ai = 0, bi = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                a[ai++] = nums[i];
            } else {
                b[bi++] = nums[i];
            }
        }

        int x = a.length;
        int y = b.length;
        for (int i = 0; i < x; i++) {
            a[i] = a[i] * a[i];
        }
        for (int i = 0; i < y; i++) {
            b[i] = b[i] * b[i];  // negatives squared become positive
        }

        // Fixed: b is now positive but in descending order, reverse it
        int left = 0, right = y - 1;
        while (left < right) {
            int temp = b[left];
            b[left] = b[right];
            b[right] = temp;
            left++;
            right--;
        }

        int e = 0, f = 0, id = 0;
        int res[] = new int[x + y];

        while (e < x && f < y) {
            if (a[e] <= b[f]) {
                res[id++] = a[e++];
            } else {
                res[id++] = b[f++];
            }
        }

        while (e < x) res[id++] = a[e++];
        while (f < y) res[id++] = b[f++];

        return res;  // fixed: return res directly instead of copying into a
    }
}
