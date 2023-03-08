import java.util.ArrayList;

public class Priest extends magic_unit{
    static Integer Magic_energy;

    public Priest(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                  Integer type_of_damage, Integer damage, Integer ph_Immunity,
                  Integer M_imm,Integer magic_energy,Integer speed, int x, int y, boolean team,String state
    ,int max_hp) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage,
                ph_Immunity, M_imm, magic_energy,speed, x,y, team, state,max_hp);
    }
    public Priest(String name, int x, int y){
        super("прист",name,250,100,0,20,0,
                0,0,300,50, x,y, true, "живаЯ",250);
        super.name=name;
    this.x=x;
    this.y=y;}


    Integer get_heal( Integer hp_before,Integer incr_hp, Integer maxhp){
        if(incr_hp+hp_before>maxhp){
            Integer hp_after=maxhp;
            return hp_after;
        }
        else {
            Integer hp_after = hp_before + incr_hp;
            return hp_after;
        }


    }

    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        System.out.println("ход делает " + name_of_class + " по имени " + name + " из команды 2");

        // алгоритм стрельбы только во врагов
        if (this.team) {
            if (this.hit_points <= 0) {
                System.out.println( name_of_class + " по имени " + name + " из команды 2 уже чилит");
            }
            if (this.magic_energy <= 0) {
                System.out.println("отдохнуть бы а");
            } else {
                /** Поиск наиболее приближённого врага */


                int nearIndex = 0;
                for (int i = 0; i < 10; i++) {

                    if ( team1.get(i).hit_points<team1.get(i).max_hp && team1.get(i).hit_points!=0) {
                        nearIndex = i;

                    }
                }

                team1.get(nearIndex).hit_points = get_heal(
                        team1.get(nearIndex).hit_points,
                        ((int) (Math.random()*150)),
                        team1.get(nearIndex).max_hp) ;

                System.out.println("наПопэй! подлечила " + team1.get(nearIndex).name_of_class + " по имени " + team1.get(nearIndex).name
                        + " ее хп- " + team1.get(nearIndex).hit_points);
                this.magic_energy -= 100;
            }
            magic_energy+=20;
            System.out.println();
        }


    }

}
