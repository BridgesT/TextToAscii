enum class Alphabet(letter: ArrayList<String>) {

    A(Letters.getA()),
    B(Letters.getB()),
    C(Letters.getC()),
    D(Letters.getD()),
    E(Letters.getE()),
    F(Letters.getF()),
    G(Letters.getG()),
    H(Letters.getH()),
    I(Letters.getI()),
    J(Letters.getJ()),
    K(Letters.getK()),
    L(Letters.getL()),
    M(Letters.getM()),
    N(Letters.getN()),
    O(Letters.getO()),
    P(Letters.getP()),
    Q(Letters.getQ()),
    R(Letters.getR()),
    S(Letters.getS()),
    T(Letters.getT()),
    U(Letters.getU()),
    V(Letters.getV()),
    W(Letters.getW()),
    X(Letters.getX()),
    Y(Letters.getY()),
    Z(Letters.getZ()),
    EXCLAMATION(Letters.getExclamation()),
    QUESTION(Letters.getQuestionMark()),
    ERROR(Letters.getError()),
    SPACE(Letters.getSpace());

    var letterList = letter

    fun printLetter(){
        letterList.forEach { line ->
            println(line)
        }
    }

    companion object {
        fun getArrayListFromSentence(sentence: String): MutableList<Alphabet> {
            val alphabetArray: MutableList<Alphabet> = ArrayList()
            sentence.forEach { char ->
                val temp =
                    when(char.lowercaseChar()) {
                        'a' -> A
                        'b' -> B
                        'c' -> C
                        'd' -> D
                        'e' -> E
                        'f' -> F
                        'g' -> G
                        'h' -> H
                        'i' -> I
                        'j' -> J
                        'k' -> K
                        'l' -> L
                        'm' -> M
                        'n' -> N
                        'o' -> O
                        'p' -> P
                        'q' -> Q
                        'r' -> R
                        's' -> S
                        't' -> T
                        'u' -> U
                        'v' -> V
                        'w' -> W
                        'x' -> X
                        'y' -> Y
                        'z' -> Z
                        '?' -> QUESTION
                        '!' -> EXCLAMATION
                        ' ' -> SPACE
                        else -> { ERROR}
                    }
                alphabetArray.add(temp)
            }
            return alphabetArray
        }
    }
}