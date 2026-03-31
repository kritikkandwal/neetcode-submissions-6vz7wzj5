class Solution {
    public String longestCommonPrefix(String[] strs) {

        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int indx = 0;

            for (int j = 0; j < first.length() && j < strs[i].length(); j++) {
                if (first.charAt(j) == strs[i].charAt(j)) {
                    indx++;
                } else {
                    break;
                }
            }

            first = first.substring(0, indx);
        }

        return first;
    }
}
