package com.ground.zero.mergeadaptertest.data


class DataSource {

    val computers = mutableListOf<Computer>(
        Computer(0, "Z1"),
        Computer(1, "ENIAC"),
        Computer(2, "7090"),
        Computer(3, "LARC"),
        Computer(4, "Cray-2"),
        Computer(5, "Cray-1"),
        Computer(6, "Atlas")
    )

    val footer = mutableListOf<Footer>(
        Footer(0, "IBAN", "#C7EBEF"),
        Footer(1, "Adress", "#FE8441"),
        Footer(2, "Email", "#0082FC")
    )
}