package groovyMockLibrary.MockFor

import groovy.mock.interceptor.MockFor

/**
 * Created by XizeTian on 2016/11/18.
 */
class TwoFileUserTest extends GroovyTestCase {
    void testUserFiles() {
        def testObj = new TwoFileUser()
        def testData = 'Multi files'

        def fileMock = new groovy.mock.interceptor.MockFor(java.io.FileWriter)
        fileMock.demand.write() { assertEquals(testData, it) }
        fileMock.demand.write() { assertEquals(testData.size(), it) }
        fileMock.demand.close(2..2) {}
        fileMock.use {
            testObj.useFiles(testData)
        }
    }

    void testSomeWriter() {
        def testObj = new TwoFileUser()
        def params = ['one', 'two', 3, 'utf-8']
        def index = 0
        def fileMock = new MockFor(FileWriter)
        fileMock.demand.write(3..3) { assert it == params[index++] }
        fileMock.demand.flush() {}
        fileMock.demand.getEncoding() { params[4] }
        fileMock.demand.write() { assert it == params[4] }
        fileMock.demand.close() {}
        fileMock.use {
            testObj.someWriter()
        }
    }

    void tearDown() {
        new File('output1.txt').delete()
        new File('output2.txt').delete()

        new File('output3.txt').delete()
    }
}