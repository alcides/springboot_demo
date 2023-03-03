# Projecto de Referência de SpringBoot

## O que fazer

Este projecto serve para verificar que todas as dependências necessárias ao projecto estão a funcionar.

## Dependências

Este projecto necessita de:

* [Docker Desktop](https://docs.docker.com/get-docker/) (ou Docker + [Docker Compose](https://docs.docker.com/compose/install/))
* [Python 3 and Pip](https://docs.python-guide.org/starting/install3/linux/)

```
sudo apt-get install docker docker-compose python3 python3-pip
```

Na realidade o projecto vai usar Java17+ e Postgres, mas esses vão estar disponíveis pelos containers. Só são necessários se quiser correr a aplicação nativamente.


## Primeiro passo

Deve correr o ficheiro `setup.sh`.

## Segundo passo

Deve correr o ficheiro `run.sh`.

Este comando vai iniciar dois containers:

* Um com a aplicação que existe nesta pasta, com hot reloading.
* Uma instância de um container com Postgres

## Terceiro passo

Abrir http://localhost:8080 num browser e verificar que aparece a string "Olá Mundo".

Pode ainda confirmar que consegue ver um objecto JSON em http://localhost:8080/api/author/1


# FAQ

## Preciso de `sudo` para correr o `run.sh`
Tenta correr `sudo usermod -aG docker $USER` seguido de um log-out na máquina.
Ou tentar [desta forma](https://www.digitalocean.com/community/questions/how-to-fix-docker-got-permission-denied-while-trying-to-connect-to-the-docker-daemon-socket)

## O Docker não instala em ubuntu.

Tentar [desta forma](https://askubuntu.com/a/1411717).

## O `run.sh`não está a correr no meu macos m1.

Tentar correr `docker ps`. Se não funcionar, [tentar isto](https://stackoverflow.com/a/68202428/28516).
Confirmar também que está instalado o Docker Desktop (`brew install --cask docker`) e não apenas a command-line tool (`brew install docker`). A aplicação Docker deve também estar a correr (icon na menubar).


## Estou em windows e o `bash setup.sh` não funciona

Correr numa bash (tanto a Git Bash, MSys2 bash ou WSL em linux) e não na Powershell, nem no CMD.exe.

## `docker compose` não funciona

`docker compose` é o comando da última versão de docker. `docker-compose` é a versão antiga. Devem actualizar o docker.

## Em vez de Ubuntu, uso Fedora.

Instalar os mesmos pacotes, mas usando `dnf` em vez do `apt`, e ajustar o nome dos pacotes.
