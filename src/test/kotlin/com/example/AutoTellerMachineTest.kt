package com.example


import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify


class AutoTellerMachineTest: StringSpec({


    val atm=AutoTellerMachine(FakePrinter(),FakeBankService())

    "should print a receipt if money is withdrawn successfully" {
        atm.withdraw(1000)
        FakePrinter.message shouldBe "WithDraw Successfully"
        FakeBankService.Balance shouldBe 9000
    }

    "should throw the exception when withdrawing the money is 0"{
        atm.withdraw(0)
        FakePrinter.message shouldBe "WithDraw failed"
    }

    "should throw the exception when withdrawing the money which is greater than Bank balance "{
        atm.withdraw(100000)
        FakePrinter.message shouldBe "WithDraw failed"
    }

    "should throw the exception when withdrawing the money which is greater than Bank balance2 "{
        val atm2=AutoTellerMachine(FakePrinter(), FakeBankService2(false))
        atm2.withdraw(100000)
        FakePrinter.message shouldBe "WithDraw failed"
    }
    val f= mockk<Printer>()
    val fbs= mockk<BankingService>()
    val atm2=AutoTellerMachine(FakePrinter(),FakeBankService())


})