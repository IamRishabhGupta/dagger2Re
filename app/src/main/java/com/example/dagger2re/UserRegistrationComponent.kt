package com.example.dagger2re

import com.example.dagger.UserRegistrationService
import dagger.Component


@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService

}