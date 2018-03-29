/**
	Author Erlandas Miezys
	https://open.kattis.com/problems/acm
*/


public class ACMContestSet {
    private int time;
    private String problem;
    private String result;

    public ACMContestSet(int time, String problem, String result){
        this.problem = problem;
        this.time = time;
        this.result = result;
    }

    public int getTime() {
        return time;
    }

    public String getProblem() {
        return problem;
    }

    public String getResult() {
        return result;
    }
}