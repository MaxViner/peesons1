public class Farmer extends dog_fiters {
   Integer water;

    public Farmer(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng ,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm,Integer speed, Integer water
    ,int x, int y,boolean team) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity, M_imm, speed,x,y,team);
        this.water = water;
    }

    public Farmer(String name, int x, int y, boolean team){
        super("крестьянин",name,100,10,1,500,5,6,5,20,x,y,team);
        this.water=100;
        super.name=name;
        this.x=x;
        this.y=y;
        this.team=team;

    }

    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name+"в команде"+ team);
    }

    Integer bring_water(Integer ed_before,Integer incr_ed){
        Integer ed_af=ed_before+incr_ed;
        return ed_af;
    }

    Integer fix_armor(Integer def_before,Integer edu){
        Integer arm_after=def_before+=edu;
        return arm_after;
    }
}
