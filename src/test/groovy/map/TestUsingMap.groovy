package map

import expando.ClassWithDependency

/**
 * Created by XizeTian on 2016/11/18.
 */
class TestUsingMap extends GroovyTestCase {
    void testMethodA() {
        def text = ''
        def fileMock = [write: { text = it }]

        def testObj = new ClassWithDependency()
        testObj.methodA(1, fileMock)

        assertEquals("The value is 1.", text)
    }
}
