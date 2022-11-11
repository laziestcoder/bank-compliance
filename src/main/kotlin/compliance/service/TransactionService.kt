package kotlin.compliance.service

interface TransactionService {
    fun addMoney(userId: Long, fromAcct: String, toAcct: String, amount: Double, remarks: String): Boolean
}