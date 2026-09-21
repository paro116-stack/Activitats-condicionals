# ACT-CONDICIONALS — Activitats de Programació amb Condicionals

Cada activitat és un programa Java amb un `main`. La majoria llegeixen dades del teclat
(amb `Scanner`) i decideixen què fer o què mostrar amb `if`/`else` o `switch`. Els fitxers
són a `src/main/java/`.

Algunes activitats **no tenen una sortida fixa** perquè depenen de l'hora real del teu
ordinador (05 i 09) o de números generats a l'atzar amb `Random` (18, 19 i 21). En
aquestes, el professor revisarà que la **lògica** sigui correcta llegint el codi, no que
la sortida coincideixi exactament amb cap exemple.

## Com treballar

1. Obre la carpeta a **VS Code** (accepta instal·lar les extensions recomanades).
2. Implementa cada programa.
3. Prova'l:
   - **A VS Code** (més fàcil): prem ▶ *Run* just a sobre del mètode `main` de la classe.
   - **Per consola** (no cal tenir Maven instal·lat, només el JDK):
     - Només la classe que estiguis provant (més ràpid):
       ```
       javac -d target/classes src/main/java/NomClasse.java
       java -cp target/classes NomClasse
       ```
     - Totes les classes de cop:
       ```
       javac -d target/classes src/main/java/*.java
       java -cp target/classes NomClasse
       ```
     (substitueix `NomClasse` pel nom de la classe que vulguis provar, per exemple `Febre`).
4. Fes `commit` i `push` quan vulguis desar la teva feina (pots fer-ho tantes vegades
   com vulguis). No hi ha cap correcció automàtica: el professor revisarà el teu codi
   més endavant. Abans d'entregar, comprova tu mateix cada programa (▶ *Run* a VS Code)
   amb diferents valors d'entrada, no només amb l'exemple de l'enunciat.

## Activitats (5 punts cadascuna · total 135)

| #  | Classe | Puntuació |
|----|--------|-----------|
| 01 | `Febre` | 5 |
| 02 | `ParellSenar` | 5 |
| 03 | `VaquesPorcs` | 5 |
| 04 | `NotaUF` | 5 |
| 05 | `AccesPerHora` | 5 |
| 06 | `RectangleQuadrat` | 5 |
| 07 | `DivisioGranPetit` | 5 |
| 08 | `PositiuNegatiuZero` | 5 |
| 09 | `AccesDiaHora` | 5 |
| 10 | `CaixerComissio` | 5 |
| 11 | `PreuEntradaCinema` | 5 |
| 12 | `MesGranDeTres` | 5 |
| 13 | `IMC` | 5 |
| 14 | `EntreU10Parell` | 5 |
| 15 | `SouAntiguitat` | 5 |
| 16 | `DescompteTrams` | 5 |
| 17 | `QualificacioNota` | 5 |
| 18 | `EndevinaNumero` | 5 |
| 19 | `ApostaAB` | 5 |
| 20 | `LoginUsuariPassword` | 5 |
| 21 | `PedraPaperTisora` | 5 |
| 22 | `NomDelMes` | 5 |
| 23 | `DiesDelMes` | 5 |
| 24 | `SignesZodiac` | 5 |
| 25 | `OperacionsExcepcions` | 5 |
| 26 | `PositiuNegatiuZeroExcepcions` | 5 |
| 27 | `MonedesMinimesCondicional` | 5 |

## Enunciats

### 01 — Febre (`Febre`)
Entra un número real per teclat i digues si tens febre o no (considerem que hi ha
febre per sobre de 37°C).

```
Entra la temperatura:
39.2
Tens febre, has d'anar cap a casa a descansar!!
```

### 02 — Parell o senar (`ParellSenar`)
Entra un número enter per teclat i digues si és parell o és senar.
Recorda: `7 % 2 = 1` (senar), `8 % 2 = 0` (parell).

```
Entra un número enter:
7
El número és senar
```

### 03 — Vaques i porcs (`VaquesPorcs`)
Entra per teclat el número de vaques i el número de porcs que hi ha en una granja.
Calcula el percentatge de vaques i el de porcs, mostra'ls per pantalla i digues quin
és el percentatge més gran.

