class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        // Step 1 - store mapping of original node to its copy
        HashMap<Node, Node> map = new HashMap<>();

        // Step 2 - create all new nodes
        Node temp = head;
        while(temp != null){
            map.put(temp, new Node(temp.val)); // ✅ original → copy
            temp = temp.next;
        }

        // Step 3 - assign next and random pointers
        temp = head;
        while(temp != null){
            if(temp.next != null){
                map.get(temp).next = map.get(temp.next); // ✅ set next
            }
            if(temp.random != null){
                map.get(temp).random = map.get(temp.random); // ✅ set random
            }
            temp = temp.next;
        }

        return map.get(head); // ✅ return copy of head
    }
}
// ```

// ---

// ## How it Works
// ```
// Original: 1→2→3
// random:   1→3, 2→1, 3→2

// Step 1 - create map:
// {1→copy1, 2→copy2, 3→copy3}

// Step 2 - set pointers:
// copy1.next   = map.get(2) = copy2 ✅
// copy1.random = map.get(3) = copy3 ✅

// copy2.next   = map.get(3) = copy3 ✅
// copy2.random = map.get(1) = copy1 ✅

// copy3.next   = null ✅
// copy3.random = map.get(2) = copy2 ✅
// ```

// ---

// ## Dry Run
// ```
// head = [1,3]→[2,1]→[3,2]
// (value, random)

// Step 1 - map:
// {node1→copy1(1), node2→copy2(2), node3→copy3(3)}

// Step 2 - next pointers:
// copy1.next = copy2 ✅
// copy2.next = copy3 ✅
// copy3.next = null  ✅

// Step 3 - random pointers:
// copy1.random = copy3 ✅ (original random was node3)
// copy2.random = copy1 ✅ (original random was node1)
// copy3.random = copy2 ✅ (original random was node2)

// return copy1 ✅
// ```

// ---

// ## Why HashMap?
// ```
// random pointer can point to ANY node
// we need to find copy of that node quickly!

// map.get(temp.random) 
// → gives us copy of random node in O(1) ✅

// without map:
// would need to search for copy → O(n) ❌
