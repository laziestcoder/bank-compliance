package kotlin.compliance.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import kotlin.compliance.entity.Transactions

@Repository
interface TransactionsRepository : JpaRepository<Transactions, Long>