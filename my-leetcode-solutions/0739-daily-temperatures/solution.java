class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // resolve previous colder days
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                res[prevIndex] = i - prevIndex;
            }

            st.push(i);
        }

        return res;
    }
}
