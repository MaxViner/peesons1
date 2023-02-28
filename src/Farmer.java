import java.util.ArrayList;

public class Farmer extends dog_fiters {
   int water;

  static String free="свободнаЯ";
 static   String busy="ЗанятаяЯ";

    public Farmer(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng ,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity,
                  Integer M_imm,Integer speed, Integer water
                    ,int x, int y,boolean team, String state, int max_hp) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage,
                ph_Immunity, M_imm, speed,x,y,team,state,max_hp);
        this.water = water;

    }

    public Farmer(String name, int x, int y, boolean team){
        super("крестьянин",name,100,10,1,500,
                5,6,5,20,x,y,team,   free, 100);
        this.water=100;
        super.name=name;
        this.x=x;
        this.y=y;
        this.team=team;



    }

    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name+" в команде"+ team);

    }
    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        System.out.println("ход делает " + name_of_class + " по имени " + name );
        if (this.state==Alive){
            this.state=free;
        }
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
