import java.util.ArrayList;

public class arrrowman extends range_attakers{

    public arrrowman(String name_class,String name,Integer Type_of_damage,Integer damage, Integer hit_point,Integer Endurance,
                    Integer Parrying,Integer Ph_Immunity,Integer M_Immunity, Integer bullet, Integer accuracy,Integer speed,
                     int x, int y,boolean team)
    {
        super(name_class,name,damage,hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity,Type_of_damage,
                bullet,accuracy,speed,x,y, team);
    }
    public arrrowman(String name,int x,int y){
        super("арбалетор",name,250,100,1,150,
                5,20,20,30,72,55,x,y,true);
        super.name=name;
        this.x=x;
        this.y=y;
    }
    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2){
        // алгоритм стрельбы только во врагов
        if (this.team == true) {
            if (this.hit_points <= 0) { System.out.println("Этот герой мертв"); }
            if (this.bullet <= 0) {     System.out.println("У этого героя нет стрел"); }
            else {
                /** Поиск наиболее приближённого врага */
                Double distanceToEnemy;
                Double temp = pointer2d.Distance(this.x, team2.get(0).x, this.y, team2.get(0).y);
                Integer nearIndex = 0;
                for (int i = 1; i < 10; i++) {
                    distanceToEnemy = pointer2d.Distance(this.x, team2.get(0).x, this.y, team2.get(0).y);
                    if (distanceToEnemy < temp) {
                        nearIndex = i;
                        temp = distanceToEnemy;
                    }
                }
                go_damage(100 ,team2.get(nearIndex).hit_points, team2.get(nearIndex).Ph_Immunity);
                System.out.println("bang!");
                bullet = bullet - 1;
            }
        }
        Double distanceToFarmer;
        Double temp = pointer2d.Distance(this.x, team1.get(0).x, this.y, team1.get(0).y);

        for (int i = 1; i < 10; i++) {

            if (team1.get(i).name_of_class=="крестьянин") {
                distanceToFarmer = pointer2d.Distance(this.x, team1.get(0).x, this.y, team2.get(0).y);
                System.out.println(distanceToFarmer);
                bullet+=1;
            }
        }
//        if (this.team == false) {
//            if (this.hit_points <= 0) { System.out.println("Этот герой мертв"); }
//            if (this.bullet <= 0) {     System.out.println("У этого героя нет стрел"); }
//            else {
//                /** Поиск наиболее приближённого врага */
//                Double distanceToEnemy;
//                Double temp = pointer2d.Distance(this.x, team1.get(0).x, this.y, team1.get(0).y);
//                Integer nearIndex = 0;
//                for (int i = 1; i < 10; i++) {
//                    distanceToEnemy = pointer2d.Distance(this.x, team1.get(0).x, this.y, team1.get(0).y);
//                    if (distanceToEnemy < temp) {
//                        nearIndex = i;
//                        temp = distanceToEnemy;
//                    }
//                }
//                giveDamage(team1.get(nearIndex));
//                bullet = bullet - 1;
//            }
//        }
    }

    @Override
    public String get_info() {
        return ("я - стреляю точно в цель "+name_of_class+" "+name);

    }
}
