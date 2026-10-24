-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('ola@student.merito.pl',   'Ola',   'USER',    current_timestamp),
    ('kuba@student.merito.pl',  'Kuba',  'USER',    current_timestamp),
    ('firma@example.com',       'Firma', 'PARTNER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- Konta rzeczywistych członków dwuosobowego zespołu.
insert into user_account (email, display_name, role, created_at) values
    ('wrx81895@student.wroclaw.merito.pl', 'Mateusz Masalski', 'USER', current_timestamp),
    ('wrx101024@student.wroclaw.merito.pl', 'Hubert Cichorz', 'USER', current_timestamp);

-- FIKCYJNE konto na potrzeby tymczasowej kontroli R1.03.
-- Nie reprezentuje trzeciego autora ani rzeczywistego członka zespołu.
insert into user_account (email, display_name, role, created_at) values
    ('jan.testowy@example.invalid', 'Jan Testowy (FIKCYJNY)', 'USER', current_timestamp);
-- LAB 02: fictional teaching data only. No links between tables yet.
-- ===== LAB 02 - location =====
insert into location (code, name, type, active, street, city, postal_code, country_code) values
    ('VESSEL-DEMO-01', 'Training vessel North Demo', 'VESSEL', true, null, 'Bergen', null, 'NO'),
    ('STATION-DEMO-01', 'Training fire station', 'FIRE_STATION', true, 'Training Street 10', 'Training City', '00-000', 'PL'),
    ('STORE-DEMO-01', 'Service training warehouse', 'WAREHOUSE', false, null, null, null, null);

-- ===== LAB 02 - equipment =====
-- replacement_cost: illustrative replacement value in PLN, not a commercial quote.
insert into equipment (serial_number, name, manufacturer, commissioned_on, active, replacement_cost) values
    ('DEMO-EXT-001', 'Training powder extinguisher 6 kg', 'Demo Safety', '2025-03-01', true, 250.00),
    ('DEMO-PUMP-002', 'Training portable fire pump', 'Demo Pumps', '2024-06-15', true, 12500.00),
    ('DEMO-BA-003', 'Training breathing apparatus', null, '2023-09-10', false, 8900.00);

-- ===== LAB 02 - inspection_order =====
insert into inspection_order (order_number, scheduled_on, status, estimated_minutes, notes) values
    ('DEMO-2026-001', '2026-10-20', 'COMPLETED', 45, 'Fictional completed inspection for class.'),
    ('DEMO-2026-002', '2026-10-24', 'IN_PROGRESS', 90, 'Fictional ongoing inspection for class.'),
    ('DEMO-2026-003', '2026-11-05', 'PLANNED', 60, null);
