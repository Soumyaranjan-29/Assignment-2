//Encapsulation
class BankAccount{
    private var balance:Double=0.0
    
    fun deposit(amount:Double){
        if(amount>0){
            balance+=amount
        }
        
    }

fun showbalance(){
    println("Balance=$balance")
}
}
fun main(){
    val account=BankAccount()
    account.deposit(500.0)
    account.showbalance()
}
