SELECT * FROM propietarioscasaslaia.casas;

SELECT * FROM casas
WHERE anyoCasas BETWEEN 1990 AND 2020;

SELECT * FROM casas
ORDER BY precioCasas DESC;

SELECT AVG(precioCasas) FROM casas;

SELECT MIN(precioCasas) AS precioBarato
FROM casas;



