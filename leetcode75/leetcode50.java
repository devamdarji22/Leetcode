// 🧩 Problem: Smallest Number in Infinite Set
// 🔗 Link   : https://leetcode.com/problems/smallest-number-in-infinite-set/description/?envType=study-plan-v2&envId=leetcode-75

class SmallestInfiniteSet {
    private int curr;
    private PriorityQueue<Integer> minHeap;
    private HashSet<Integer> addedBack;

    public SmallestInfiniteSet() {
        curr = 1;
        minHeap = new PriorityQueue<>();
        addedBack = new HashSet<>();
    }

    public int popSmallest() {
        if(!minHeap.isEmpty()){
            int smallest = minHeap.poll();
            addedBack.remove(smallest);
            return smallest;
        }
        return curr++;
    }

    public void addBack(int num) {
        if(num<curr && !addedBack.contains(num)){
            minHeap.add(num);
            addedBack.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */