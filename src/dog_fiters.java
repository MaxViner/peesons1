public class dog_fiters extends Person {

    public dog_fiters(String class_name,
                      String name,
                      Integer hitPoints,
                      Integer damage,
                      Integer type_of_damage,
                      Integer endurance,
                      double Parrying,
                      Integer phImmunity,
                      Integer mImmunity,
                      Integer speed,int x, int y,
                      boolean team,
                      String state,
                      int max_hp) {
        super(class_name,
                name,
                hitPoints,
                damage,
                type_of_damage,
                endurance,
                Parrying,

                phImmunity,
                mImmunity,
                speed,
                x,
                y,
                team,
                state,
                max_hp);

        this.Type_of_damage=1;
        this.x=x;
        this.y=y;

    }


    @Override
    public String get_info() {
        return ("я - "+name_of_class+" меня звать "+name);
    }

}
