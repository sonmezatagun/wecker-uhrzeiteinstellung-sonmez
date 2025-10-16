<style>
  .muss { background-color: rgba(51,170,51,.4) }
  .soll { background-color: rgba(255,174,0,.4) }
  .kann { background-color: rgba(170,51,51,.4) }
</style>

# Requirements: Uhrzeiteinstellung für Wecker

**Legende:** <p class="muss">Muss</p> <p class="soll">Soll</p> <p class="kann">Kann</p>



## 1. Funktionale Requirements

<table>
  <thead>
    <tr><th>Nr.</th><th>Jira-Referenz</th><th>Titel</th><th>Beschreibung</th></tr>
  </thead>
  <tbody>
    <tr class="muss"><td>1.1</td><td>TIME-01</td><td>Einstellmodus starten</td><td>Durch Drücken (≥2 s) der SET-Taste wird der Einstellmodus für die Uhrzeit gestartet.</td></tr>
    <tr class="muss"><td>1.2</td><td>TIME-02</td><td>Einstellmodus beenden (Speichern)</td><td>Mit OK wird gespeichert und zum Normalmodus gewechselt.</td></tr>
    <tr class="muss"><td>1.3</td><td>TIME-03</td><td>Einstellmodus abbrechen</td><td>Mit Zurück oder nach 10 s Inaktivität wird abgebrochen (ohne Speichern).</td></tr>
    <tr class="muss"><td>2.1</td><td>TIME-04</td><td>Stunden einstellen</td><td>↑ erhöht, ↓ verringert die Stunden (0–23). Überlauf 23↑→00, 00↓→23.</td></tr>
    <tr class="muss"><td>2.2</td><td>TIME-05</td><td>Zu Minuten wechseln</td><td>Kurzer SET-Druck wechselt von Stunden zu Minuten.</td></tr>
    <tr class="muss"><td>2.3</td><td>TIME-06</td><td>Minuten einstellen</td><td>↑ erhöht, ↓ verringert Minuten (0–59). Überlauf 59↑→00, 00↓→59.</td></tr>
    <tr class="soll"><td>2.4</td><td>TIME-07</td><td>Schnelllauf</td><td>Tastendruck (≥1 s) bewirkt Schnelllauf (≥5 Schritte/s).</td></tr>
    <tr class="muss"><td>3.1</td><td>TIME-08</td><td>Persistentes Speichern</td><td>Gespeicherte Uhrzeit wird in die RTC geschrieben und bleibt nach Stromverlust erhalten.</td></tr>
    <tr class="muss"><td>3.2</td><td>TIME-09</td><td>Rückgängig bei Abbruch</td><td>Bei Abbruch/Timeout bleibt die vorherige Uhrzeit vollständig erhalten.</td></tr>
    <tr class="soll"><td>4.1</td><td>TIME-10</td><td>12/24-h-Umschaltung</td><td>Im Einstellmodus kann zwischen 12-/24-h-Format umgeschaltet werden (↑+↓ ≥1 s).</td></tr>
    <tr class="kann"><td>4.2</td><td>TIME-11</td><td>AM/PM-Anzeige</td><td>Im 12-h-Modus wird AM/PM angezeigt.</td></tr>
    <tr class="soll"><td>4.3</td><td>TIME-12</td><td>Aktives Feld blinkt</td><td>Die aktive Stelle (Stunden oder Minuten) blinkt zur Orientierung.</td></tr>
    <tr class="soll"><td>5.1</td><td>TIME-13</td><td>Feedback beim Speichern</td><td>Nach dem Speichern erfolgt ein kurzes optisches/akustisches Feedback (~200 ms).</td></tr>
    <tr class="kann"><td>5.2</td><td>TIME-14</td><td>Display-Dimmung</td><td>Nach 30 s Inaktivität wird die Displayhelligkeit reduziert.</td></tr>
  </tbody>
</table>



## 2. Nicht-funktionale Requirements

