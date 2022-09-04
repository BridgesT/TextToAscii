class Letters {
    //ivrit, small, standard, straight  https://www.messletters.com/en/big-text/
    companion object {
        private const val s: Char = '/'
        fun getA(): ArrayList<String> {
            return arrayListOf(
                "    $s$s$s    ",
                "   $s$s $s$s   ",
                "  $s$s   $s$s  ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ")
        }
        fun getB(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s  ")
        }
        fun getC(): ArrayList<String> {
            return arrayListOf(
                "  $s$s$s$s$s$s  ",
                " $s$s    $s$s ",
                " $s$s       ",
                " $s$s       ",
                " $s$s       ",
                " $s$s    $s$s ",
                "  $s$s$s$s$s$s  ")
        }
        fun getD(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s  ")
        }
        fun getE(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s ",
                " $s$s       ",
                " $s$s       ",
                " $s$s$s$s$s$s   ",
                " $s$s       ",
                " $s$s       ",
                " $s$s$s$s$s$s$s$s ")
        }
        fun getF(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s ",
                " $s$s       ",
                " $s$s       ",
                " $s$s$s$s$s$s   ",
                " $s$s       ",
                " $s$s       ",
                " $s$s       ")
        }
        fun getG(): ArrayList<String> {
            return arrayListOf(
                "  $s$s$s$s$s$s   ",
                " $s$s    $s$s  ",
                " $s$s        ",
                " $s$s   $s$s$s$s ",
                " $s$s    $s$s  ",
                " $s$s    $s$s  ",
                "  $s$s$s$s$s$s   ")
        }
        fun getH(): ArrayList<String> {
            return arrayListOf(
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ")
        }
        fun getI(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s ",
                "  $s$s  ",
                "  $s$s  ",
                "  $s$s  ",
                "  $s$s  ",
                "  $s$s  ",
                " $s$s$s$s ")
        }
        fun getJ(): ArrayList<String> {
            return arrayListOf(
                "       $s$s ",
                "       $s$s ",
                "       $s$s ",
                "       $s$s ",
                " $s$s    $s$s ",
                " $s$s    $s$s ",
                "  $s$s$s$s$s$s  ")
        }
        fun getK(): ArrayList<String> {
            return arrayListOf(
                " $s$s    $s$s ",
                " $s$s   $s$s  ",
                " $s$s  $s$s   ",
                " $s$s$s$s$s    ",
                " $s$s  $s$s   ",
                " $s$s   $s$s  ",
                " $s$s    $s$s ")
        }
        fun getL(): ArrayList<String> {
            return arrayListOf(
                " $s$s       ",
                " $s$s       ",
                " $s$s       ",
                " $s$s       ",
                " $s$s       ",
                " $s$s       ",
                " $s$s$s$s$s$s$s$s ")
        }
        fun getM(): ArrayList<String> {
            return arrayListOf(
                " $s$s     $s$s ",
                " $s$s$s   $s$s$s ",
                " $s$s$s$s $s$s$s$s ",
                " $s$s $s$s$s $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ")
        }
        fun getN(): ArrayList<String> {
            return arrayListOf(
                " $s$s    $s$s ",
                " $s$s$s   $s$s ",
                " $s$s$s$s  $s$s ",
                " $s$s $s$s $s$s ",
                " $s$s  $s$s$s$s ",
                " $s$s   $s$s$s ",
                " $s$s    $s$s ")
        }
        fun getO(): ArrayList<String> {
            return arrayListOf(
                "  $s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                "  $s$s$s$s$s$s$s  ")
        }
        fun getP(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s   ",
                " $s$s     $s$s  ",
                " $s$s     $s$s  ",
                " $s$s$s$s$s$s$s$s   ",
                " $s$s         ",
                " $s$s         ",
                " $s$s         ")
        }
        fun getQ(): ArrayList<String> {
            return arrayListOf(
                "  $s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s  $s$s $s$s ",
                " $s$s    $s$s  ",
                "  $s$s$s$s$s $s$s ")
        }
        fun getR(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s  ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s$s$s$s$s$s$s  ",
                " $s$s   $s$s   ",
                " $s$s    $s$s  ",
                " $s$s     $s$s ")
        }
        fun getS(): ArrayList<String> {
            return arrayListOf(
                "  $s$s$s$s$s$s  ",
                " $s$s    $s$s ",
                " $s$s       ",
                "  $s$s$s$s$s$s  ",
                "       $s$s ",
                " $s$s    $s$s ",
                "  $s$s$s$s$s$s  ")
        }
        fun getT(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ")
        }
        fun getU(): ArrayList<String> {
            return arrayListOf(
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                "  $s$s$s$s$s$s$s  ")
        }
        fun getV(): ArrayList<String> {
            return arrayListOf(
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                " $s$s     $s$s ",
                "  $s$s   $s$s  ",
                "   $s$s $s$s   ",
                "    $s$s$s    ")
        }
        fun getW(): ArrayList<String> {
            return arrayListOf(
                " $s$s      $s$s ",
                " $s$s  $s$s  $s$s ",
                " $s$s  $s$s  $s$s ",
                " $s$s  $s$s  $s$s ",
                " $s$s  $s$s  $s$s ",
                " $s$s  $s$s  $s$s ",
                "  $s$s$s  $s$s$s  ")
        }
        fun getX(): ArrayList<String> {
            return arrayListOf(
                " $s$s     $s$s ",
                "  $s$s   $s$s  ",
                "   $s$s $s$s   ",
                "    $s$s$s    ",
                "   $s$s $s$s   ",
                "  $s$s   $s$s  ",
                " $s$s     $s$s ")
        }
        fun getY(): ArrayList<String> {
            return arrayListOf(
                " $s$s    $s$s ",
                "  $s$s  $s$s  ",
                "   $s$s$s$s   ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ",
                "    $s$s    ")
        }
        fun getZ(): ArrayList<String> {
            return arrayListOf(
                " $s$s$s$s$s$s$s$s ",
                "      $s$s  ",
                "     $s$s   ",
                "    $s$s    ",
                "   $s$s     ",
                "  $s$s      ",
                " $s$s$s$s$s$s$s$s ")
        }
        fun getExclamation(): ArrayList<String> {
            return arrayListOf(
                " $s$s ",
                " $s$s ",
                " $s$s ",
                " $s$s ",
                " $s$s ",
                "    ",
                " $s$s ")
        }
        fun getQuestionMark(): ArrayList<String> {
            return arrayListOf(
                "    $s$s$s$s  ",
                "  $s$s   $s$s ",
                "  $s$s   $s$s ",
                "     $s$s   ",
                "     $s$s   ",
                "          ",
                "     $s$s   ")
        }
        fun getSpace(): ArrayList<String> {
            return arrayListOf(
                "           ",
                "           ",
                "           ",
                "           ",
                "           ",
                "           ",
                "           ")
        }
        fun getError(): ArrayList<String> {
            return arrayListOf(
                " ERRORERROR ",
                " ERRORERROR ",
                " ERRORERROR ",
                " ERRORERROR ",
                " ERRORERROR ",
                " ERRORERROR ",
                " ERRORERROR ")
        }
//        fun get(): ArrayList<String> {
//            return arrayListOf(
//              "  ",
//              "  ",
//              "  ",
//              "  ",
//              "  ",
//              "  ",
//              "  ")
//        }
    }

}