```
Quants vaques hi ha a la granja?
5
Quants porcs hi ha a la granja?
15
El percentatge és: 25% de vaques i 75% de porcs.
Hi ha més porcs que vaques!
```

### 04 — Nota d'una UF (`NotaUF`)
Entra per teclat la nota de les activitats d'una UF i la nota de les proves. La nota
de les activitats és un 10% de la nota de la UF; la de les proves, un 90%. Has aprovat
si la mitjana ponderada és superior o igual a 5.

```
Introdueix la nota de les activitats:
6
Introdueix la nota de les proves:
8
La nota final de la UF és: 7.80
Has aprovat la UF!
```

### 05 — Accés per hora (`AccesPerHora`)
Escriu un programa que mostri el text "Pots accedir" únicament si hem passat de les 8
del matí. Ajuda:
```java
Calendar calendar = Calendar.getInstance();
int hour = calendar.get(Calendar.HOUR_OF_DAY);
```
> Aquesta activitat depèn de l'hora real de l'ordinador, no té una sortida fixa per provar.

### 06 — Rectangle o quadrat (`RectangleQuadrat`)
Partint del valor dels dos costats d'un rectangle, entrats per teclat, calcula'n el
perímetre i l'àrea, i mostra també si es tracta d'un quadrat o no.

- Perímetre = costat gran × 2 + costat petit × 2
- Àrea = costat gran × costat petit

Exemple (`costatGran = 7`, `costatPetit = 2`):

```
Introdueix el costat gran del rectangle:
7
Introdueix el costat petit del rectangle:
2
Perímetre del rectangle = 18
Àrea del rectangle = 14
No és un quadrat
```

### 07 — Dividir el més gran entre el més petit (`DivisioGranPetit`)
Entra per teclat 2 números diferents i mostra el resultat de dividir el més gran entre
el més petit.

1. Comprova primer que els 2 números siguin diferents. En cas contrari, mostra
   "Els números han de ser diferents".
2. Aconsegueix el número més gran i el més petit.
3. Comprova que el petit no sigui zero. Si ho és, mostra "El divisor no pot ser 0".
4. Mostra el resultat de la divisió si tot està correcte.

```
Introdueix el primer número:
20
Introdueix el segon número:
4
El resultat de dividir 20 entre 4 és: 5.0
```

### 08 — Positiu, negatiu o zero (`PositiuNegatiuZero`)
Demana un nombre enter i digues si és positiu, negatiu o zero.

```
Introdueix un número:
-5
El número és negatiu
```

### 09 — Accés per dia i hora (`AccesDiaHora`)
Escriu un programa que permeti executar les instruccions únicament si no és dissabte,
no és diumenge, i són passades les 8 del matí. Resol-ho amb **condicionals aniuades**.

Missatges de sortida:
- `NO pots entrar: és dissabte!`
- `No pots entrar: és diumenge!`
- `No pots entrar: Encara no són es 08:00 hores!`
- `Benvingut a l'aplicació!!`

> Aquesta activitat depèn del dia i l'hora reals de l'ordinador, no té una sortida fixa
> per provar.

### 10 — Caixer, comissió i saldo (`CaixerComissio`)
Escriu un programa que demani el saldo actual del compte, la quantitat que es vol
treure, i si es fa servir un caixer propi (S/N). Si s'usa un caixer d'un altre banc,
s'aplica una comissió del 5% sobre la quantitat a retirar. Calcula l'import final a
treure (amb comissió si cal) i el saldo restant si es pot fer l'operació.

```
Introdueix el saldo actual: 1000
Introdueix la quantitat a treure: 200
Fas servir caixer propi? (S/N): N
Quantitat a treure: 200.0 €
Comissió: 10.0 €
Saldo restant: 790.0 €
------------------------------------------------------------------------
Introdueix el saldo actual: 100
Introdueix la quantitat a treure: 200
Fas servir caixer propi? (S/N): S
No es pot fer la retirada. Saldo insuficient.
```

