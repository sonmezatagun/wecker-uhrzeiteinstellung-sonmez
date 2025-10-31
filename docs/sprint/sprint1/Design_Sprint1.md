# Design – Sprint 1

Ausgehend von der Architektur (UI → Logic → Device → Persistence) werden für Sprint 1 folgende Design-Komponenten verwendet:

## 1. UI
- **InputHandler**: empfängt Tastenereignisse (Mode, Plus, Minus, OK, Cancel) und ruft den Controller auf.
- **DisplayAdapter**: zeigt aktuellen Einstellzustand (Stunde/Minute) und Normalanzeige.

## 2. Logik
- **TimeSetController**: zentrale Logik zum Betreten/Verlassen des Einstellmodus, Delegation an Display und Repository.
- **TimeSetState**: merkt sich, ob Stunde oder Minute editiert wird.
- **TimeoutHandler**: erkennt Inaktivität und löst Auto-Timeout aus.

## 3. Device-Abstraction
- **ButtonDriver**: abstrahiert physische Buttons → InputHandler
- **DisplayDriver**: nimmt formatierte Ausgaben aus DisplayAdapter entgegen.

## 4. Persistence
- **TimeRepository**: speichert die eingestellte Uhrzeit dauerhaft.

