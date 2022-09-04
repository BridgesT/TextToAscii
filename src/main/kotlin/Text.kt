fun main() {
    val sentenceAlphabetArray: ArrayList<Alphabet> = Alphabet.getArrayListFromSentence("ABCDEFGHIJKLMNOPQRSTUVWXYZ !?&") as ArrayList<Alphabet>
    val fullList: MutableList<String> = makeGiantArrayListByRows(sentenceAlphabetArray)
    printGiantList(fullList as ArrayList<String>)
}

fun printGiantList(fullList: ArrayList<String>) {
    fullList.forEach { line ->
        println(line)
    }
}

fun makeGiantArrayListByRows(letters: ArrayList<Alphabet>): MutableList<String> {

    val giantArrayList: MutableList<String> = ArrayList()
    var fullLine: String
    for(i in 0 until letters[0].letterList.size){
        fullLine = ""
        for(j in 0 until letters.size){
            fullLine += letters[j].letterList[i]
        }
        giantArrayList.add(fullLine)
    }
    return giantArrayList
}

