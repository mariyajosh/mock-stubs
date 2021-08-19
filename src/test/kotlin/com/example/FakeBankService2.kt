package com.example

class FakeBankService2(val flag:Boolean):BankingService {
    override fun withdraw(amount: Int) {
       if(!flag){throw WithDrawnException()}
    }
}