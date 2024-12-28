class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
		
		for(int j=0;j<strs[0].length();j++) {
			char c = strs[0].charAt(j);
			for(int k = 1;k<strs.length;k++) {
				if (j >= strs[k].length() || strs[k].charAt(j) != c) {
		               return prefix.toString();
				}

			}
			prefix.append(c);
				
		}
		return prefix.toString();
    }
}