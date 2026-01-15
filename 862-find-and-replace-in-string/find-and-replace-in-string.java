class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int[] match = new int[n];
        Arrays.fill(match, -1); 
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (s.startsWith(sources[i], idx)) {
                match[idx] = i; 
            }
        }

        int i = 0;
        while (i < n) {
            if (match[i] >= 0) {
                int rep = match[i];
                sb.append(targets[rep]);
                i += sources[rep].length(); 
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }
}

 
