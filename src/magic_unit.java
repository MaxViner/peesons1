public class magic_unit extends Person
{
    Integer magic_energy;





    public magic_unit(String class_name,String name, Integer hitPoints, Integer damage, Integer type_of_damage, Integer endurance, Integer parrying,
                          Integer phImmunity, Integer mImmunity, Integer magic_energy,Integer speed) {
        super(class_name,name,hitPoints,damage,endurance,parrying,type_of_damage,phImmunity,mImmunity,speed);

        this.magic_energy=magic_energy;
        this.Type_of_damage=0;

    }


}
