package com.goberp.middlewaresiim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class WebServiceApplication {
    // Endpoint para el login
    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Lógica de autenticación
        if ("usuario".equals(username) && "contraseña".equals(password)) {
            return "¡Inicio de sesión exitoso!";
        } else {
            return "Error de inicio de sesión. Credenciales incorrectas.";
        }
    }

    // Endpoint para obtener las deudas
    @GetMapping("/deudas")
    public String getDeudas() {
        // Lógica para obtener las deudas del usuario
        return "Lista de deudas: [deuda1, deuda2, deuda3]";
    }

    // Endpoint para pagar las deudas
    @PostMapping("/pagar")
    public String pagarDeudas(@RequestParam String deuda) {
        // Lógica para pagar la deuda especificada
        return "Deuda pagada: " + deuda;
    }
}
