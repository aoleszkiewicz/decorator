# System Lakierowania Samochodów - Implementacja Wzorca Dekorator

## Przegląd Projektu
Ten projekt demonstruje implementację wzorca projektowego Dekorator w Javie poprzez system lakierowania samochodów. System umożliwia dynamiczne dodawanie różnych opcji lakierowania i wykończeń do podstawowego lakierowania samochodu.

## Wzorzec Projektowy: Dekorator
Wzorzec Dekorator pozwala na dynamiczne dodawanie zachowań do pojedynczych obiektów bez wpływania na zachowanie innych obiektów tej samej klasy.

### Dlaczego Wzorzec Dekorator?
- Umożliwia elastyczne dodawanie funkcjonalności
- Przestrzega Zasady Pojedynczej Odpowiedzialności
- Stanowi alternatywę dla dziedziczenia
- Pozwala na modyfikację zachowania w czasie wykonania

## Struktura Projektu

### Główne Komponenty

#### 1. Interfejs Bazowy
`LakierowanieSamochodu`
- Definiuje podstawowy kontrakt dla wszystkich operacji lakierowania
- Zawiera metodę obliczania kosztu
- Zawiera metodę opisu

#### 2. Komponent Konkretny
`LakierowanieOsobowego`
- Implementuje podstawową funkcjonalność lakierowania
- Dostarcza podstawowe obliczanie kosztów
- Dostarcza podstawowy opis

#### 3. Dekoratory
1. `OpcjaLakierowania`
   - Abstrakcyjna klasa dekoratora
   - Przechowuje referencję do dekorowanego komponentu
   - Implementuje interfejs `LakierowanieSamochodu`

2. Dekoratory Konkretne:
   - `OpcjaMetaliczne`
   - `OpcjaZChromowaniem`
   - `OpcjaZPlomieniami`

## Szczegóły Implementacji

### Hierarchia Klas
```
LakierowanieSamochodu (interfejs)
├── LakierowanieOsobowego
└── OpcjaLakierowania (klasa abstrakcyjna)
    ├── OpcjaMetaliczne
    ├── OpcjaZChromowaniem
    └── OpcjaZPlomieniami
```

### Kluczowe Metody
- `koszt()`: Oblicza całkowity koszt
- `opis()`: Dostarcza opis zastosowanych opcji

## Implementacja Wzorca

### Komponent Bazowy
```java
public interface LakierowanieSamochodu {
    double koszt();
    String opis();
}
```

### Przykład Dekoratora
```java
public abstract class OpcjaLakierowania implements LakierowanieSamochodu {
    protected LakierowanieSamochodu lakierowanieDekorator;
    
    public OpcjaLakierowania(LakierowanieSamochodu lakierowanieDekorator) {
        this.lakierowanieDekorator = lakierowanieDekorator;
    }
}
```

## Przykład Użycia
```java
LakierowanieSamochodu samochod = new LakierowanieOsobowego();
samochod = new OpcjaMetaliczne(samochod);
samochod = new OpcjaZPlomieniami(samochod);
```

## Osiągnięte Korzyści
1. **Elastyczność**: Łatwe dodawanie nowych opcji lakierowania
2. **Łatwość Utrzymania**: Każda opcja w osobnej klasie
3. **Zasada Otwarte/Zamknięte**: Nowe funkcje bez modyfikacji istniejącego kodu
4. **Kompozycja zamiast Dziedziczenia**: Dynamiczna kombinacja funkcji

## Zastosowane Zasady Wzorca
1. **Pojedyncza Odpowiedzialność**: Każdy dekorator obsługuje jedną konkretną funkcję
2. **Otwarte/Zamknięte**: System jest otwarty na rozszerzenia, zamknięty na modyfikacje
3. **Segregacja Interfejsów**: Przejrzysta hierarchia interfejsów
4. **Odwrócenie Zależności**: Moduły wysokiego poziomu zależą od abstrakcji
