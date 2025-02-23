create database productos;
use productos;
create table inventario(
	ID int primary key auto_increment,
    nombreCorto varchar(45) not null,
    descripcion varchar(45),
    serie varchar(45),
    color varchar(45),
    fechaAdquisicion varchar(45),
    TipoAdquisicion varchar(45),
    observaciones varchar(45),
    AREAS_id int,
    FOREIGN KEY (AREAS_id) REFERENCES AREAS(id)
);

CREATE TABLE AREAS (
    id INT PRIMARY KEY AUTO_INCREMENT,
    Nombre VARCHAR(45) NOT NULL,
    Ubicacion VARCHAR(45) NOT NULL
);

insert into areas(id, nombre, ubicacion) values (1,"area 1", "ubicacion 1");
insert into areas(id, nombre, ubicacion) values (2,"area 2", "ubicacion 2");
insert into areas(id, nombre, ubicacion) values (3,"area 3", "ubicacion 3");

insert into areas(id, nombre, ubicacion) values (4,"industrial", "ubicacion 1");
insert into areas(id, nombre, ubicacion) values (5,"sistemas", "ubicacion 2");
insert into areas(id, nombre, ubicacion) values (6,"automotris", "ubicacion 3");
select * from inventario;
select * from areas;
delete from inventario where id=12;
select id, nombre from areas;