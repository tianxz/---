package categories

import override.CodeWithHeavierDependencies

/**
 * Created by XizeTian on 2016/11/18.
 */
class TestUsingCategories extends GroovyTestCase {
    void testMyMethod() {
        def testObj = new CodeWithHeavierDependencies()

        use(MockHelper) {
            testObj.myMethod()

            assertEquals 35, MockHelper.result
        }
    }
}
