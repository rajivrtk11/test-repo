class Stack {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<char> st = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);
            while(st.size() > 0 && st.peek() >= ch && k > 0) {
                st.pop();
                k--;
            }
            st.push();
        }

        // pop from stack if stack is monotonic and k > 0
        while(k-- > 0) st.pop();

        StringBuilder sb = new StringBuilder<>();
        while(st.size() > 0) sb.insert(0, st.pop());

        // remove the trailing zeroes
        int i = 0, j = 1;
        while(sb.charAt(i) == '0' && j < sb.length && sb.charAt(i) == sb.charAt(j)) {
            i++;
            j++;
        }

        return sb.substring(i);
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for(int i = 0; i < n; i++) {
            int curr = asteroids[i];
            if(st.size() > 0 && st.peek() > 0 && ele < 0) {
                int top = st.pop();
                if(Math.abs(ele) < top) st.push(top);
                else st.push(ele);
            }
            else st.push()
        }

        int size = st.size();
        int ansArr = new int[size];

        for(int i = size-1; i >= 0; i--) {
            ansArr[i] = st.pop();
        }

        
    }
}