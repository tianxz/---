package expando

/**
 * Created by XizeTian on 2016/11/18.
 */
class HandTossedFileMock {
    def result

    def write(value) { result = value }
}
