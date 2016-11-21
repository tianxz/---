package overrideForJava;

/**
 * Created by XizeTian on 2016/11/21.
 */
public class JavaCodeWithHeavierDependencies {
    public int someAction() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        return (int) (Math.random() * 100);
    }

    public void myMethod() {
        int value = someAction() + 10;
        System.out.println(value);
    }
}
