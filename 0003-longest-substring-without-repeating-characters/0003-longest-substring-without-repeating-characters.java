class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int first=0;
        int last=0;
        int max=0;
        HashSet<Character> hs=new HashSet<>();
        while(last!=n){
            if(!hs.contains(s.charAt(last))){
                hs.add(s.charAt(last));
                max=Math.max(max,hs.size());
                last++;
            }
            else{
                hs.remove(s.charAt(first));
                first++;
            }
        }
        return max;}}
        
     