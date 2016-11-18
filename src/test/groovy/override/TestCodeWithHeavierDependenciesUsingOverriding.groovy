package override

import override.CodeWithHeavierDependenciesExt

/**
 * Created by XizeTian on 2016/11/16.
 */
class TestCodeWithHeavierDependenciesUsingOverriding extends GroovyTestCase {
    void testMyMethod(){
        def testObj = new CodeWithHeavierDependenciesExt()

        testObj.myMethod()

        assertEquals 35, testObj.result
    }
}
