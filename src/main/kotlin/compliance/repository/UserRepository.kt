package kotlin.compliance.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import kotlin.compliance.entity.UserEntity

@Repository
interface UserRepository : JpaRepository<UserEntity, Long>