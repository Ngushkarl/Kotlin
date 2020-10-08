fun getFileSystem():FileSystem{
    return MemoryFileSystem(listOf("path/to/file", "another/path"), "file-contents-go-here")
}
fun main(){
val  fileSystem:FileSystem= getFileSystem()
    fileSystem.readDir()
    println(fileSystem.readDir())
    fileSystem.readFile()
    println(fileSystem.readFile())
}
interface FileSystem{
fun readDir():List<String>
    fun readFile():String
}

class Fat32FileSystem():FileSystem{
    override fun readDir(): List<String> {
        return emptyList()
    }

    override fun readFile(): String {
        return ""
    }
}

class ExtFileSystem:FileSystem{
    override fun readDir(): List<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun readFile(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class MemoryFileSystem(val files:List<String>,val fileContents: String):FileSystem{
    override fun readDir(): List<String> {
        return files
    }

    override fun readFile(): String {
        return fileContents
    }

}