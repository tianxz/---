package overrideForJava

/**
 * Created by XizeTian on 2016/11/21.
 */
class PrintMock extends PrintStream {
    def result

    PrintMock() {
        super(System.out)
    }

    void println(int text) {
        result = text
    }
}
