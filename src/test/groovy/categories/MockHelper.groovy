package categories

import override.CodeWithHeavierDependencies

/**
 * Created by XizeTian on 2016/11/18.
 */
class MockHelper {
    def static result

    def static println(self, text) {
        result = text
    }

    def static someAction(CodeWithHeavierDependencies self) {
        25
    }
}
