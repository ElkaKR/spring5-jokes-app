package learn.spring5jokesapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Spring5JokesAppApplication

fun main(args: Array<String>) {
    runApplication<Spring5JokesAppApplication>(*args)
}
