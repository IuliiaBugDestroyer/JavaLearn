UPDATE race_schedule SET datetime = '2015-04-19 17:00:00.000 +03:00' WHERE grand_prix_id = (SELECT id FROM grand_prix WHERE name = '') and race_type_id = (SELECT id FROM race_type WHERE name = 'Race')