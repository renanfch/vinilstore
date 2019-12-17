package br.com.beblue.bluerecords.configuration.sistema.usecase

import br.com.beblue.bluerecords.core.repositorio.VendaRepositorio
import br.com.beblue.bluerecords.core.usecase.VendaUseCase
import br.com.beblue.bluerecords.core.usecase.VendaUseCaseImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class VendaUseCaseConfiguration {

    @Bean
    open fun loadUseCase(vendaRepositorio: VendaRepositorio): VendaUseCase =
        VendaUseCaseImpl(vendaRepositorio)

}