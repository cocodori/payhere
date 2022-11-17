package payhere.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PayhereCoreApplication

fun main(args: Array<String>) {
    runApplication<PayhereCoreApplication>(*args)
}
