package com.example
class FakeBankService: BankingService{
    companion object{
    var Balance=10000
    }
    override fun withdraw(amount: Int){
       if(amount!=0 && amount<= Balance){
           Balance -=amount
       }
       else {
           throw WithDrawnException()
       }
    }
}