### 11 — Preu d'una entrada de cinema (`PreuEntradaCinema`)
L'entrada normal val 5€ un dia laborable i un 10% més en cap de setmana. Els que tenen
carnet jove tenen un descompte addicional del 15%. Pregunta si es tracta d'un dia
laborable (L) o de cap de setmana (C), i si el client té Carnet Jove (S/N). Ajuda per
llegir una lletra:
```java
char lletra;
Scanner teclat = new Scanner(System.in);
lletra = teclat.next().charAt(0);
```

Exemple (cap de setmana i amb Carnet Jove):

```
És un dia laborable (L) o de cap de setmana (C)?
C
Tens Carnet Jove? (S/N):
S
El preu de l'entrada és: 4.68 €
```

### 12 — El més gran de tres (`MesGranDeTres`)
Entra 3 números per teclat i mostra quin és el més gran de tots tres.

```
Introdueix el primer número:
3
Introdueix el segon número:
9
Introdueix el tercer número:
5
El número més gran és: 9
```

### 13 — Índex de massa corporal (`IMC`)
Demana l'altura en centímetres i el pes en quilograms. Calcula l'IMC amb la fórmula de
l'OMS: `IMC = pes / altura²` (altura en metres). Mostra el valor de l'IMC i la
classificació:
- Menys de 18.5 → Pes insuficient
- 18.5 – 24.9 → Pes normal
- 25.0 – 29.9 → Sobrepès
- 30.0 o més → Obesitat

```
Introdueix altura en cm: 165
Introdueix pes en kg: 60
L'IMC és: 22.04
Classificació (OMS): Pes normal
```

### 14 — Entre 1 i 10 i parell (`EntreU10Parell`)
Demana un nombre enter i digues si està entre 1 i 10 i, a més, és parell. Resol-ho amb
estructura **if-else aniuada**.

```
Introdueix un número enter:
8
El número està entre 1 i 10 i és parell
```

### 15 — Sou i antiguitat (`SouAntiguitat`)
D'un operari se'n coneix el sou i els anys d'antiguitat. Llegeix les dades i:
a) Si el sou és inferior a 500 i l'antiguitat és igual o superior a 10 anys, augment del 20%.
b) Si el sou és inferior a 500 però l'antiguitat és menor a 10 anys, augment del 5%.
c) Si el sou és més gran o igual a 500, mostra'l sense canvis.

```
Introdueix el sou de l'operari:
450
Introdueix els anys d'antiguitat:
12
El sou a pagar és: 540.0
```

### 16 — Descompte per trams (`DescompteTrams`)
Introdueix una quantitat N i resta-li un descompte segons el tram:
- `n < 500` → 5%
- `500 <= n < 1000` → 8%
- `1000 <= n <= 5000` → 15%
- `n > 5000` → 25%

```
Introdueix una quantitat:
800
El resultat és: 736.0
```

### 17 — Qualificació d'una nota (`QualificacioNota`)
Entra una nota numèrica real entre 0 i 10 i mostra la qualificació: Excel·lent (9-10),
Notable (7-8.9), Bé (6-6.9), Suficient (5-5.9) o Insuficient (menys de 5). Si el número
no està entre 0 i 10, mostra "La nota ha de ser entre 0 i 10".

> Recorda: escriu els decimals amb **punt** (`5.6`), no amb coma.

```
Introdueix una nota:
8.5
Notable
```

### 18 — Endevina el número (`EndevinaNumero`)
Genera un número aleatori entre 1 i 10. Demana un número a l'usuari i digues si l'ha
endevinat. Si no l'endevina, informa'l del número que s'havia generat.

```
Endevina el número que he pensat (està entre 1 i 10!):
5
Ho sento, havia generat el número 3!
```
> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

### 19 — Aposta A o B (`ApostaAB`)
Tria dos números enters aleatoris A i B, sense mostrar-los encara. Pregunta per qui
aposta l'usuari (guanya el número més alt). Un cop apostat, mostra el valor d'A i B i
digues si s'ha guanyat o perdut.

```
Apostes per A o per B ? : A
A treu un 9 i B treu un 6 HAS GUANYAT!!!
```
> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

### 20 — Login amb usuari i contrasenya (`LoginUsuariPassword`)
En dues variables del programa es guarden el `username` i el `password` d'un usuari
(`cponts` / `qw34T1234`). Demana per teclat el nom d'usuari i la contrasenya, i digues
si són correctes.

