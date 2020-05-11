/* -----------------------------------
 * Author: Davoleo
 * Date / Hour: 18/03/2020 / 21:22
 * Class: ObjectKey
 * Project: JavaBase
 * Copyright - © - Davoleo - 2020
 * ----------------------------------- */

package generics;

/**
 * Example Generic Class
 * @param <O> The Class of the Object Key
 */
public class Box<O> {

    private O object;

    public O getObject() {
        return object;
    }

    public void setObject(O object) {
        this.object = object;
    }

    //Bounded Type Params
    public <N extends Number> void inspect(N n) {
        System.out.println("T: " + object.getClass().getName());
        System.out.println("N: " + n.getClass().getName());
    }
}