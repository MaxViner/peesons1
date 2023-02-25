import java.util.Random;

public class Person implements game_interfuck {


    String name_of_class;
     String name;
     Integer hit_points; // здоровье

   Integer Endurance; // выносливость

    Integer Parrying; //возможность уклониться от урона

    Integer  Type_of_damage; //тип урона 1-фиг 0-маг

    Integer damage; // наносимый урон


    Integer Ph_Immunity; // физ_защита=снижение физического урона

   Integer M_Immunity; // маг_защита=снижение маг-го урона

    public Person(String name_of_class, String name ,Integer hit_points,Integer Endurance, Integer Parryng, Integer type_of_damage,Integer damage,
                  Integer ph_Immunity, Integer M_imm){
        this.name_of_class=name_of_class;
        this.name=name;
        this.hit_points = hit_points;
        this.Endurance = Endurance;
        this.Parrying = Parryng;
        this.Type_of_damage = type_of_damage;
        this.damage=damage;
        this.Ph_Immunity=ph_Immunity;
        this.M_Immunity=M_imm;
    }



    // урон_хп до __тип урона____защита__хп до___ вероятность парирования
    Integer go_damage(Integer damage,Integer before_hp, Integer resist, Integer parrying){
        int hp_after = before_hp+resist - damage * (1 - parrying);
        return hp_after;
    }
    Integer incr_Edurance(Integer Edurance_before,Integer expenses ){
        Integer Ed_after=Edurance_before-expenses;
        return Ed_after;
    }

    @Override
    public void step() {

    }

    void get_all_info(){
        System.out.println(name_of_class);
        System.out.println(String.format(" класс - %s \n" +
                                        " тип урона = %s \n"     +
                                        " урон = %d \n "        +
                                        "веротность уклонения =  %d \n" +
                                        " Hp =  %d \n"+
                                        " выносливость =  %d \n" +
                                        " защита = %d \n" +
                                        " защита от магии = %d \n"
                ,name_of_class,Type_of_damage,damage, hit_points,Endurance,Parrying,Ph_Immunity,M_Immunity));
     }



    @Override
    public void get_info() {
        System.out.println("я - "+name_of_class+" меня звать "+name);
    }
}




//    Доработать дерево классов так, чтобы экземпляры классов создавались конструктором с именем в параметре а остальные параметры инициализировали сами в зависимости от персонажа.
//        Добавить файл интерфейса в котором описать два метода, void step(); и String getInfo();
//        Добавить реализацию интерфейса в ваш коренной абстрактный класс. Переопределить getInfo так,
//        чтобы он возвращал строки:"Я крестьянин", "Я снайпер" и так далее в зависимости от типа персонажа.
//        В основном классе создать список и добавить в него 10 случаных персонажей.
//        Пройти по списку и вывести строку возвращаемую getInfo.