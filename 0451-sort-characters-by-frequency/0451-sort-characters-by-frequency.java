class Solution {
    public String frequencySort(String s) {

        class Pair {
            char a;
            int b;

            Pair(char a, int b) {
                this.a = a;
                this.b = b;
            }
        }
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);

        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> (b.b - a.b));

        for (Map.Entry<Character, Integer> entry : hs.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));

        }

        while (!pq.isEmpty()) {
            char a = pq.peek().a;
            int b = pq.peek().b;
            for (int i = 0; i < b; i++) {

                sb.append(a);
            }
            pq.poll();

        }
        return sb.toString();

    }
}