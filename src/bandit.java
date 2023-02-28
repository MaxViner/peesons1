public class bandit extends dog_fiters{
    public bandit(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm, Integer speed,
                  int x, int y, boolean team, String state) {
        super(name_of_class,name, hit_points, Endurance, Parryng,
                type_of_damage, damage, ph_Immunity, M_imm,speed, x,y, team,  state);
    }




    public bandit(String name, int x,int y){
        super("свой пацан",
                name,
                1000,
                140,
                1,
                200,
                35,
                60,
                10,
                99999,
                x,
                y,
                true,
                Alive);
        super.name=name;
        this.x=x;
        this.y=y;

    }

    String team_name;

    @Override
    public String get_info() {
        if (team){
            team_name="тим1";
        }
        return ("я - бандитка еще так, а ты зови меня "+name+" я в "+ team_name);
    }

    Integer do_critical_damage(Integer damage, Integer edu){
        if (edu>=50){
        damage=damage*2;
        edu-=50;}
        else {
            System.out.println("need some rest");
        }
        return damage;
    }
}
