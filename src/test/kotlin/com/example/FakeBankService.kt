package com.example
class BankService:BankingService {
    companion object{
    var Balance=10000
    }
    override fun withdraw(amount: Int){
       if(amount<= Balance){
           Balance-=amount
       }
       else {
           throw WithDrawnException("WithDrawn failed")
       }
    }
}