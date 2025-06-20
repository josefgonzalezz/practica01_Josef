DROP DATABASE IF EXISTS practica01;
DROP USER IF EXISTS 'usuario_practica'@'%';

-- Crear la base de datos
CREATE DATABASE practica01
CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

-- Crear usuario para la base de datos con acceso desde cualquier host (%)
CREATE USER 'usuario_practica'@'%' IDENTIFIED BY 'la_Clave';

-- Otorgar permisos totales a usuario_practica sobre practica01
GRANT ALL PRIVILEGES ON practica01.* TO 'usuario_practica'@'%';

-- Aplicar cambios de permisos
FLUSH PRIVILEGES;

-- Usar la base de datos creada
USE practica01;

-- Crear tabla 'arbol'
CREATE TABLE arbol (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre_comun VARCHAR(100) NOT NULL,
    tipo_flor VARCHAR(100),
    dureza_madera INT,
    altura_promedio DECIMAL(5,2),
    imagen_ruta VARCHAR(255),
    activo BOOLEAN DEFAULT TRUE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Insertar registros en tabla 'arbol'
INSERT INTO arbol (nombre_comun, tipo_flor, dureza_madera, altura_promedio, imagen_ruta, activo) VALUES
('Roble', 'Flores pequeñas', 9, 25.50, 'imagenes/roble.jpg', TRUE),
('Ciprés', 'Coníferas', 8, 20.00, 'imagenes/cipres.jpg', TRUE),
('Cedro', 'Flores discretas', 7, 30.00, 'imagenes/cedro.jpg', TRUE),
('Jacaranda', 'Violetas en racimo', 4, 15.75, 'imagenes/jacaranda.jpg', TRUE),
('Pino', 'Conos (no flor verdadera)', 6, 35.20, 'imagenes/pino.jpg', TRUE);


