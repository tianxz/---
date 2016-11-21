package groovyMockLibrary.MockFor

/**
 * Created by XizeTian on 2016/11/18.
 */
class TwoFileUser {
    def useFiles(str) {
        def file1 = new java.io.FileWriter("output1.txt")
        def file2 = new java.io.FileWriter("output2.txt")
        file1.write str
        file2.write str.size()
        file1.close()
        file2.close()
    }

    def someWriter() {
        def file = new FileWriter('output3.txt')
        file.write('one')
        file.write('two')
        file.write(3)
        file.flush()
        file.write(file.getEncoding())
        file.close()
    }
}