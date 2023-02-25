public class Priest extends magic_unit{
    static Integer Magic_energy;

    public Priest(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity,
                  Integer M_imm,Integer magic_energy,Integer speed, int x, int y, boolean team) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage,
                ph_Immunity, M_imm, magic_energy,speed, x,y, team);
    }
    public Priest(String name, int x, int y){
        super("прист",name,250,100,0,20,0,
                0,0,300,50, x,y, true);
        super.name=name;
    this.x=x;
    this.y=y;}


    Integer get_heal( Integer hp_before,Integer incr_hp){
        Integer hp_after=hp_before+incr_hp;
        Magic_energy+=incr_hp;
        return hp_after;
    }
}
