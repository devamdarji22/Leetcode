// 🧩 Problem: Online Stock Span
// 🔗 Link   : https://leetcode.com/problems/online-stock-span/description/?envType=study-plan-v2&envId=leetcode-75

class StockSpanner {

    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty()
                && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */