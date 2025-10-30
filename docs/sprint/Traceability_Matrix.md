
# Traceability Matrix

| Requirement-ID | Jira-Issue  | Komponente(n)                         | Klasse(n) / Modul                    | Schnittstelle(n)                 | Testfall(e) |
|----------------|-------------|----------------------------------------|--------------------------------------|----------------------------------|-------------|
| 1.1            | TIME-01     | UserInterface, TimeSetLogic            | SetButtonHandler, TimeSetController  | onSetLongPress()                 | FT-01       |
| 1.2            | TIME-02     | TimeSetLogic, DeviceAbstraction, TimePersistence | TimeSetController, RtcWriter | saveTime()                     | FT-02       |
| 1.3            | TIME-03     | TimeSetLogic                           | TimeSetController                    | cancelEdit()                     | FT-03       |
| 2.1            | TIME-04     | UserInterface, TimeSetLogic            | HourField, IncDecService             | incHour(), decHour()             | FT-04       |
| 2.2            | TIME-05     | UserInterface, TimeSetLogic            | FieldSelector                        | selectMinutes()                  | FT-05       |
| 2.3            | TIME-06     | UserInterface, TimeSetLogic            | MinuteField, IncDecService           | incMinute(), decMinute()         | FT-06       |
| 3.1            | TIME-08     | DeviceAbstraction, TimePersistence     | RtcWriter, PersistenceService        | writeRTC(), loadRTC()            | FT-07       |
| 3.2            | TIME-09     | TimeSetLogic, TimePersistence          | TimeBackupStore, TimeSetController   | restorePrevious()                | FT-08       |
| 4.3            | TIME-12     | UserInterface                          | BlinkController                      | setActiveFieldBlink()            | UI-01       |
| NF 1.1         | TIME-NF01   | UserInterface, TimeSetLogic            | InputDebounce, EventDispatcher       | –                                | NF-01       |
| NF 1.2         | TIME-NF02   | UserInterface                          | InputDebounce                        | –                                | NF-02       |
| NF 3.2         | TIME-NF07   | TimePersistence, DeviceAbstraction     | NonVolatileStore                     | storeSettings()                  | NF-03       |
