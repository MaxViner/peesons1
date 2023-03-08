import java.util.ArrayList;

public class marksman extends range_attakers {


    public marksman(String name_class,
                    String name,
                    Integer Type_of_damage,
                    Integer damage,
                    Integer hit_point,
                    Integer Endurance,
                    Integer Parrying,
                    Integer Ph_Immunity,
                    Integer M_Immunity,
                    Integer bullet,
                    Integer accuracy, Integer speed, int x, int y, boolean team, String state,
                    int max_hp) {
        super(name_class, name, Type_of_damage, damage, hit_point, Endurance, Parrying, Ph_Immunity, M_Immunity,
                bullet, accuracy, speed, x, y, team, state, max_hp);

    }

    public marksman(String name, int x, int y) {
        super("снипель", name, 250, 125, 1, 100,
                20, 10, 5, 15, 96, 40, x, y, false, Alive, 250);
        super.name = name;
        this.x = x;
        this.y = y;

    }

    public Integer go_damage(Integer damage,Integer hit_points,
                             double parrying, Integer resist){


            double chance_parring = Math.random();
        if (chance_parring < parrying+accuracy/100-accuracy/100*parrying) {

//           Если выбрашено число попадающее вероятность отражения-урон парируется
                damage=(damage - resist);
            }
            else {
                System.out.println("урон не прошел");
            }




        return damage;
    }
    String team_name = "тим2";

    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        System.out.println("ход делает " + name_of_class + " по имени " + name + " из команды " + team_name);

        // алгоритм стрельбы только во врагов

            if (this.hit_points <= 0) {
                System.out.println(name_of_class + " по имени " + name + " из команды 2 уже чилит");
            }
            if (this.bullet <= 0) {
                System.out.println("У этого героя нет стрел");
            } else {
                /** Поиск наиболее приближённого врага */
                double distanceToEnemy;
                double temp = 100;
                int nearIndex = 0;
                for (int i = 0; i < 10; i++) {
                    if (team2.get(i).hit_points > 0) {


                        distanceToEnemy = pointer2d.Distance(this.x,
                                this.y,
                                team2.get(i).x,
                                team2.get(i).y);
                        if (distanceToEnemy < temp) {
                            nearIndex = i;
                            temp = distanceToEnemy;

                        }
                    } else {
                        continue;
                    }
                }


                team2.get(nearIndex).hit_points =
                        team2.get(nearIndex).giveDamage
                                (team2.get(nearIndex).hit_points
                                        , go_damage(100,
                                                team2.get(nearIndex).hit_points,
                                                team2.get(nearIndex).Parrying,
                                                team2.get(nearIndex).Ph_Immunity),
                                        team2.get(nearIndex).max_hp);

                System.out.println("bang! шмальнула по " + team2.get(nearIndex).name_of_class + " по имени " +
                        team2.get(nearIndex).name
                        + " ее хп- " + team2.get(nearIndex).hit_points);

                bullet = bullet - 1;

        }
        Double distanceToFarmer;
        Double temp = pointer2d.Distance(this.x, this.y, team2.get(0).x, team2.get(0).y);

        for (int i = 1; i < 10; i++) {

            if (team1.get(i).name_of_class == "крестьянин") {
                distanceToFarmer = pointer2d.Distance(this.x, this.y,
                        team1.get(i).x, team2.get(i).y);

                if (team1.get(i).state == Farmer.free) {
                    System.out.println("нашла крестьтяночку по имени - " + team1.get(i).name +
                            " расстояние до нее " + distanceToFarmer + " она сейчас -" + team1.get(i).state);
                    bullet += 1;
                    team1.get(i).state = Farmer.busy;

                    System.out.println("теперь у меня " + bullet + " стрел \n");
                    break;
                }
            }
        }
    }
        @Override
        public String get_info () {
            return ("я - стреляю точно в цель " + name_of_class + " " + name);

        }


}