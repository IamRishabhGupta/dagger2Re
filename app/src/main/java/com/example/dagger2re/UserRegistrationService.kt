package com.example.dagger


import com.example.dagger2re.EmailService
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              private val emailService: EmailService
)
{

    fun register(email: String, password: String) {
        userRepository.saveuser(email, password)
        emailService.send(
            to = email,
            "rishabh9aug@gmail.com", "Hakuna matata", "This is a test email"
        )
    }
}
