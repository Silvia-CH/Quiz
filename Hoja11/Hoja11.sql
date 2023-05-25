drop database hoja11;
CREATE DATABASE IF NOT EXISTS hoja11;

use hoja11;

CREATE TABLE IF NOT EXISTS pregunta(
	idPregunta INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    textoPregunta TEXT,
    rasgoPregunta VARCHAR(1)
);

CREATE TABLE IF NOT EXISTS respuesta(
	idRespuesta INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    textoRespuesta TEXT,
    tipoRespuesta VARCHAR(1),
    fk_pregunta_id INT
);

CREATE TABLE IF NOT EXISTS pregunta_has_respuesta(
    pregunta_id INT NOT NULL,
    respuesta_id1 INT,
    respuesta_id2 INT,
    respuesta_id3 INT,
    respuesta_id4 INT
);

CREATE TABLE IF NOT EXISTS final (
	idFinal INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombreFinal VARCHAR(15),
    textoFinal TEXT,
    rutaImagen TEXT,
    rasgoA INT, 
    rasgoB INT,	
    rasgoC INT, 
    rasgoD INT	
);

-- INSERCIONES
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Cuál de los siguientes es tu elemento favorito?", 'Y');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Cuál de estos animales te gusta más?", 'Y');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("Si escribieras un libro, ¿Qué género sería?", 'Y');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("Elige una comida:", 'Y');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Cuál es tu estación favorita?", 'Y');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("Elige un poder:", 'Y');

INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Cuál de las siguientes cualidades te define mejor?", 'X');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Dónde tendrías una casa?", 'X');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿Qué color prefieres?", 'X');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("Elige un tipo de vestimenta", 'X');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("¿A quién cederías el asiento en el autobús?", 'X');
INSERT INTO pregunta (textoPregunta, rasgoPregunta) VALUES ("En tu grupo de amigos, ¿eres el...?", 'X');



INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Agua", 'A', 1);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Tierra", 'A', 1);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Viento", 'B', 1);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Fuego", 'B', 1);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Koala", 'A', 2);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Perro", 'A', 2);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Caballo", 'B', 2);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("León", 'B', 2);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Fantasía", 'A', 3);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Aventuras", 'A', 3);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Misterio", 'B', 3);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Drama", 'B', 3);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Carne", 'A', 4);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Pescado", 'A', 4);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Verduras", 'B', 4);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Dulces", 'B', 4);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Verano", 'A', 5);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Primavera", 'A', 5);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Otoño", 'B', 5);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Invierno", 'B', 5);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Volar", 'A', 6);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Viajar en el tiempo", 'A', 6);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Teletransporte", 'B', 6);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Súper-Fuerza", 'B', 6);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Introvertido", 'C', 7);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Leal", 'C', 7);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Extrovertido", 'D', 7);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Divertido", 'D', 7);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Encima de una montaña", 'C', 8);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Escondida en el bosque", 'C', 8);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Mansión en la playa", 'D', 8);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Ático en la ciudad", 'D', 8);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Blanco", 'C', 9);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Verde", 'C', 9);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Dorado", 'D', 9);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Rojo", 'D', 9);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Cómoda", 'C', 10);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Casual", 'C', 10);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Elegante", 'D', 10);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Formal", 'D', 10);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Prefieres no contestar", 'C', 11);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Persona con muletas", 'C', 11);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Anciano", 'D', 11);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Embarazada", 'D', 11);

INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Listo", 'C', 12);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Tímido", 'C', 12);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Sociable", 'D', 12);
INSERT INTO respuesta (textoRespuesta, tipoRespuesta, fk_pregunta_id) VALUES ("Divertido", 'D', 12);


INSERT INTO pregunta_has_respuesta VALUES (1, 1,2,3,4);
INSERT INTO pregunta_has_respuesta VALUES (2, 5,6,7,8);
INSERT INTO pregunta_has_respuesta VALUES (3, 9,10,11,12);
INSERT INTO pregunta_has_respuesta VALUES (4, 13,14,15,16);
INSERT INTO pregunta_has_respuesta VALUES (5, 17,18,19,20);
INSERT INTO pregunta_has_respuesta VALUES (6, 21,22,23,24);

INSERT INTO pregunta_has_respuesta VALUES (7, 25,26,27,28);
INSERT INTO pregunta_has_respuesta VALUES (8, 29,30,31,32);
INSERT INTO pregunta_has_respuesta VALUES (9, 33,34,35,36);
INSERT INTO pregunta_has_respuesta VALUES (10, 37,38,39,40);
INSERT INTO pregunta_has_respuesta VALUES (11, 41,42,43,44);
INSERT INTO pregunta_has_respuesta VALUES (12, 45,46,47,48);
