# Pflichtenheft – Uhrzeiteinstellunge für Wecker

## 1. Einstellmodus
- **Auslösung**: `SET` ≥ 2s → Modus `TIME_SET`.
- **Anzeige**: Stunden blinken (2 Hz), Minuten konstant.
- **Verlassen**: `OK` speichert; `Zurück` oder **Timeout (10s)** verwirft.

## 2. Stunden einstellen
- Tastenabfrage im 10-ms-Tick; **Entprellung 40 ms**.
- Kurzdruck: ±1; **Langdruck ≥1s** → **Schnelllauf 5 Schritte/s**.
- Bereich 0–23 (intern). Bei 12-h-Anzeige Ausgabe 1–12, intern weiterhin 0–23.
- **Überlauf**: 23↑→00, 00↓→23.

## 3. Minuten einstellen
- Wechsel nach `SET` Kurzdruck aus Stunden-Schritt.
- Logik wie bei Stunden; Bereich 0–59; **Überlauf** 59↑→00, 00↓→59.

## 4. 12/24-h-Umschaltung
- Im Einstellmodus `↑+↓` gleichzeitig 1s → Formatwechsel.
- Anzeige aktualisiert sich sofort (AM/PM-Symbol falls vorhanden).
- Speicherung des Formats im NVRAM.

## 5. Speichern, Abbrechen, Timeout
- `OK`: Zeit in **RTC** schreiben; **Feedback**: LED blinkt 200 ms.
- `Zurück` oder 10s ohne Eingabe: Abbruch, **alte Zeit bleibt bestehen**.
- Nach Abschluss → Normalmodus, Sekunden laufen weiter.

## 6. Anzeige-Spezifikation
- Blinken 2 Hz ±0,5 Hz; Kontrast≥4.5:1; Ziffern min. 10 mm.
- Doppelpunkt leuchtet im Normalmodus dauerhaft, im Einstellmodus **blinkt synchron**.
