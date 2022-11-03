# spring-boot-observability

[5w1h](https://safetyculture.com/topics/5w1h/)
# Um guia abrangente para o método 5W1H
Este guia discutirá o método 5W1H: sua definição, origem e elementos. Aprenda como integrá-lo em suas práticas de negócios com um guia passo a passo.

## O que é o Método 5W1H?

O 5W1H é uma abordagem questionadora e um método de resolução de problemas que visa visualizar ideias de várias perspectivas - com o objetivo de obter uma compreensão profunda de uma situação específica. É comumente utilizado como um método de melhoria contínua do processo e realizado respondendo a todos os elementos básicos dentro de um problema que são o quê, quem, onde, quando, por que e como.
O 5W1H, também conhecido como método Kipling, é um conjunto de perguntas usado por Rudyard Kipling para responder extensivamente a perguntas existentes e desencadear ideias que possam contribuir para a resolução de um problema. O conceito acabou sendo incorporado às práticas de negócios para eliminar erros, aumentar a eficiência e agilizar os processos.
O método Kipling é semelhante a outros métodos de melhoria de processos, como a análise de causa raiz, o 5S Lean e o ciclo PDCA.

## Quais são as perguntas 5Ws e 1H?
Os elementos incluídos no método 5W1H permitem uma análise abrangente da situação apresentada e permitem identificar oportunidades de melhoria. 
Responder às perguntas 5Ws e 1H, e ser o mais detalhado possível, ajuda a identificar possíveis soluções que podem ser implementadas e observadas 
quanto à sua eficácia.

Eles podem ser colocados em ordem diferente, mas você deve garantir que as seguintes perguntas 5Ws e 1H sejam incluídas:

### What(o que) Happened ?

O elemento que deve descrever claramente a situação, o problema específico ou basicamente explicar o propósito do uso do método. 
Se possível, também deve indicar o objetivo geral para a implementação da solução que seria identificada.

### Who(Quem) was involved ?

Quem se refere às pessoas ou grupos específicos relevantes para o problema ou a situação. 
Deve incluir a pessoa que descobriu o problema, quem pode resolvê-lo e quem será responsável por implementar a solução possível.

### Where(Onde) did if Happen?

O elemento where deve conter a localização ou posição exata do problema reconhecido. 
Pode ser um local, uma instalação ou mesmo um determinado processo onde a solução será implementada.

### When(Quando) did if Happen?

Quando deve incluir todos os componentes da situação relativos a qualquer coisa relacionada a datas. 
Deve indicar o cronograma, prazo, duração ou quaisquer outros detalhes que possam ajudar na resolução do problema.

### Why(Por que) did if Happen?
Embora cada um deles seja vital para alcançar uma abordagem de questionamento eficaz, o porquê é provavelmente um dos elementos mais importantes do método 5W1H. 
Ele explica em detalhes o motivo e os objetivos por trás da necessidade de ação ou por que é necessário fazer o método 5W1H em primeiro lugar. 
Este último W também é frequentemente solicitado cinco vezes para descobrir a causa raiz da situação e evitar 
que ela se repita. Essa abordagem é chamada de análise dos 5 porquês.

### How(Quão) did if Happen?

Como, como último elemento do método, especifica as etapas de como o(s) plano(s) identificado(s) deve(m) ser executado(s). 
Deve incluir também todos os recursos, ferramentas, métodos, meios e até mesmo os gastos necessários para que o empreendimento seja eficaz.

Para resumir, fazer essas perguntas permite que aqueles que usarão o método 5W1H cheguem ao fundo das coisas, estruturando 
sistematicamente pensamentos e enfatizando informações importantes. 
Consequentemente, isso pode ajudar a reconhecer possíveis problemas e possíveis soluções relacionadas ao cenário.

### 5W1H e 5 Porquês

Os métodos de solução de problemas 5W1H e 5 Porquês podem ser usados alternadamente ou em conjunto. 
Esses métodos visam reconhecer os problemas existentes e abordá-los oferecendo soluções eficazes assim que as causas-raiz forem identificadas.

Sua principal diferença, no entanto, é que, enquanto o método 5W1H pede outros detalhes vitais como o que, quem, quando, onde e como, junto com o porquê, 
5 Porquês progressivamente detalha as razões por trás da situação até que a causa principal seja identificada. perguntando "por que" 5 vezes.

Se um cenário for muito complexo e exigir uma análise mais abrangente, usar esses dois juntos oferece uma chance maior de obter clareza ou solução 
para um problema.

Abaixo uma lista de Situações filtradas do texto Original  que considero que deve ser loga obrigatoriamente:
* Autenticações na Aplicação
* Acesso a sistemas Externos
* Alteração no estado da Aplicação
* Erro de disponibilidade
* Acessos indevidos a partes do Sistema

Para fechar e importante ter clareza sobre o nivel de log, que no final ficamos em 4 partes:

1. Error
2. Info
3. Debug
4. Trace

### Software Application Logging Aspects to Consider by Implementing Knowledge Management (Article)
[article](https://www.researchgate.net/publication/308568380_Software_Application_Logging_Aspects_to_Consider_by_Implementing_Knowledge_Management)

II. LOGGING ASPECTS A “log” is defined as a record of performance, events, or day-to-day activities by Meriam-Webster Dictionary

and as a regular or systematic record of incidents or observations by Oxford Dictionary.

This definitions are in compliance with the application logging that is used today in software development and maintenance 
where applications often need to log various messages representing conditions or events.

A log record is designed to help to analyze malfunctioning of the application’s behavior and to identify the part of application 
source code that leads to such an undesired behavior. Log files, originally meant for debugging purposes, 
may help to investigate what happened and how did it happen even without the repeated application starting if these logs include all 
needed information in their log entries. However, this is often not true, unfortunately. 

In the practice logs are often missing and omit critical details or in a lot of cases, application developers do not log much. 
Therefore, it is important to include logging in the design of software applications.  

When including logging in the software application development, it is important to decide upon what to log and how to log. 

The best logs tell you exactly what happened, when, where, and how. 

Every log entry should, if possible, log what happened, when it happened, who triggered the event, and why it happened. 

Resulting from these guidelines, a log entry should if possible always answer following questions: 

1. What did happen?  
2. When did it happen?  
3. Where did it happen?  
4. Who triggered the event?  
5. Who was involved?  
6. Why did it happen?   
7. What caused it to happen

