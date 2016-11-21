package groovyMockLibrary.MockFor

import expando.ClassWithDependency

/**
 * Created by XizeTian on 2016/11/18.
 */
class TestUsingMockFor extends GroovyTestCase {
    void testMethodC() {
        def testObj = new ClassWithDependency()

        def fileMock = new groovy.mock.interceptor.MockFor(java.io.FileWriter)
        def text
        fileMock.demand.write { text = it.toString() }
        fileMock.demand.close {}

        fileMock.use {
            testObj.methodC(1)
        }

        assertEquals "The value is 1.", text
    }
}
