### Tarefa 008: Prática de Revisão de Código - 12/05/2023

Serão revisados os models, seguidos pelas exceções e em seguida pelas funções Utils.

<br>

### org.model.Cliente
##

Nesta classe existem muitas validações que poderiam ser substituídas se os atributos possuíssem o tipo de acordo com as regras de negócio da aplicação.

Por exemplo, utilização de enums para sexo, nacionalidade e estado civil.

Isso já limitaria a necessidade de sobrescrever o Setter do lombok. Ainda, não creio que utilizar o @Setter apenas para o nome não seja interessante.

Ainda, ao invés de implementar o construtor, existe a anotação @AllArgsConstructor do Lombok que permite utilizar um construtor que recebe todos os atributos do objeto.

<br>

### org.model.PremioSeguro
##

Nesta classe existe alguns problemas no método `ObtemPercentualDesconto`.

Neste método estão dispostos diversos `Nested If's`. Uma vez que os métodos de validação na classe útil lançam exceções no caso de valor inválido,
basta verificar os valores em sequência. Ainda, essa verificação talvez não seja verificada pois não é possível setar esses atributos no cliente se inválidos. Por último,
creio que atribuir os atributos do `Cliente` à variáveis não seja à melhor forma.

Creio que separar as verificações por métodos seria interessante. Por exemplo, se o `Cliente` for `masculino` existir um método `ObtemPercentualDescontoMasculino`.

Ainda, creio que a obtenção do percentual de desconto deva ser executada no construtor dessa classe.

Isso pois, no método de calcular o atributo é utilizado, se for nulo, irá gerar um `NullPointerException` que, se não tratado, pode gerar impactados na aplicação e sua execução.

### org.model.Teste
##

Não creio que seja uma classe necessária, pois os testes unitários devem tratar das outras classes e suas execuções.

<br>

### org.exception.*

Irei pontuar minhas considerações de todo este pacote.

As validações não devem lançar exceções em Runtime. Ainda, utilizar exceções sendo que as mensagens são setadas em seus lançamentos não faz sentido.

É mais sensato criar uma exceção para `AtributoInvalido` que o único parâmetro seja a mensagem. Conforme implementado, está redundante.

<br>

### org.util.*
##

Uma consideração geral, creio que retornar que o valor é válido nos métodos de validação não seja necessário. Isto pois, se as exceções não forem lançadas indica que os valores são válidos.

Ainda, creio que uma única classe com métodos estáticos seja necessário. Nesta estariam incluídos todos os métodos de validação necessário. Contudo, visando boas práticas, também é interessante a separação.

<br>

### org.util.CpfValidator
##

Existem APIs do Java 8 que permitem iterar e alterar os elementos no loop de formas mais simples. Utilizando stream é possível substituir os diversos `for loops` utilizados.

O uso de constantes permite identificar o significado dos valores utilizados. Existem alguns valores como 11 e 2 utilizados que não consigo identificar o sentido. Logo,
definir as constantes na classe utilizando `static final` permite dispor um significado ao valor.

<br>

### org.util.CpfValidatorRefactored
##

A separação das validações por método ficou excelente.

Contudo, creio que os `Nested If's` podem ser melhorados. Ainda, pontuo novamente o uso de streams em iterações.

<br>

### org.util.DataUtils
##

Creio que no método `validaIdade` não é necessário esperar duas datas. Isto pois a segunda data utilizada é a data atual. Logo, basta resgatar a data atual. Isto vale para outros métodos desta classe.

Existem APIs que permitem subtrair duas datas e resgatar o valor em dias. Logo, se esse valor for menor que 18*365 ou maior que 60*365, a idade é inválida.

<br>

### org.util.SexoValidator
### org.util.NacionalidadeValidator
### org.util.EstadoCivilValidator
##

Para estas classes, conforme pontuado anteriormente, basta criar enums para estes valores e, nos tipos de atributos do `Cliente` utilizá-los.
Isto irá impedir que tipos diferente dos enumerados sejam possíveis. Caso haja uma tentativa de atribuição inválida, uma exceção será lançada e deve ser tratada.

<br>

### org.util.PassaporteValidator
##

Um método apenas para validação de valor nulo não é necessário. Na API `Optional` existe um método que verifica se o valor é nulo e permite realizar ações caso não seja.



</DIV/>
