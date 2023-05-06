class Solution {
    public int solution(int n, String control) {
        String[] items = control.split("");
        for (String item : items) {
            switch (item) {
                case "w":
                    n++;
                    break;
                case "s":
                    n--;
                    break;
                case "d":
                    n = n + 10;
                    break;
                case "a":
                    n = n - 10;
                    break;
            }
        }
        return n;
    }
}