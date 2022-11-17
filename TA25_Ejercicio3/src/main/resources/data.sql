
DROP table IF EXISTS almacenes;

create table almacenes(
	codigo int auto_increment,
	lugar varchar(100),
	capacidad int,
	primary key (codigo)
);

DROP table IF EXISTS cajas;

create table cajas(
	numreferencia varchar(5),
	contenido varchar(100),
	valor int,
	almacen int,
	primary key (numreferencia),
	foreign key(almacen) references almacenes(codigo) 
);

insert into almacenes (lugar,capacidad)values('Almacen1',100);
insert into almacenes (lugar,capacidad)values('Almacen2',200);
insert into almacenes (lugar,capacidad)values('Almacen3',300);



insert into cajas (numreferencia,contenido, valor,almacen)values('12345','Cajas1',1000,3);
insert into cajas (numreferencia,contenido, valor,almacen)values('54321','Cajas2', 2000,2);
insert into cajas (numreferencia,contenido, valor,almacen)values('13524','Cajas3', 3000,1);
