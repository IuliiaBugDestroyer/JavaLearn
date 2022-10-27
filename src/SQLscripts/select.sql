SELECT p.first_name, p.last_name, age(p.birthdate) FROM pilots p
WHERE extract(YEAR FROM age(p.birthdate)) BETWEEN 22 AND 25;

select rs.place, p.first_name || ' ' || p.last_name as pilot, c.abbreviation as pilot_country, t.name as team, rs.race_time from race_results rs
inner join race_schedule sch on sch.id = rs.race_schedule_id
inner join grand_prix gp on gp.id = sch.grand_prix_id
inner join race_type rt on rt.id = sch.race_type_id
inner join pilots p on p.id = rs.pilot_id
inner join countries c on c.id = p.citizenship_country_id
inner join pilots_teams_assignment pta on (p.id = pta.pilot_id and sch.datetime BETWEEN pta.start_date AND pta.end_date)
inner join teams t on t.id = pta.team_id
where rt.name = 'Race'
  and gp.name = 'Australia Grand Prix'
order by rs.place;

SELECT sum(n_tup_ins - n_tup_del) FROM pg_stat_all_tables
WHERE schemaname = 'public';