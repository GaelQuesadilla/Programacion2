package Tarea1.Programa3;

public class Votes {

    private int[] votes = new int[7];
    private int totalVotes = 0;

    private int index = 0;

    public void addVote(int amount) {
        this.votes[index] = amount;

        this.totalVotes += amount;
        this.index += 1;

    }

    public int getVotesOnTop20P() {
        int length = this.votes.length;
        int result = 0;
        double currentPercentage;

        for (int i = 0; i <= length - 1; i++) {
            currentPercentage = (double) this.votes[i] / totalVotes;

            if (currentPercentage >= 0.20) {
                result += 1;
            }
        }
        return result;

    }

    public int[] getVotes() {
        return votes;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

}
