import java.util.ArrayList;

public class mag extends magic_unit {


    public mag(String name_of_class, String name, Integer hit_points, Integer Endurance, Integer Parryng,
               Integer type_of_damage, Integer damage, Integer ph_Immunity, Integer M_imm,
               Integer magic_energy, Integer speed, int x, int y, boolean team, String state, int max_hp) {
        super(name_of_class, name, hit_points, Endurance, Parryng, type_of_damage,
                damage, ph_Immunity, M_imm, magic_energy, speed, x, y, team, state, max_hp);
    }

    public mag(String name, int x, int y) {
        super("маг", name, 250, 100, 0, 20,
                0, 0, 0, 300, 50, x, y, false, Alive,250);
        super.name = name;
        this.x = x;
        this.y = y;
    }

    Integer use_flameShot(Integer targerHP,  Integer Target_resisit, double t_parring, Integer damage) {
        double chance_parring = Math.random();
        System.out.println(t_parring);
        if (chance_parring > t_parring) {
            damage=damage + Target_resisit;
//           Если выбрашено число попадающее вероятность отражения-урон парируется
            targerHP = targerHP - damage ;
        }
        else {
            System.out.println("урон не прошел");
        }
        ;
        return targerHP;
    }

    @Override
    public void step(ArrayList<Person> team1, ArrayList<Person> team2) {
        System.out.println("ход делает " + name_of_class + " по имени " + name + " из команды 2");

        // алгоритм стрельбы только во врагов
        if (!this.team) {
            if (this.hit_points <= 0) {
                System.out.println("Этот герой мертв");
            }
            if (this.magic_energy <= 0) {
                System.out.println("отдохнуть бы а");
            } else {
                /** Поиск наиболее приближённого врага */
                double distanceToEnemy;
                double temp;
                temp = pointer2d.Distance(this.x, team1.get(0).x, this.y, team1.get(0).y);
                int nearIndex = 0;
                for (int i = 1; i < 10; i++) {
                    distanceToEnemy = pointer2d.Distance(this.x, team1.get(i).x, this.y, team1.get(i).y);
                    if (distanceToEnemy < temp) {
                        nearIndex = i;
                        temp = distanceToEnemy;
                    }
                }
                System.out.println(team1.get(nearIndex).Endurance);
                team1.get(nearIndex).hit_points = use_flameShot(
                        team1.get(nearIndex).hit_points,
                        team1.get(nearIndex).M_Immunity,
                        team1.get(nearIndex).Parrying,
                        this.damage);
                System.out.println("bang! КАСТАНУЛА по " + team1.get(nearIndex).name_of_class + " по имени " + team1.get(nearIndex).name
                        + " ее хп- " + team1.get(nearIndex).hit_points);
                magic_energy -= 100;
            }
        }


    }
}