package learn.spring5jokesapp.services

import guru.springframework.norris.chuck.ChuckNorrisQuotes
import org.springframework.stereotype.Service

@Service
class JokeServiceImpl : JokeService {

    private final val chuckNorrisQuotes:ChuckNorrisQuotes = ChuckNorrisQuotes()
    override fun getJoke(): String {
        return chuckNorrisQuotes.randomQuote
    }
}