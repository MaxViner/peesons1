import java.util.ArrayList;

public class bandit extends dog_fiters{
    public bandit(String name_of_class,String name, Integer hit_points, Integer Endurance,
                  Integer type_of_damage,double Parryng,
                   Integer damage, Integer ph_Immunity, Integer M_imm, Integer speed,
                  int x, int y, boolean team, String state, int max_hp) {
        super(name_of_class,name, hit_points,
                Endurance,damage, type_of_damage,
                 Parryng, ph_Immunity,
                M_imm, speed, x, y, team, state,max_hp);
    }




    public bandit(String name, int x,int y){
        super("браток",
                name,
                1000,
                140,
                1,
                200,
                0.35,
                60,
                10,
                99999,
                x,
                y,
                true,
                Alive,
                1000);
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


    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        this.damage=140;
        System.out.println("ход делает " + name_of_class + " по имени " + name + " из команды " + team_name);

        // алгоритм стрельбы только во врагов
        if (this.team) {
            if (this.hit_points <= 0) {
                System.out.println(name_of_class + " по имени "
                        + name + " из команды 1 маслину поймал");
            } else {
                /** Поиск наиболее приближённого врага */
                double distanceToEnemy;
                double temp = 100;
                int nearIndex = 0;
                for (int i = 0; i < 10; i++) {
                    if (team2.get(i).hit_points>0) {
                        distanceToEnemy = pointer2d.Distance(this.x,
                                this.y,
                                team2.get(i).x,
                                team2.get(i).y);
                        if (distanceToEnemy < temp) {
                            nearIndex = i;
                            temp = distanceToEnemy;

                        }
                    }
                }
                if (this.x != team2.get(nearIndex).x ) {
                    this.x=team2.get(nearIndex).x;

                }
                else {
                    if (this.y<team2.get(nearIndex).y){
                        this.y += 1;
                     }
                    else {
                        this.y-=1;
                    }

                }

                distanceToEnemy = pointer2d.Distance(this.x,
                        this.y,
                        team2.get(nearIndex).x,
                        team2.get(nearIndex).y);

                if (distanceToEnemy==1) {

                            if (this.Endurance >= 150) {
                                this.damage = 280;
                            }
                            team2.get(nearIndex).hit_points =
                                    team2.get(nearIndex).giveDamage(team2.get(nearIndex).hit_points,
                                    go_damage(this.damage, team2.get(nearIndex).
                                            hit_points, team2.get(nearIndex).Parrying,
                                            team2.get(nearIndex).Ph_Immunity),
                                    team2.get(nearIndex).max_hp);

                            System.out.println("bang! ширанула " + team2.get(nearIndex).name_of_class + " по имени " + team2.get(nearIndex).name
                                    + " ее хп- " + team2.get(nearIndex).hit_points+"\n");

                        }
                    }


                }

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
