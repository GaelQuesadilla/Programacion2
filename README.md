# Programación 2

## Equipo

1. Frida Alejandra Mendoza Martinez
2. Gael González Méndez
3. Hector Desiderio Erasto

## Comandos importantes

### Actualizar _sources.txt_

En una terminal bash (_wsl_ o _git bash_) ejecutar el siguiente comando

```bash
find . -type f -name "\*.java" > sources.txt
```

### Compilar programas

Una vez actualizado _sources.txt_ ejecutar el siguiente programa en una terminal ash (_wsl_, _git bash_ o _cmd_)

```bash
javac @sources.txt
```

### Ejecución del programa

Existen dos formas de ejecutar un programa:

**1.** **Fácil**: Utilizar las opciones integradas de VsCode como se muestra en la imagen a continuación
![Guía de ejecución en VsCode](images/run_guide.png "Guía de ejecución en VsCode")

**2.** **Difícil**: Una vez compilados los programas, puedes utilizar comandos para ejecutar el programa como los que se muestran a continuación (puede ser cualquier terminal, ya sea _wsl_, _bash_, _cmd_, o de preferencia _powershell_)

```bash
java -cp . Tarea1.Programa1.Main
```

```bash
java .\Tarea3\Programa9\Main.java
```

## Elaboración de los programas

| Tarea | Programa |   Autor(es)   |
| :---: | :------: | :-----------: |
|   1   |    1     |     Frida     |
|   1   |    2     |     Gael      |
|   1   |    3     |     Gael      |
|   1   |    4     |     Frida     |
|   2   |    5     |     Frida     |
|   2   |    6     |     Gael      |
|   2   |    7     |     Gael      |
|   3   |    8     |     Frida     |
|   3   |    9     |  Frida, Gael  |
|   3   |    10    |     Gael      |
|   4   |    11    |     Frida     |
|   4   |    12    |     Gael      |
|   4   |    13    |     Frida     |
|   5   |    14    |    Héctor     |
|   5   |    15    |     Frida     |
|   5   |    16    |     Gael      |
|   6   |    17    |     Frida     |
|   6   |    18    |     Gael      |
|   7   |    19    |    Héctor     |
|   7   |    20    |     Gael      |
|   7   |    21    |      FD       |
|   8   |    22    |    Héctor     |
|   8   |    23    |     Gael      |
|   9   |    24    | Héctor, Gael  |
|   9   |    25    |  Frida, Gael  |
|  10   |    26    | Héctor, Frida |
|  10   |    27    |  Gael, Frida  |
|  11   |    28    | Frida, Héctor |
|  11   |    29    |     Gael      |
|  12   |    30    |     Gael      |
|  12   |    31    |     Frida     |
|  12   |    32    |    Héctor     |
|  12   |    33    |     Gael      |
|  13   |    34    |    Héctor     |
|  13   |    35    |     Frida     |
|  13   |    36    |     Gael      |
|  13   |    37    |     Frida     |
|  14   |    38    |     Gael      |
|  14   |    39    |     Gael      |
|  14   |    40    |    Héctor     |
|  14   |    41    |     Frida     |
