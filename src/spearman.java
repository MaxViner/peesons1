import java.util.ArrayList;

public class spearman extends dog_fiters{


    public spearman(String name_of_class,String name, Integer hit_points, Integer Endurance, Integer Parryng,
                    Integer type_of_damage, Integer damage, Integer ph_Immunity,
                    Integer M_imm,Integer speed,int x,int y, boolean team ,String state,
                    int max_hp) {
        super(name_of_class,name, hit_points, Endurance, Parryng, type_of_damage, damage, ph_Immunity,
                M_imm,speed,x,y,team,state,max_hp);
    }

    public spearman(String name, int x, int y){
        super("пиказавр",name,1000,140,1,200,35,
                60,10,60,x,y, false, Alive, 1000);
        super.name=name;
        this.x=x;
        this.y=y;

    }

    String team_name="Тим2";
    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        this.damage=140;

        // алгоритм стрельбы только во врагов

            if (this.hit_points <= 0) {
                System.out.println(name_of_class +
                        " по имени " + name + " из команды 2 уже чилит");
            } else
            {
                System.out.println("ход делает " + name_of_class +
                        " по имени " + name + " из команды " +
                        team_name+"_"+x+" "+y+"__ ");

                /** Поиск наиболее приближённого врага */
                double distanceToEnemy;
                double temp = 100;
                int nearIndex = 0;
                for (int i = 0; i < 10; i++) {
                    if (team2.get(i).hit_points>0) {
                        team2.get(i).get_info();
//                        System.out.println(this.x+"_"+
//                                this.y+"_"+
//                                team2.get(i).x+"_"+
//                                team2.get(i).y);
                        distanceToEnemy = pointer2d.Distance(
                                this.x,
                                this.y,
                                team2.get(i).x,
                                team2.get(i).y);
                        if (distanceToEnemy < temp) {
                            nearIndex = i;
                            temp = distanceToEnemy;
//                            System.out.println(distanceToEnemy);
                        }
                    }
                }

                if (this.x != team2.get(nearIndex).x ) {
                    this.x=team2.get(nearIndex).x;

                }
                else {
                    if (this.y>team2.get(nearIndex).y){
                        this.y -= 1;
                    }
                    else {
                        this.y+=1;
                    }

                }

//                System.out.println(nearIndex+"__-ni");


                distanceToEnemy = pointer2d.Distance(this.x,
                        this.y,
                        team2.get(nearIndex).x,
                        team2.get(nearIndex).y);
                System.out.println(distanceToEnemy);

                if (distanceToEnemy==1) {

                    if (this.Endurance >= 150) {
                        this.Ph_Immunity += 80;
                        this.M_Immunity += 80;
                    }
                    team2.get(nearIndex).hit_points =
                            team2.get(nearIndex).giveDamage(team2.get(nearIndex).hit_points,
                                    go_damage(this.damage,
                                            team2.get(nearIndex).
                                                    hit_points, team2.get(nearIndex).Parrying,
                                            team2.get(nearIndex).Ph_Immunity),
                                    team2.get(nearIndex).max_hp);

                    System.out.println("bang! ширанула " + team2.get(nearIndex).name_of_class +
                            " по имени " +
                            team2.get(nearIndex).name
                            + " ее хп- " + team2.get(nearIndex).hit_points+"\n");


                }
            }




    }
    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name);
    }
}
