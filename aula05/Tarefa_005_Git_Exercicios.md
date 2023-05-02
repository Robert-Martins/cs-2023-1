### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?

git version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help `Comando de assistência ao usuário, dispõe possíveis fluxos para uso`
  
  b. git help checkout `Dispõe possíveis usabilidades do comando checkout`
  
  c. git help merge `Dispõe possíveis usabilidades do comando merge`
  
  d. git init  `Inicializa um novo repositório`
  
  e. git add --all `Adiciona todos os arquivos com alterações para staging`
  
  f. git add -u `Adiciona os arquivos editados e que são monitorados pelo  Git`
  
  g. git config -l `Lista todos as configurações do usuário em questão`
  
  h. git mv a.txt b.txt ` O comando é usado para renomear arquivos como a.txt para b.txt`
  
  i. git reset --hard ` Reset os commit, passando a exibir o último commit `
  
  j. git log -27 `Exibe os últimos 27 commits.`
 
3. O fluxo “clássico” de interação com o Git é algo como 
“alterar um ou mais arquivos”, 
“acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. 
Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?

<code>git add --all
git commit -m commit
</code>

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?

git show

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?

git status

6. Qual o comando para efetuar um _commit_?

git commit

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?

git reset --hard

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.

Criar um arquivo nomeado como `.gitignore` na raíz do repositório e inserir o `path` do diretório

9. O que acontece se o seu repositório local for acidentalmente removido?

O gerenciador de versão perderá controle

10. Como clonar um repositório remoto?

git clone

11. Em alguns cenários **git log** pode produzir extensos resultados. 
Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, 
qual o comando que deve ser empregado?

git log --pretty=oneline 

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?

/.gitconfig

13. Qual o comando para criar um repositório local?

git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?

O mesmo nome da pasta raíz no qual o comando foi executado

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)

git add --all

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?

Git tem seu checksum (valor para verificação de integridade) calculado antes que seja armazenado e 
então passa a ser referenciado pelo checksum. Isso significa que é impossível mudar o conteúdo de 
qualquer arquivo ou diretório sem que o Git tenha conhecimento.O mecanismo que o Git usa para fazer o c 
hecksum é chamado de hash SHA-1.O SHA-1 é uma string de 40 caracteres composta de caracteres hexadecimais (0-9 e a-f) 
que é calculado a partir do conteúdo de um arquivo ou estrutura de um diretório no Git.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?

-abbrev-commit

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, 
executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?

Não,pois git add -u adiciona os arquivos editados e que são monitorados pelo git.

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?

**git reset --soft HEAD~1**

**git reset --hard**

Volta ao último commit e mantém os últimos arquivos no Stage e depois reseta tudo 

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. 
Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?

git clean -f

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?

.gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, 
como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?

*.class no .gitignore

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). 
O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

git clone https://github.com/jquery/jquery.git

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?

Resume cada commit por autor e dispõe a mensagem do commit

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?

Exibe a URL remota do diretirio jqueryrepo. 

26. Um repositório Git pode ser etiquetado ao longo do tempo. 
Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. 
Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?

git tag 

27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, 
como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?

git tag -a 

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?

Após executado vai exibir os dados da tag junto com o commit. 

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?

Mostraria as informações de commits com a tag

30. O que o comando **git push origin 3.4-gold** teria como efeito?

O comando mostra a informação da pessoa que criou a tag, a data de quando o commit foi taggeado, e a mensagem antes de mostrar a informação do commit. 

31. Após executar um commit, qual o efeito de **git commit --amend**?

Usado para simplesmente editar a mensagem de commit anterior sem alterar o seu instantâneo

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?

Retira o arquivo x.txt de staging após o add inserí-lo

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?

Descarta as mudanças ocorridas no arquivo. 

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?

O git reset HEAD x.txt retira o arquivo x.txt da staging Area,já o git checkout -- a.txt descarta as mudanças feitas no arquivo

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.



</DIV/>