```
Introdueix el nom d'usuari:
cponts
Introdueix la contrasenya:
qw34T1234
Usuari i contrasenya correctes!
```

### 21 — Pedra, paper o tisora (`PedraPaperTisora`)
Implementa el joc contra l'ordinador: les tisores tallen el paper, el paper embolica la
pedra, la pedra esclafa les tisores. Si els dos jugadors treuen el mateix, empat.
L'ordinador tria a l'atzar (0=pedra, 1=paper, 2=tisora); l'usuari entra "pedra",
"paper" o "tisora".

```
Entra pedra, paper o tisora:
pedra
Ordinador ha tret: pedra
Heu empatat!!
```
```
Entra pedra, paper o tisora:
pedra
Ordinador ha tret: paper
Has perdut!
```
> Aquesta activitat fa servir `Random`, no té una sortida fixa per provar.

### 22 — Nom del mes (`NomDelMes`)
Per practicar l'estructura `switch`: introdueix un valor numèric entre 1 i 12 (un mes
de l'any) i mostra'n el nom. Detecta els errors (números fora de rang).

```
Introdueix un número de mes (1-12):
4
Abril
```

### 23 — Dies del mes (`DiesDelMes`)
Introdueix un valor numèric entre 1 i 12 i mostra els dies que té aquell mes (febrer:
28 dies). Detecta els errors. Amb `switch` es poden agrupar casos:
```java
switch (mes) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        System.out.println("31 dies");
        break;
    // ...
}
```

```
Introdueix un número de mes (1-12):
2
Aquest mes té 28 dies
```

### 24 — Signes del zodíac (`SignesZodiac`)
| Foc | Terra | Aire | Aigua |
|---|---|---|---|
| 1. Àries | 2. Capricorn | 3. Balança | 4. Cranc |
| 5. Lleó | 6. Taure | 7. Aquari | 8. Escorpió |
| 9. Sagitari | 10. Verge | 11. Bessons | 12. Peixos |

a) Mostra el llistat dels signes del zodíac amb els seus números associats.
b) Demana per teclat un número associat a un signe.
c) Amb `switch`, mostra la categoria a la qual pertany.

Si el número no està associat a cap signe: `ERROR: <número> no associat a cap signe.`

```
1. Àries      2. Capricorn   3. Balança     4. Cranc
5. Lleó       6. Taure       7. Aquari      8. Escorpió
9. Sagitari   10. Verge      11. Bessons    12. Peixos
Introdueix el número del teu signe:
5
Categoria: Foc
```

### 25 — Operacions aritmètiques amb excepcions (`OperacionsExcepcions`)
Realitza les operacions aritmètiques fonamentals (suma, resta, multiplicació i
divisió) de 2 valors enters, controlant les possibles excepcions:
- l'usuari no introdueix el tipus de dada esperat pel programa;
- el segon operand és zero.

```
4 + 2 = 6
4 - 2 = 2
4 * 2 = 8
4 / 2 = 2
```

Exemple amb el segon operand a zero (excepció controlada, no error del programa):

```
Introdueix el primer número enter:
5
Introdueix el segon número enter:
0
5 + 0 = 5
5 - 0 = 5
5 * 0 = 0
Error: no es pot dividir per zero
```

### 26 — Positiu, negatiu o zero, amb excepcions (`PositiuNegatiuZeroExcepcions`)
Com l'activitat 08, però controlant amb `try`/`catch` que l'usuari introdueixi el
tipus de dada esperat.

Exemple si l'usuari no introdueix un número:

```
Introdueix un número:
abc
Error: has d'introduir un número enter
```

### 27 — Monedes mínimes (`MonedesMinimesCondicional`)
Demana una quantitat entera de diners (en cèntims d'euro, ha de ser ≥ 0) i mostra la
quantitat mínima de monedes necessària per lliurar-la (1, 2, 5, 10, 20, 50, 100 i 200
cèntims). Mostra només les línies amb quantitat més gran que zero.

```
Introdueix una quantitat (cèntims euro): 123
1 monedes d'1 euro
1 monedes de 20 cèntims
1 moneda de 2 cèntims
1 moneda de 1 cèntims
```
