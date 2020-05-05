
package Models;

public abstract class Animal 
{
    public String Name;
    public String Genus;
    public String Species;
    
    public Animal(String Name,String Genus,String Species){
        this.Genus=Genus;
        this.Name=Name;
        this.Species=Species;
                
    }
    
    public void printName()
    {
        for (int i=0;i<Name.length();i++)
        {
            System.out.println(Name.charAt(i));
            
        }
        
    }
    public String generateScientificName()
    {
        String L1=(Genus.charAt(0)+"").toUpperCase();
        String L2= Genus.substring(1,Genus.length());
        String L3= Species.toLowerCase();
        String ScientificName = L1+L2+" "+L3;
        return ScientificName;
    }
    public abstract String SayHello();
}
