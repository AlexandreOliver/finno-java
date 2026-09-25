create table users
(
    id         uuid
        constraint users_pk
            primary key,
    name       varchar(100) not null,
    email      varchar(120) not null
        constraint unique_email
            unique,
    password   varchar(72)  not null,
    created_at timestamp    not null,
    updated_at timestamp    not null
);

comment on table users is 'usuarios do sistema';