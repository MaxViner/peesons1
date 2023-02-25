public class range_attakers extends Person{
    Integer bullet;

    Integer accuracy;



    public range_attakers(String class_name,String name, Integer hitPoints, Integer damage, Integer type_of_damage, Integer endurance, Integer parrying,
                          Integer phImmunity, Integer mImmunity, Integer bullet, Integer accuracy) {
        super(class_name,name,hitPoints,damage,endurance,parrying,type_of_damage,phImmunity,mImmunity);
        this.bullet=bullet;
        this.accuracy=accuracy;
        this.Type_of_damage=1;

    }


}