<table>
  <thead>
    <tr><th>Nr.</th><th>Jira-Referenz</th><th>Titel</th><th>Beschreibung</th></tr>
  </thead>
  <tbody>
    <tr class="muss"><td>1.1</td><td>TIME-NF01</td><td>Reaktionszeit</td><td>Tastenreaktion ≤ 200 ms.</td></tr>
    <tr class="muss"><td>1.2</td><td>TIME-NF02</td><td>Entprellung</td><td>Tastenentprellung 30–50 ms.</td></tr>
    <tr class="soll"><td>2.1</td><td>TIME-NF03</td><td>Blinkfrequenz</td><td>Aktives Feld blinkt mit 2 Hz ±0,5 Hz.</td></tr>
    <tr class="soll"><td>2.2</td><td>TIME-NF04</td><td>Lesbarkeit</td><td>Kontrast der Anzeige ≥ 4.5:1; Ziffernhöhe ≥ 10 mm.</td></tr>
    <tr class="soll"><td>2.3</td><td>TIME-NF05</td><td>Sprache</td><td>Texte/Labels auf Deutsch.</td></tr>
    <tr class="soll"><td>3.1</td><td>TIME-NF06</td><td>RTC-Genauigkeit</td><td>Zeitabweichung ≤ ±20 ppm (~±50 s/Monat).</td></tr>
    <tr class="muss"><td>3.2</td><td>TIME-NF07</td><td>Dauerhafte Speicherung</td><td>Einstellungen überstehen Batteriewechsel.</td></tr>
    <tr class="kann"><td>4.1</td><td>TIME-NF08</td><td>Barrierefreiheit</td><td>Anzeige ist für Farbenblinde/Sehschwache gut erkennbar.</td></tr>
    <tr class="soll"><td>5.1</td><td>TIME-NF09</td><td>Energieeffizienz</td><td>Uhrzeiteinstellung beeinflusst die Batterielaufzeit nur minimal.</td></tr>
  </tbody>
</table>



## 3. Abhängigkeiten zwischen Requirements

| Requirement-Nr.       | Zusammenhang / Abhängigkeit                                                                  |
|-------------------------|----------------------------------------------------------------------------------------------|
| 1.1 → 2.*, 3.*, 4.* | Einstellmodus (1.1) ist Voraussetzung für Einstellen, Speichern und Formatwechsel.           |
| 2.1, 2.3 → 3.1          | Änderungen (2.1/2.3) müssen gespeichert werden können (3.1).                                 |
| 1.2, 1.3 → 3.2          | Beenden/Abbruch (1.2/1.3) bestimmen, ob alte Zeit erhalten bleibt (3.2).                     |
| 4.1 → 4.2               | AM/PM-Anzeige (4.2) ist nur im 12-h-Modus (4.1) relevant.                                    |
| 5.1 → 1.2               | Feedback (5.1) wird beim erfolgreichen Speichern (1.2) ausgelöst.                            |
| NF01 ↔ NF02             | Reaktionszeit (≤200 ms) setzt gut gewählte Entprellung (30–50 ms) voraus.                      |



## 4. Konflikte zwischen Requirements

| Requirement-Nr. | Konfliktbeschreibung                                                                       |
|-----------------|--------------------------------------------------------------------------------------------|
| 2.2/2.3 ↔ NF03  | Hohes Blinktempo darf die Lesbarkeit nicht verschlechtern.                                 |
| 5.2 ↔ NF09      | Display-Dimmung spart Energie, darf die Bedienbarkeit jedoch nicht beeinträchtigen.        |
| NF01 ↔ NF09     | Sehr schnelle Aktualisierung kann den Energieverbrauch erhöhen.                            |



## 5. Zusammengehörigkeiten

| Requirements | Begründung                                                                                                 |
|--------------|------------------------------------------------------------------------------------------------------------|
| 2.1–2.4      | Einstellen der Uhrzeit (Stunden/Minuten + Schnelllauf) bildet eine zusammenhängende Bedienfolge.           |
| 1.2, 3.1, 5.1| Speichern mit Feedback gehört zur Abschlussinteraktion des Einstellmodus.                                  |
| 4.1–4.2–4.3  | Formatwahl, AM/PM und Blinkanzeige betreffen die Darstellung/Orientierung für die Nutzer*innen.            |
