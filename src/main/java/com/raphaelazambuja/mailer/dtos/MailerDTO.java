package com.raphaelazambuja.mailer.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailerDTO {
    @NotBlank(message = "O assunto é obrigatório")
    @Size(max = 100, message = "O assunto deve ter no máximo 100 caracteres")
    private String subject;

    @NotBlank(message = "O corpo do email é obrigatório")
    @Size(max = 2000, message = "O corpo do email deve ter no máximo 2000 caracteres")
    private String text;
}
