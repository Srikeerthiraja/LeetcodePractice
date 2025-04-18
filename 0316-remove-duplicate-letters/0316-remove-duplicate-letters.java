class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26]; 
        boolean[] visited = new boolean[26]; 
        for (char ch : s.toCharArray()) {
            freq[ch-'a']++;
        }
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            int idx = ch-'a';
            freq[idx]--;
            if (visited[idx]) continue; 
            while (!st.isEmpty() && ch<st.peek() && freq[st.peek()-'a']>0){
                visited[st.pop()-'a'] = false;
            }
            st.push(ch);
            visited[idx] = true;
        }
        StringBuilder res = new StringBuilder();
        for (char ch : st) {
            res.append(ch);
        }
        return res.toString();
    }
}