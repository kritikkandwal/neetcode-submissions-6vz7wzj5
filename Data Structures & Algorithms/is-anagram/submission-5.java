class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sort1=s.toCharArray();
        char[] sort2=t.toCharArray();

        Arrays.sort(sort1);
        Arrays.sort(sort2);

        return Arrays.equals(sort1, sort2);
    }
}
