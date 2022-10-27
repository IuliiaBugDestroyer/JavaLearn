create table if not exists countries
(
    id           integer generated always as identity
        constraint countries_pk
            primary key,
    name         varchar(500) not null,
    abbreviation char(3)      not null
);

alter table countries
    owner to postgres;

create table if not exists pilots
(
    id                     integer generated always as identity
        constraint pilots_pk
            primary key,
    first_name             varchar(500) not null,
    last_name              varchar(500) not null,
    birthdate              date         not null,
    citizenship_country_id integer      not null
        constraint pilots_countries_null_fk
            references countries
);

alter table pilots
    owner to postgres;

create table if not exists teams
(
    id         integer generated always as identity
        constraint teams_pk
            primary key,
    name       varchar(200) not null,
    country_id integer      not null
        constraint teams_countries_null_fk
            references countries
);

alter table teams
    owner to postgres;

create table if not exists pilots_teams_assignment
(
    pilot_id   integer not null
        constraint pilots_teams_assignment_pilots_fk
            references pilots,
    team_id    integer not null
        constraint pilots_teams_assignment_teams_null_fk
            references teams,
    start_date date    not null,
    end_date   date
);

alter table pilots_teams_assignment
    owner to postgres;

create unique index if not exists pilots_teams_assignment_unique_ix
    on pilots_teams_assignment (pilot_id, team_id, start_date, end_date);

create table if not exists grand_prix
(
    id         integer generated always as identity
        constraint grand_prix_pk
            primary key,
    name       varchar(300) not null,
    country_id integer      not null
        constraint grand_prix_countries_fk
            references countries
);

alter table grand_prix
    owner to postgres;

create table if not exists race_type
(
    id   smallint generated always as identity
        constraint race_type_pk
            primary key,
    name varchar(50) not null
);

alter table race_type
    owner to postgres;

create table if not exists race_schedule
(
    id            bigint generated always as identity
        constraint race_schedule_pk
            primary key,
    grand_prix_id smallint                 not null
        constraint race_schedule_grand_prix_fk
            references grand_prix,
    datetime      timestamp with time zone not null,
    race_type_id  smallint                 not null
        constraint race_schedule_race_type_fk
            references race_type
);

alter table race_schedule
    owner to postgres;

create table if not exists race_results
(
    race_schedule_id bigint   not null
        constraint race_results_race_schedule_fk
            references race_schedule,
    pilot_id         integer  not null
        constraint race_results_pilots_fk
            references pilots,
    place            smallint not null,
    race_time        interval
);

alter table race_results
    owner to postgres;

create unique index if not exists race_results_unique_ix
    on race_results (race_schedule_id desc, pilot_id asc, place asc, race_time asc);

