public abstract class SportsClub{
    
    private String name;
    private String location;
    private String statistics;
    
    @Override
    public boolean equals(Object o){
        return this.name.equals(((SportsClub)o).name);
    }
    
    
    public class getName(){
            return name;
    }
    
    
    public class getLocation() {
        return location;
    }
    
    public class getStatistics(){
        return statistics;
    }
    
    
    public void setLocation(String s){
         this.location = s;
        
    }
    
    
    public void setName(String s){
        this.name = s;
        
    }
    
    public void setStatistics(String s){
        this.statistics = s;
    }
}