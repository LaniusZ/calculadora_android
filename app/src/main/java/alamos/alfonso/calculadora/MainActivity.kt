

    fun pressBtn2 (view: View) {
        var txt2: TextView = findViewById(R.id.txt2)

        txt2.text = txt2.text.toString() + "2"
    }

    fun pressBtnMas (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total += txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "+"
        txt2.text = ""
    }

    fun pressBtnEq (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total += txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "="
        txt2.text = total.toString()
    }

    fun pressBtnC (view: View) {
        var txt1: TextView = findViewById(R.id.txt1)
        var txt2: TextView = findViewById(R.id.txt2)

        total = 0

        txt1.text = ""
        txt2.text = ""
    }

}