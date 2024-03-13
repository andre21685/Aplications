import java.util.Date;

public class Match{
    
    private FootballClub teamA;
    private FootballClub teamB;
    
    private int teamAScore;
    private int teamBScore;
    
    private Date date;
    
    
    public FootballClub getTeamA(){
        return teamA;
    }
    
    public FootballClub getTeamB(){
        return teamB;
    }
    
    public int getTeamAScore(){
        return teamAScore;
    }
    
    public int getTeamBScore(){
        return teamBScore;
    }
    
    public Date getDate(){
        return date;
    }
    
    public void setTeamA(FootballClub teamA){
        this.teamA = teamA;
    } 
    
    public void setTeamB(FootballClub teamB){
        this.teamB = teamB;
    }
    
    public void setTeamAScore(int teamAScore){
        this.teamASocre = teamAScore;
    }
    
    public void setTeamB(int teamBScore){
        this.teamBScore = teamBScore;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
}