

class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        q1.offer(x); // ✅ FIXED
    }

    public int pop() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int top = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.offer(q1.poll());
        }

        int top = q1.peek();
        q2.offer(q1.poll());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
