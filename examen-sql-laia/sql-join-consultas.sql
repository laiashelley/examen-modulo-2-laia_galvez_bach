SELECT * FROM propietarioscasaslaia.casas;

SELECT c.idcasas, c.direccionCasas, c.precioCasas, c.anyoCasas FROM casas c
JOIN propietarios p ON c.propietarios_idpropietarios = p.idpropietarios;

SELECT p.nombrePropietarios, c.precioCasas
FROM casas c
JOIN propietarios p ON p.idpropietarios = p.idpropietarios
WHERE c.precioCasas > 130000;