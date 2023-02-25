import java.util.ArrayList;

public class range_attakers extends Person{
    Integer bullet;

    Integer accuracy;



    public range_attakers(String class_name,String name, Integer hitPoints, Integer damage, Integer type_of_damage,
                          Integer endurance, Integer parrying,
                          Integer phImmunity, Integer mImmunity, Integer bullet, Integer accuracy, Integer speed,
                            int x, int y,boolean team) {
        super(class_name,name,hitPoints,damage,endurance,parrying,type_of_damage,phImmunity,mImmunity,speed,x,y,team);
        this.bullet=bullet;
        this.accuracy=accuracy;
        this.Type_of_damage=1;

    }

    @Override
   public void step(ArrayList<Person> team1, ArrayList<Person> team2){

   }


}
