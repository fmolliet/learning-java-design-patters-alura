# Command Pattern

O padrão de projetos Command é, provavelmente, um dos que mais gera confusão, principalmente no mundo de desenvolvimento web em geral, já que alguns conceitos mais específicos pro mundo da web surgiram e são diferentes dos existentes em aplicações desktop.

Para você entender melhor sobre o padrão Command "original" (definido no livro da GoF), você pode dar uma olhada nesse link: https://refactoring.guru/design-patterns/command.

Também é muito interessante o estudo de alguns padrões de arquitetura de software, como Domain Driven Design e Clean Architecture, pois você vai esbarrar no padrão de Command Handlers (que foi aplicado de forma bem simples nesta aula).

## Nesta aula, aprendemos:

- Que um caso de uso em nossa aplicação pode ter várias ações (salvar no banco, enviar e-mail, etc);
- Que um caso de uso deve ser extraído para uma classe específica, ao invés de estar no arquivo da CLI, controller ou algo do tipo;
- Que a técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command;
- A diferença do padrão Command da GoF para o padrão que utiliza Command Handler (muito utilizado no padrão de arquitetura Domain Driven Design).