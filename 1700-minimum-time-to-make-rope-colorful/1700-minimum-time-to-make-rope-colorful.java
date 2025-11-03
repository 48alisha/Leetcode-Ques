class Solution {
    public int minCost(String colors, int[] neededTime) {
        StringBuilder sb = new StringBuilder();
        int time = 0;

        for (int i = 0; i < colors.length() - 1; i++) {

            if (colors.charAt(i) == colors.charAt(i + 1)) {
                // Add the smaller time to total
                time += Math.min(neededTime[i], neededTime[i + 1]);

                // Important fix: keep the *larger* neededTime for the next comparison
                // so you don't undercount for longer same-color groups
                neededTime[i + 1] = Math.max(neededTime[i], neededTime[i + 1]);
            } else {
                sb.append(colors.charAt(i));
            }
        }

        return time;
    }
}
