public class WordChange {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] visited = new boolean[words.length];

        for(int i = 0; i < words.length; i++) {
            if(!visited[i]) {
                answer += 1;
                dfs(i, visited, words, begin, target);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        WordChange w = new WordChange();

        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        w.solution("hit", "cog", words);
    }

    public static void dfs(int node, boolean[] visited, String[] words, String begin, String target) {
        visited[node] = true;

        int sameChar = 0;
        for(int i = 0; i < words[node].length(); i ++) {
            if(words[node].substring(i,i+1).equals(begin.substring(i,i+1))) {
                sameChar++;
            }
        }
        if (sameChar == 2 && !visited[node]) {
            begin=words[node];
        }
        if (begin.equals(target)) {
            dfs(node, visited, words, begin, target);
        }
    }
}
