package kotlin.compliance

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ComplianceApplication

fun main(args: Array<String>) {
	runApplication<ComplianceApplication>(*args)
}
