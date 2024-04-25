class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
			return "";
		Arrays.sort(strs);
		String first = strs[0];
		String last = strs[strs.length - 1];
		int prefix = 0;
		for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
			if (first.charAt(i) == last.charAt(i)) {
				prefix++;
			} else {
				break;
			}
		}
		return prefix == 0 ? "" : first.substring(0, prefix);
    }
}