package com.api.conca.Controller

import com.api.conca.Configuration.TokenUtils
import com.api.conca.Service.UserService
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView

data class JWTRequest(val username:String,val password:String)
data class JWTResponse(val token:String,val userId:Long?,val username:String?)

@RestController
@RequestMapping
class ApiController(val userService: UserService,val bcryptEncoder: PasswordEncoder){

    @Autowired
    private lateinit var jwtTokenUtil: TokenUtils
    companion object{
        private val logger = LoggerFactory.getLogger(ApiController::class.java)
    }

   @GetMapping
   fun modalAndWiew(): Any {
           val modelAndView = ModelAndView("conca_api")
           modelAndView.addObject("message", "Welcome to our API gateway")
           return modelAndView
   }

   @PostMapping("/authentication")
   fun authentication(@RequestBody  authentication:JWTRequest):JWTResponse{
    try {
        logger.info("Authentication : $authentication")
        userService.loadUserByUsernameAndPassword(authentication.username,authentication.password).let { user->
            val token=jwtTokenUtil.createToken(user.businesssubject.businessname, user.username)
            return JWTResponse(token,
                    user.id,
                    user.username)
        }
    }catch (e:Exception){
        logger.error("ERROR: ${e.message}")
        throw Exception(e.message)
    }
   }

}
