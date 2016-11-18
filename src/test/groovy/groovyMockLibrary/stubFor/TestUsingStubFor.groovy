package groovyMockLibrary.stubFor

import expando.ClassWithDependency

/**
 * Created by XizeTian on 2016/11/18.
 */
class TestUsingStubFor extends GroovyTestCase {
    void testMethodB() {
        def testObj = new ClassWithDependency()

        def fileMock = new groovy.mock.interceptor.StubFor(java.io.FileWriter)
        def text
        fileMock.demand.write { text = it.toString() }
        fileMock.demand.close {}

        fileMock.use {
            testObj.methodB(1)
        }

        assertEquals "The value is 1.", text
    }
}