public class dog_fiters extends Person {

    public dog_fiters(String class_name,String name, Integer hitPoints, Integer damage, Integer type_of_damage, Integer endurance, Integer parrying,
                          Integer phImmunity, Integer mImmunity,Integer speed) {
        super(class_name,name,hitPoints,damage,endurance,parrying,type_of_damage,phImmunity,mImmunity,speed);

        this.Type_of_damage=1;

    }


    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name);
    }

}
