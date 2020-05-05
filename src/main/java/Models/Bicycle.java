package Models;

public class Bicycle {
    
    private int Gear;
    private double Speed;
    public Bicycle(int Gear,double Speed)
    {
        this.Gear=Gear;
        this.Speed=Speed;
    }
    public void applyBreakes(double Decrement)
    {
        this.Speed-=Decrement;
    }
    public void speedUp(double Increment)
    {
          this.Speed+=Increment;
    }
    
    @Override
    public String toString()
    {
        return "Speed "+this.Speed+" Gear "+this.Gear;
    }
    
}
