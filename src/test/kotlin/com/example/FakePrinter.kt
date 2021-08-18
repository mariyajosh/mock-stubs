package com.example

class FakePrinter: Printer {
    companion object{
        var message =""
    }
    override fun print(text: String) {
        message =text
    }
}