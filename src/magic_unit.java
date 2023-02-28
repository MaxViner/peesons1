public class magic_unit extends Person
{
    Integer magic_energy;





    public magic_unit(String name_of_class,
                      String name,
                      Integer hitPoints,
                      Integer damage,
                      Integer type_of_damage,
                      Integer endurance,

                      double parrying,

                      Integer phImmunity,
                      Integer mImmunity,
                      Integer magic_energy,
                      Integer speed,int x,int y,
                      boolean team,String state,
                      int max_hp) {
        super(name_of_class, name, hitPoints, damage,type_of_damage, endurance,parrying,phImmunity,
                mImmunity,speed,x,y,team,state,max_hp);

        this.magic_energy=magic_energy;
        this.Type_of_damage=0;


    }


}
