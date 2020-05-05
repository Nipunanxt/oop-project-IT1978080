package Models;

public class Rider {

    String Name;
    String Country;
    int Age;
    float Weight;
    float Height;

    public Rider(String Name, String Country, int Age, float Weight, float Height) {
        this.Name = Name;
        this.Country = Country;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }

    public class Record {

        int No_of_Olympic_Medals;
        float TopSpeed;
        int No_of_National_Records;

       public Record(int n, float t, int nr) {
            this.No_of_Olympic_Medals = n;
            this.TopSpeed = t;
            this.No_of_National_Records = nr;
        }

        @Override
        public String toString() {
            return " Olympic Medals " + this.No_of_Olympic_Medals + " Top Speed " + this.TopSpeed + " National Records " + this.No_of_National_Records;
        }

    }

    public double calBMI() {    
        class BMI 
        {
            double WeightMetric;
            double HeightMetric;
            BMI() 
            {
                this.WeightMetric = Rider.this.Weight;
                this.HeightMetric = Rider.this.Height;
            }
            double BMIMetric() {
                double bmi =WeightMetric/Math.pow(HeightMetric, 2);
                return bmi;
            }
        }        
        BMI b=new BMI();        
        return b.BMIMetric();               

    }
}
