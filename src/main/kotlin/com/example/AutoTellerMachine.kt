package com.example

import java.lang.Exception

class AutoTellerMachine(private val printer: Printer, private val bankService:BankingService){
    fun withdraw(amount: Int) {
        try {
            bankService.withdraw(amount)
            printer.print("WithDraw Successfully")
        }
        catch (e:Exception){
            printer.print("WithDraw failed")
        }
    }


}