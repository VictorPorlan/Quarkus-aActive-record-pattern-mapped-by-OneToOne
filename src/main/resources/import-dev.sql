DROP TABLE IF EXISTS Espada;
DROP TABLE IF EXISTS Herrero;
DROP TABLE IF EXISTS Asignacion;


CREATE TABLE Herrero
(
    nombre VARCHAR (255) NOT NULL UNIQUE ,
    localidad VARCHAR (255),
    PRIMARY KEY (nombre)
) ENGINE = InnoDB;

CREATE TABLE Espada
(
    nombre VARCHAR (255) NOT NULL UNIQUE,
    longitud FLOAT NOT NULL,
    afilada BOOLEAN,
    herrero_name VARCHAR(255),
    PRIMARY KEY (nombre),
    CONSTRAINT `fk_herrero_espada`
        FOREIGN KEY (herrero_name) REFERENCES Herrero (nombre)
            ON DELETE SET NULL
            ON UPDATE SET NULL
) ENGINE = InnoDB;

CREATE TABLE Asignacion
(
    id BIGINT NOT NULL UNIQUE,
    espada_name VARCHAR(255),
    herrero_name VARCHAR (255),
    PRIMARY KEY (id),
    CONSTRAINT `fk_espada_herrero`
        FOREIGN KEY (espada_name) REFERENCES Espada (nombre)
            ON DELETE SET NULL
            ON UPDATE SET NULL,
    CONSTRAINT `fk_herrero_espada`
            FOREIGN KEY (herrero_name) REFERENCES Herrero (nombre)
            ON DELETE SET NULL
            ON UPDATE SET NULL
) ENGINE = InnoDB;

INSERT INTO Herrero (nombre, localidad) VALUES ('Godot', 'Midland');
INSERT INTO Herrero (nombre, localidad) VALUES ('Lich King', 'Rasganorte');
INSERT INTO Espada (nombre, longitud, afilada, herrero_name) VALUES ('Dragonslayer', 200.0, false, 'Godot');
INSERT INTO Espada (nombre, longitud, afilada, herrero_name) VALUES ('Frostmourne', 100.0, false, 'Lich King');
INSERT INTO Asignacion (id, espada_name, herrero_name) VALUES (1000, 'Dragonslayer', 'Godot');
INSERT INTO Asignacion (id, espada_name, herrero_name) VALUES (2000, 'Frostmourne', 'Lich King');
