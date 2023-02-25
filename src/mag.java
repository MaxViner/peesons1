public class mag extends magic_unit{


    public mag(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
               Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm,
               Integer magic_energy, Integer speed,int x, int y,boolean team) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage,
                damage, ph_Immunity, M_imm,magic_energy,speed,x,y, team);
    }

    public mag(String name, int x, int y){
        super("маг",name,250,100,0,20,
                0,0,0,300,50,x,y, false);
        super.name=name;
    this.x=x;
    this.y=y;}

    Integer corrypt_armor( Integer armor){
        if (magic_energy>armor){magic_energy-=armor;armor=0;}
        else
        {armor-=magic_energy;}
        return armor;
    }
}
