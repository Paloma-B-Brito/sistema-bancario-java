🏦 Banco (Java) — Projeto de estudo POO + MVC
Projeto simples de sistema bancário em Java, criado para praticar Programação Orientada a Objetos (POO) e organização em arquitetura MVC (Model, View, Controller).

Toda a interação do usuário é feita via terminal/console.

✅ Funcionalidades
--> Ver saldo: Consulta do valor atualizado na conta.

--> Depositar: Com validação de valor para impedir depósitos negativos.

--> Sacar: Com validação de valor e lançamento de exceção customizada para saldo insuficiente.

--> Tratamento de erros: Proteção contra entradas inválidas (ex.: letras digitadas no lugar de números).

--> Flexibilidade monetária: Aceita valores com ponto ou vírgula (ex.: 10.50 ou 10,50).

--> Estrutura MVC: Código totalmente organizado por pacotes.

🧱 Estrutura do projeto (MVC)
O projeto segue a divisão de responsabilidades do padrão MVC:

--> 📂 br.com.banco.model

- Regras de negócio e entidades.

- Exemplos: ContaBancaria.java, SaldoInsuficienteException.java

--> 📂 br.com.banco.view

- Interface de entrada/saída de dados no console.

- Exemplos: MenuBanco.java

--> 📂 br.com.banco.controller

- Controla o fluxo de dados entre a View e a Model.

- Exemplos: BancoController.java

--> 📂 br.com.banco.main

- Ponto de partida/inicialização da aplicação.

- Exemplos: App.java

📌 Regras de Negócio
Um resumo das validações tratadas pelo sistema para garantir a integridade da conta:

--> Depósitos só são aceitos se o valor for estritamente positivo.

--> Saques só são aceitos se o valor for positivo e houver saldo suficiente na conta.

--> Tentativas de sacar mais do que o disponível lançam a exceção SaldoInsuficienteException.

🛠️ Requisitos
--> Java 17 ou superior.

--> Opcional: Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code).

▶️ Como executar
--> Opção 1: Rodando pela IDE
Basta abrir o projeto na sua IDE e executar o método main localizado na classe:

- br.com.banco.main.App

--> Opção 2: Rodando pelo terminal (sem Maven/Gradle)
Nota: Certifique-se de estar na raiz do projeto. Ajuste src caso sua pasta de código-fonte tenha outro nome.

No Linux/macOS (Bash):

Bash
javac -d out $(find src -name "*.java")
java -cp out br.com.banco.main.App
No Windows (PowerShell):

PowerShell
$files = Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { $_.FullName }
javac -d out $files
java -cp out br.com.banco.main.App

🧪 Exemplo de Uso
Ao executar a aplicação, o sistema exibirá o seguinte menu iterativo no console:
------------------------------------------------------------------
                    =========================
                         BANCO JAVA MVC      
                    =========================
                    1. Ver Saldo
                    2. Depositar
                    3. Sacar
                    4. Sair
                    =========================
                    Escolha uma opção:
------------------------------------------------------------------

🚀 Próximos Passos (Roadmap)
Ideias para aprimorar o projeto no futuro:

- [ ] Extrato de transações (histórico detalhado de depósitos e saques).

- [ ] Suporte a múltiplas contas bancárias.

- [ ] Transferência de valores entre contas diferentes.

- [ ] Persistência de dados (salvar estado em arquivo .json, .txt ou Banco de Dados real).

🧾 Licença
Uso livre para fins de estudo e aprendizado pessoal.
