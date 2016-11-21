package expando
/**
 * Created by XizeTian on 2016/11/18.
 */
class ClassWithDependency {
    def methodA(val, file) {
        file.write "The value is ${val}."
    }

    def methodB(val) {
        def file = new java.io.FileWriter("output.txt")
        file.write "The value is ${val}."
    }

    def methodC(val) {
        def file = new java.io.FileWriter("output.txt")
        file.write "The value is ${val}."
        file.close()
    }
}