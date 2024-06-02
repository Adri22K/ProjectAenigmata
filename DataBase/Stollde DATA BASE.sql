Create database Stollde;

Use Stollde;

Create table Jogador(
Codjogador int auto_increment,
Nome varchar (50) not null,
Data varchar (10) not null,
Codjogada int,
CONSTRAINT fk_jogada FOREIGN KEY (codjogada) REFERENCES Jogada (codjogada),
Primary key ( codjogador));

Create table Jogada (
Codjogada int auto_increment,
TipoFinal varchar (10) not null,
Coddica int,
CONSTRAINT fk_dica FOREIGN KEY (coddica) REFERENCES Dica (coddica),
Primary key ( codjogada)
);

Create table Dica (
Coddica int auto_increment, 
TipoDica varchar ( 50 ) not null,
TipoSenha varchar ( 50) not null,
Primary key ( coddica )
);

Create table Jogo(
Codjogo int  auto_increment,
NomeDoJogo varchar ( 50) not null,
Tipo varchar (30) not null,
DataLancamento varchar (10) not null,
Formato varchar (40) not null,
Primary Key ( codjogo)
);

Create table Plataforma (
Codplataforma int  auto_increment,
NomePlataforma varchar (30) not null,
Tipoconectividade varchar (40) not null,
Primary key ( codplataforma)
);




