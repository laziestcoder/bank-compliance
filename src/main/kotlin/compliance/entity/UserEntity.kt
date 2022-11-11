package kotlin.compliance.entity

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "user")
class UserEntity(
    @Id val id: Long, val name: String, val custId: String, val acctNo: String, @OneToMany val trans: List<Transactions>
)