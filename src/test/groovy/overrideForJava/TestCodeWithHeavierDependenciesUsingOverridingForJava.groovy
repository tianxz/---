package overrideForJava
/**
 * Created by XizeTian on 2016/11/21.
 */
class TestCodeWithHeavierDependenciesUsingOverridingForJava extends GroovyTestCase {
    void testMethod() {
        def testObj = new ExtendJavaCode()

        def originalPrintStream = System.out
        def printMock = new PrintMock()
        System.out = printMock

        try {
            testObj.myMethod()
        } finally {
            System.out = originalPrintStream
        }

        assertEquals(35, printMock.result)
    }
}
