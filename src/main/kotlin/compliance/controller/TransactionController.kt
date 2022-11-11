package kotlin.compliance.controller

import org.springframework.web.bind.annotation.RestController
import kotlin.compliance.service.TransactionService

@RestController
class TransactionController(val transaction: TransactionService){

}