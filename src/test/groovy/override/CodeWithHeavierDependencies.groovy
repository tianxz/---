package override
/**
 * Created by XizeTian on 2016/11/16.
 */
class CodeWithHeavierDependencies {
    public void myMethod() {
        def value = someAction() + 10
        println(value)
    }

    int someAction() {
        Thread.sleep(5000)

        return Math.random() * 100
    }
}
