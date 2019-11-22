public class Judge {
    public static int findJudge (int N, int [][] trust){

        int[] graph = new int[N + 1];
        for (int[] p : trust) {
            graph[p[0]]--;
            graph[p[1]]++;
        }
        int judge = -1;
        for (int i = 1; i <= N; i++) {
            if (graph[i] == N - 1) {
                if (judge == -1) {
                    judge = i;
                } else {
                    return -1;
                }
            }
        }
        return judge;
    }
    


    public static void main(String[] args){
        int n = 4;
        int[][] trust = {{1,3}, {1,4}, {2,3}, {2,4}, {4,3}};
        int[][] trust1 = {{1,2},{2,3}};
        int[][] trust2 = {{1,3},{2,3},{3,1}};
        

        System.out.println("Judge ID: " + findJudge(n, trust));
        System.out.println("Judge ID: " + findJudge(n, trust1));
        System.out.println("Judge ID: " + findJudge(n, trust2));
        
    }
}