fun box() {
    for (x in arrayOf(1, 2, 3)) {
        println(x)
    }

    for (x in 1..10) {
        println(x)
    }

    for (x in listOf(1, 2, 3)) {
        println(x)
    }

    val xs = listOf(1, 2, 3)
    for (x in xs.indices) {
        println(x)
    }
}

// LINES: 2 10 15 2 2 2 3 6 6 7 10 10 10 11 14 15 15 15 15 15 15 16