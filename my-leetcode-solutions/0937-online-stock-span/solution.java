class StockSpanner {
    Stack<int[]> stack; // stores [price, span]

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1; // ✅ at least today itself

        // pop all prices <= current price
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1]; // ✅ add their spans!
        }

        stack.push(new int[]{price, span}); // ✅ push with span
        return span;
    }
}
