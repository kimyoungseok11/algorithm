import java.util.ArrayList;
import java.util.List;

public class Cache {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cacheList = new ArrayList<>();

        if(cacheSize > 0) {

            for (int i = 0; i < cities.length; i++) {
                String city = cities[i].toLowerCase();
    
                //miss
                if (!cacheList.contains(city)) {
                    if (cacheList.size() < cacheSize) {
                        cacheList.add(0,city);
                        answer += 5;
                    } else {
                        cacheList.remove(cacheList.size() - 1);
                        cacheList.add(0, city);
                        answer += 5;
                    }
                //hit
                } else {
                    int index = cacheList.indexOf(city);
                    cacheList.remove(index);
                    cacheList.add(0,city);
                    answer += 1;
                }
                System.out.println(cacheList);
            }
        } else {
            answer = cities.length * 5;
        }

        return answer;
    }    
    
    public static void main(String[] args) {
        int cacheSize = 0;	
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        solution(cacheSize, cities);
    }
}
