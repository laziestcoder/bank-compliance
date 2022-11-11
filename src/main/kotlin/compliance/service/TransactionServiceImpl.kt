package kotlin.compliance.service

import org.springframework.stereotype.Service
import kotlin.compliance.entity.Transactions
import kotlin.compliance.repository.TransactionsRepository
import kotlin.compliance.repository.UserRepository

@Service

class TransactionServiceImpl(val transactionRepository: TransactionsRepository, val userRepo: UserRepository) :
    TransactionService {


    override fun addMoney(userId: Long, fromAcct: String, toAcct: String, amount: Double, remarks: String): Boolean {

        // Transaction Model Mapper
        transactionModelMapper(userId, fromAcct, toAcct, amount, remarks)
        // Saving Transaction Repository
        return transactionRepository.save()
    }

    fun transactionModelMapper(
        userId: Long, fromAcct: String, toAcct: String, amount: Double, remarks: String
    ): Transactions? {

        val user = userRepo.findById(userId)
        if (user.isPresent)
            return Transactions(
                null,
                user.get(),
                fromAcct,
                amount,
                toAcct,
                remarks,
                null,
                "SUCCESS",
                "test transaction",
                user.get().id,
                null
            )
        else
            return null

    }


}