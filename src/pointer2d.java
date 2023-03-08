
public class pointer2d {

        protected int x, y;

        public  pointer2d(int x, int y) {
            this.x = x;
            this.y = y;
        }


// *нахождение расстояния между персонажами */

        public static double Distance(int x_self,
                                      int y_self,
                                      int x_targ,
                                      int y_targ) {
            return Math.sqrt(Math.pow(x_self - x_targ, 2) + Math.pow(y_self - y_targ, 2));
        }

    }
