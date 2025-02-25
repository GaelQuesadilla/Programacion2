PROCESO Calificaciones
	
    DEFINIR ccalificaciones COMO REAL
    DEFINIR promedio COMO REAL
    DEFINIR porcentaje COMO REAL
    DEFINIR f COMO ENTERO
    DIMENSION ccalificaciones[15] 
	
    PARA f = 1 HASTA 15 HACER 
        ESCRIBIR "Ingrese la calificación ", f, ":"
        LEER ccalificaciones[i] 
    FIN PARA
	
    promedio <- 0
    PARA f = 1 HASTA 15 HACER
        promedio <- promedio + ccalificaciones[f]
    FIN PARA
    promedio <- promedio / 15
	
    DEFINIR contadorAprobados COMO ENTERO
    contadorAprobados <- 0
    PARA f <- 1 HASTA 15 HACER
        SI ccalificaciones[f] >= promedio ENTONCES
            contadorAprobados <- contadorAprobados + 1
        FIN SI
    FIN PARA
    porcentaje <- (contadorAprobados / 15) * 100
	
    ESCRIBIR "El promedio de las calificaciones es: ", promedio
    ESCRIBIR "Porcentaje de alumnos aprobados: ", porcentaje, "%"
	
FIN PROCESO
