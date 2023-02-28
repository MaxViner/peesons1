import java.util.ArrayList;

public class arrrowman extends range_attakers{

    public arrrowman(String name_class,String name,Integer Type_of_damage,Integer damage, Integer hit_point,Integer Endurance,
                    Integer Parrying,Integer Ph_Immunity,Integer M_Immunity, Integer bullet, Integer accuracy,Integer speed,
                     int x, int y,boolean team,String state,int max_hp)
    {
        super(name_class,name,damage,hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity,Type_of_damage,
                bullet,accuracy,speed,x,y, team,state,max_hp);
    }

    String team_name;


    public arrrowman(String name,int x,int y){
        super("арбалетор",name,250,100,1,150,
                5,20,20,30,72,55,x,y,true,Alive,250);
        super.name=name;
        this.x=x;
        this.y=y;
        if (team){
            team_name="тим1";
        }
    }
    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2){
        System.out.println("ход делает "+name_of_class+" по имени "+ name+ " из команды "+team_name);

        // алгоритм стрельбы только во врагов
        if (this.team) {
            if (this.hit_points <= 0) { System.out.println("Этот герой мертв"); }
            if (this.bullet <= 0) {     System.out.println("У этого героя нет стрел"); }
            else {
                /** Поиск наиболее приближённого врага */
                double distanceToEnemy;
                double temp = pointer2d.Distance(this.x, team2.get(0).x, this.y, team2.get(0).y);
                int nearIndex = 0;
                for (int i = 1; i < 10; i++) {
                    distanceToEnemy = pointer2d.Distance(this.x, team2.get(i).x, this.y, team2.get(i).y);
                    if (distanceToEnemy < temp) {
                        nearIndex = i;
                        temp = distanceToEnemy;
                    }
                }
                team2.get(nearIndex).hit_points = go_damage(100 ,team2.get(nearIndex).hit_points,team2.get(nearIndex).Parrying, team2.get(nearIndex).Ph_Immunity );
                System.out.println("bang! шмальнула по "+team2.get(nearIndex).name_of_class+" по имени "+ team2.get(nearIndex).name
                +" ее хп- "+team2.get(nearIndex).hit_points);
                bullet = bullet - 1;
            }
        }
        Double distanceToFarmer;
        Double temp = pointer2d.Distance(this.x, team1.get(0).x, this.y, team1.get(0).y);

        for (int i = 1; i < 10; i++) {

            if (team1.get(i).name_of_class=="крестьянин") {
                distanceToFarmer = pointer2d.Distance(this.x, team1.get(i).x, this.y, team1.get(i).y);

                  if (team1.get(i).state== Farmer.free)
                System.out.println("нашла крестьтяночку по имени - "+team1.get(i).name+
                        " расстояние до нее " +distanceToFarmer+" она сейчас -"+ team1.get(i).state);
                bullet+=1;
                team1.get(i).state=Farmer.busy;

                System.out.println("теперь у меня "+bullet+ " стрел");
                break;
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
