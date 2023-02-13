public class Person {

     String name_of_class;
     Integer hit_point; // здоровье

   Integer Endurance; // выносливость

    Integer Parrying; //возможность уклониться от урона

    short Type_of_damage; //тип урона 1-фиг 0-маг

    Integer damage; // наносимый урон


    Integer Ph_Immunity; // физ_защита=снижение физического урона

   Integer M_Immunity; // маг_защита=снижение маг-го урона


    // урон_хп до __тип урона____защита__хп до___ вероятность парирования
    Integer go_damage(Integer damage,Integer before_hp, Integer resist, Integer parrying){
        int hp_after = before_hp+resist - damage * (1 - parrying);
        return hp_after;
    }
    Integer incr_Edurance(Integer Edurance_before,Integer expenses ){
        Integer Ed_after=Edurance_before-expenses;
        return Ed_after;
    }

     void get_info(){
        System.out.println(name_of_class);
        System.out.println(String.format(" класс - %s \n" +
                                        " тип урона = %s \n"     +
                                        " урон = %d \n "        +
                                        "веротность уклонения =  %d \n" +
                                        " Hp =  %d \n"+
                                        " выносливость =  %d \n" +
                                        " защита = %d \n" +
                                        " защита от магии = %d \n"
                ,name_of_class,Type_of_damage,damage, hit_point,Endurance,Parrying,Ph_Immunity,M_Immunity));
     }








}




//Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
// Для каждого сформировать список свойств и возможных действий.
// Напрнимер свойство скорость, действие нанести удар.
// Проанализировать получившиеся свойства и действия персонажей и создать
// Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей.
// Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
// В основной программе создать по одному экземпляру каждого типа персонажей.