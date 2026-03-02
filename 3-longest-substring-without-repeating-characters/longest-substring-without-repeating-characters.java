import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> Set=new HashSet<>();
        int left=0;
        int maxLng=0;
        for(int right=0; right<s.length();right++){
            while(Set.contains(s.charAt(right))){
                Set.remove(s.charAt(left));
                left++;
            }
            Set.add(s.charAt(right));
            
            maxLng = Math.max(maxLng, right - left + 1);
        }
        
        return maxLng;
        }
        
    }
