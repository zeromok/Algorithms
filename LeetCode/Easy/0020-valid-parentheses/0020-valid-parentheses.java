class Solution {
    public boolean isValid(String s) {
       Stack<Character> mate = new Stack<>();

		for (char item : s.toCharArray()) {
			if (item == '(') {
				mate.push(')');
			} else if (item == '{') {
				mate.push('}');
			} else if (item == '[') {
				mate.push(']');
			} else if (mate.isEmpty() || item != mate.pop()) {
				return false;
			}
		}

		return mate.isEmpty();
    }
}