### Tarefa 006: Git Branching - 28/04/2023

1. Qual o nome do branch padrão do Git? 

Main

<br>

2. O que o comando **<code>git branch nome</code>** realiza? 

Cria uma nova branch com o `nome` especificado

<br>

3. Como criar um branch a partir de um commit específico? 

Basta utilizar o comando `checkout` juntamente com o comando `-b` que especifica a criação de uma branch e passar a hash do commit ou seja `git checkout -b nome_branch commit_hash`

<br>

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?

Cria e posiciona o git em um nova branch chamada `bugfix/234`

<br>

5. Qual o comando para se alternar para um branch de nome **experimento2**?

`git checkout experimento2`

<br>

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?

Lista as branchs do repositório e dispõe `b1`, por ser a corrente, em destaque

<br>

7. O que o comando **<code>git checkout -b</code>** nome faz?

Cria uma nova branch e a torna a corrente

<br>

8. Qual a função do <code>**comando git branch -d teste</code>**?

Delete a branch `teste`

<br>

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. 
Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. 
Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. 
Código que for criado para a experimentação existirá apenas no branch criado. 
Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, 
ou seja, no branch principal (master). Esta última ação é conhecida por merge. 
Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge 
empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: 

(a) criação de um ou mais branches; 

(b) chaveamento para pelo menos dois branches e 

(c) merge.

<code>git checkout -b development
git checkout -b bugfix/234
git add --all
git commit -m bugfix/234
git checkout development
git merge bugfix/234
git checkout master
git merge development
</code>

</DIV/>
