# Git Flow

Este repositório utiliza um modelo de ramificação inspirado no Git Flow para gerenciar o fluxo de trabalho do Git. O modelo de ramificação segue um conjunto consistente de ramificações e comandos para facilitar a colaboração entre equipes.

## Ramificações

Este modelo de ramificação utiliza cinco ramificações principais:

- `master`: representa a versão mais recente do código que está em produção. Essa é uma branch fixa, ou seja, não deve ser modificada diretamente.
- `develop`: representa a versão mais recente do código que está em desenvolvimento. Essa é outra branch fixa, também não deve ser modificada diretamente.
- `feature`:  é usada para desenvolver novas funcionalidades. Essa ramificação é criada a partir da ramificação `master` e cada nova funcionalidade deve ser mesclada na ramificação `develop` assim que estiver pronta.
- `release`: é usada para preparar uma nova versão para produção. Nesta ramificação, são feitos ajustes finais e testes antes de mesclar a versão final na ramificação `master`. 
- `hotfix`: é usada para corrigir problemas críticos em produção. Essa ramificação é criada a partir da ramificação `master` e deve ser mesclada tanto na ramificação `master` quanto na `develop`.

## Fluxo de trabalho

O fluxo de trabalho inspirado no Git Flow segue o seguinte fluxo:

1. Clone o repositório em sua máquina:
```bash
git clone <URL-do-repositório>
```

2. Crie uma nova branch a partir da ramificação `develop` para a funcionalidade que deseja implementar:
```bash
git checkout develop
git checkout -b feature/<nome-da-funcionalidade>
```

3. Trabalhe na nova funcionalidade e faça commits regularmente:
```bash
git commit -m "mensagem de commit"
```

4. Quando a funcionalidade estiver completa, faça o merge na ramificação `develop`:
```bash
git checkout develop
git merge --no-ff feature/<nome-da-funcionalidade>
```

5. Crie uma nova branch a partir da ramificação `develop` para a release que deseja preparar:
```bash
git checkout develop
git checkout -b release/<versão>
```

6. Faça ajustes finais na release e faça o merge na ramificação `master` e na `develop`:
```bash
git checkout master
git merge --no-ff release/<versão>
git checkout develop
git merge --no-ff release/<versão>
```

7. Se surgir um problema crítico em produção, crie uma nova branch a partir da ramificação master para o `hotfix` que deseja implementar:
```bash
git checkout master
git checkout -b hotfix/<nome-do-hotfix>
```

8. Corrija o problema crítico e faça o merge na ramificação `master` e na `develop`:
```bash
git checkout master
git merge --no-ff hotfix/<nome-do-hotfix>
git checkout develop
git merge --no-ff hotfix/<nome-do-hotfix>
```
