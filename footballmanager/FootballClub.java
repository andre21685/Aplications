public abstract class FootballCLub extends SportsClub{
    
    private int winCount;
    private int drawCount;
    private int defeatCount;
    private int scoredGoalCount;
    private int receviedGoalCount;
    private int points;
    private int matchesPlayed;
    
    public int getWinCount(){
        return winCount;
    }
    
    public int getDrawCount(){
        return drawCount;
    }
    
    public int getDefeatCount(){
        return defeatCount;
    }
    
    public int getScoredGoalsCount(){
        return scoredGoalCount;
    }
    
    public int getReceviedGoalsCount(){
        return receviedGoalCount;
    }
    
    public int getPoints(){
        return points;
    }
    
    public int getMatchesPlayed(){
        return matchesPlayed;
    }
    
    public void setWinCount(int i){
        winCount=i;
    }
    
    public void setDrawCount(int i){
        drawCount = i;
    }
    
    public void setDefeatCOunt(int i){
        defeatCount = i;
    }
    
    public void setScoredGoalsCOunt(int i){
        scoredGoalCount = i;
    }
    
    public void setReceviedGoalsCount(int i){
        receviedGoalCount = i;
    }
    
    public void setPoints(int i){
        points = i;
    }
    
    public void setMatchesPlayed(int i){
        matchesPlayed = i;
    }
    
    
}