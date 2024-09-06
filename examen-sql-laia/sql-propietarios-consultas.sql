SELECT * FROM propietarioscasaslaia.propietarios;

SELECT COUNT(*) AS totalPropietarios
FROM propietarios;

SELECT * FROM propietarios
WHERE apellidoPropietarios = 'Galvez';

SELECT emailPropietarios FROM propietarios;

SELECT * FROM propietarios
WHERE nombrePropietarios LIKE 'l%';