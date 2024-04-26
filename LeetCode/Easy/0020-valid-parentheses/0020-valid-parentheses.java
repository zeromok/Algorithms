class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> mate = Map.of('(', ')', '{', '}', '[', ']');
		Stack<Character> stack = new Stack<>();

		for (char item : s.toCharArray()) {
			if (item == '(' || item == '{' || item == '[') {
				stack.push(mate.get(item));
			} else if (stack.isEmpty() || item != stack.pop()) {
				return false;
			}
		}

		return stack.isEmpty();
    }
}