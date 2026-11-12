package com.proyecto.portafolio.petpass.security;

import com.proyecto.portafolio.petpass.models.User;

public interface CurrentUserProvider {
    User getCurrentUser();
}
