package override
/**
 * Created by XizeTian on 2016/11/16.
 */
class CodeWithHeavierDependenciesExt extends CodeWithHeavierDependencies {
    def result

    int someAction() {
        25
    }

    def println(text) { result = text }
}
