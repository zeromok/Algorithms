class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split("\\s*[-+*]\\s*");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);

        if (binomial.contains("+")) return num1 + num2;
        if (binomial.contains("-")) return num1 - num2;
        if (binomial.contains("*")) return num1 * num2;

        return 0;
    }
}