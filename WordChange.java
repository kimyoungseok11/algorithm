public class WordChange {
    static int answer = 0;

    public static int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        dfs(words, target, 0, begin, visited);
        return answer;
    } 

    private static void dfs(String[] words, String target, int cnt, String currentWord, boolean[] visited) {
        if (target.equals(currentWord)) {
            answer = cnt;
            return;
        } else {
            for (int i = 0; i < words.length; i++) {
                if(visited[i]) {
                    continue;
                }
                int sameCount = 0;

                for (int j = 0; j < currentWord.length(); j++) {
                    if (currentWord.charAt(j) == words[i].charAt(j)) {
                        sameCount++;
                    }
                }

                if(sameCount == currentWord.length() - 1) {
                    visited[i] = true;
                    dfs(words, target, cnt+1, words[i], visited);
                    visited[i] = false;
                }
            }
        }

    }
    public static void main(String[] args) {
        
        String begin = "hit";	
        String target = "cog";	
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        solution(begin, target, words);
    }
}