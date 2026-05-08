class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0 , r =0;
        Map<Character , Integer> map = new HashMap<>();
        int maxLen = 0;
        
        while(r < s.length()){
            char curr = s.charAt(r);
            map.put(curr , map.getOrDefault(curr , 0) +1);

            while(map.containsKey(curr) && map.get(curr) > 1){
                char currL = s.charAt(l);
                map.put(currL , map.getOrDefault(currL , 0) -1);
                if(map.get(currL) == 0){
                    map.remove(currL);
                }
                l++;
            }
            if(r-l+1 > maxLen){
                maxLen = r-l+1;
            }
            r++;
        }
        return maxLen;
    }
}