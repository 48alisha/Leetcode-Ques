import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hs = new HashMap<>();

        // Step 1: count s
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }

        // Step 2: subtract using t
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!hs.containsKey(ch)){
                return false;
            }

            hs.put(ch, hs.get(ch) - 1);

            if(hs.get(ch) == 0){
                hs.remove(ch);
            }
        }

        return true;
    }
}