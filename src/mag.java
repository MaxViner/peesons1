public class mag extends Person{
    static Integer Magic_energy;
    Integer corrypt_armor( Integer armor){
        if (Magic_energy>armor){Magic_energy-=armor;armor=0;}
        else
        {armor-=Magic_energy;}
        return armor;
    }
}
