/**
 * @author Vadym Doroshevych
 * @taskName Комментарии излишни
 */
package lvl_0.lecture8_2;

public class lvl0Lecture8_2 {
    public void task(){
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
