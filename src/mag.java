public class mag extends magic_unit{


    public mag(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
               Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm,Integer magic_energy, Integer speed) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity, M_imm,magic_energy,speed);
    }

    public mag(String name){
        super("маг",name,250,100,0,20,0,0,0,300,50);
        super.name=name;}

    Integer corrypt_armor( Integer armor){
        if (magic_energy>armor){magic_energy-=armor;armor=0;}
        else
        {armor-=magic_energy;}
        return armor;
    }
}
