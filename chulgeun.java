public class chulgeun {
    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int count = 0;
            int day = startday;
            
            for(int j = 0; j < timelogs[i].length; j++) {
                if((schedules[i] + 10) >= timelogs[i][j] && day != 6 && day !=7) {
                    //System.out.println(schedules[i] + 10 + " " + timelogs[i][j] + " " + startday);
                    count += 1;
                }
                day += 1;
                if(day > 7) {
                    day = 1;
                }
            }
            //System.out.println(count);
            if(count == 5) {
                answer += 1;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int[] schedules = {700, 800, 1100};
        int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659}, {800, 801, 805, 800, 759, 810, 809}, {1105, 1001, 1002, 600, 1059, 1001, 1100}};
        int startday = 5;

        solution(schedules,timelogs,startday);
    }
}