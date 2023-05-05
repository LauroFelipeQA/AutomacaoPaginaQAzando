# Estudo Selenium com Java

 - usando Java JDK 8,
 - Criado feature "desconto.feature" com steps escritos em BDD, language pt.
 - Criado os steps na classe "Desconto" usando CUCUMBER. 
 - Usado Selenium webdriver e Junit(Asserts).
 - Criado classe runner "RunCucumberTest", declarado para executar com Cucumber.class, puxando "src/test/resources/features".

Atualização v1

- Criado BeforeClass e AfterClass na classe RunCucumberTest para instanciar o webdriver e fecha-lo após todos steps serem executados.
- driver do Chrome inicializado no BeforeClass
- A classe Desconto que contem os steps herda a classe RunCucumberTest para usar o webdriver driver instanciado nela.
- driver.quit() colocado no AfterClass

Atualização v2

- Aplicando pages objects, criado a classe HomePage dentro do package de pages, criado um construtor do tipo WebDriver e um metodo que acessa a pagina atraves do driver.
- Instanciado na classe de desconto um objeto "homepage" que recebe o construtor "driver", da classe HomePage, pois ela extente a RunCucumberTest que define que o driver é o ChromeDriver.
- Criado os metodos referentes aos steps na HomePage.
- Troca de funções nos steps por metodos da HomePage.
- Melhorado o metodo de preencherEmail, recebendo uma string de email para repassar para o driver pelo sendKeys.

Atualização v3

- Waitings (sleep pode não ser tão usual, da para usar o smartwait)
- Adicionando scroll que é um (js)