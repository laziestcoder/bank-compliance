package kotlin.compliance.entity

import javax.persistence.*

@Entity
@Table
class TransactionType(
    @Id val id: String, @Column(name = "trans_type") val transType: String, @OneToMany val trans: Set<Transactions>
)