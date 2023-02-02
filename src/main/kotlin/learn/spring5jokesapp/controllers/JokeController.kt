package learn.spring5jokesapp.controllers

import learn.spring5jokesapp.services.JokeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class JokeController(@Autowired private val jokeService:JokeService){
    @RequestMapping(method = [RequestMethod.GET], path = ["/"])
    fun showJoke(model: Model):String{
        model.addAttribute("joke", jokeService.getJoke())
        return "index"
    }
}